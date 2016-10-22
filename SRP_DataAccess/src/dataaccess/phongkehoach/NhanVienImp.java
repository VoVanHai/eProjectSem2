/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.phongkehoach;

/**
 *
 * @author WIN7
 */
import dataaccess.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import phongkehoach.Nhan_Vien;
public class NhanVienImp implements PhongKeHoachDAO<Nhan_Vien>{
    private Connection con;

    public NhanVienImp() throws Exception {
        con = ConnectionFactory.getInstance().getConection();
    }
    @Override
    public boolean add(Nhan_Vien dao) throws Exception {
        String sql = "insert into NHAN_VIEN values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaNV());
        ps.setString(2, dao.getTenNV());
        ps.setString(3, dao.getSDT());
        ps.setString(4, dao.getDiaChi());
        ps.setString(5, dao.getSoCMND());
        ps.setString(6, dao.getQueQuan());
        ps.setString(7, dao.getEmail());
        ps.setString(8, dao.getMaCV());
        ps.setString(9, dao.getMaPB());
        ps.setString(10, dao.getGhiChu());
        ps.setInt(11, dao.getTrangThai());
        ps.setDate(12, dao.getNgaySinh());
        ps.setDate(13, dao.getNgayBDLamViec());

        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(Nhan_Vien dao) throws Exception {
        String sql = "UPDATE NHAN_VIEN" +" SET TrangThai = 0" +" WHERE MaNV=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaNV());
        return ps.executeUpdate() > 0;
    }

    @Override
    public Nhan_Vien find(Nhan_Vien dao) throws Exception {
        String sql = "select * form NHAN_VIEN where MaNV = ?" + " where TrangThai = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaNV());
        ResultSet rs = ps.executeQuery();
        Nhan_Vien nv = null;
        if (rs.next()) {
            nv = new Nhan_Vien(rs.getString("MaNV"), 
                    rs.getString("TenNV"), 
                    rs.getString("SDT"), 
                    rs.getString("DiaChi"), 
                    rs.getString("SoCMND"),
                    rs.getString("QueQuan"),
                    rs.getString("Email"),
                    rs.getString("MaCV"),
                    rs.getString("MaPB"),
                    rs.getString("GhiChu"),
                    rs.getInt("TrangThai"),
                    rs.getDate("NgaySinh"),
                    rs.getDate("NgayBDLamviec"));
        }
        return nv;
    }

    @Override
    public boolean update(Nhan_Vien dao) throws Exception {
        String sql = "update NHAN_VIEN set TenNV =? , SDT =? , DiaChi = ? ,SoCMND =?,QueQuan=?,Email=?,MaCV = ? ,MaPB = ?,GhiChu= ?,TrangThai= ?,NgaySinh= ?,NgayBDLamviec= ? "
                + " where MaNV=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getTenNV());
        ps.setString(2, dao.getSDT());
        ps.setString(3, dao.getDiaChi());
        ps.setString(4, dao.getSoCMND());
        ps.setString(5, dao.getQueQuan());
        ps.setString(6, dao.getEmail());
        ps.setString(7, dao.getMaCV());
        ps.setString(8, dao.getMaPB());
        ps.setString(9, dao.getGhiChu());
        ps.setInt(10, dao.getTrangThai());
        ps.setDate(11, dao.getNgaySinh());
        ps.setDate(12, dao.getNgayBDLamViec());
        ps.setString(13, dao.getMaNV());
    
        return ps.executeUpdate() > 0;
    }

    @Override
    public ArrayList<Nhan_Vien> getAll() throws Exception {
        ArrayList<Nhan_Vien> lst = new ArrayList<>();
        String sql = "select * from NHAN_VIEN" + " where TrangThai = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Nhan_Vien nv = new Nhan_Vien(rs.getString("MaNV"), 
                    rs.getString("TenNV"), 
                    rs.getString("SDT"), 
                    rs.getString("DiaChi"), 
                    rs.getString("SoCMND"), 
                    rs.getString("QueQuan"),
                    rs.getString("Email"),
                    rs.getString("MaCV"),
                    rs.getString("MaPB"),
                    rs.getString("GhiChu"),
                    rs.getInt("TrangThai"),
                    rs.getDate("NgaySinh"),
                    rs.getDate("NgayBDLamviec"));
            lst.add(nv);
        }
        return lst;
    }
    
}
