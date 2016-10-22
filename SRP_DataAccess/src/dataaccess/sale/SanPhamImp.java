/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.sale;

import dataaccess.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import sale.SanPham;

/**
 *
 * @author VINH MARK
 */
public class SanPhamImp implements NhomBanHangDAO<SanPham> {

    private Connection con;

    public SanPhamImp() throws Exception {
        con = ConnectionFactory.getInstance().getConection();
    }

    @Override
    public boolean add(SanPham dao) throws Exception {
        String sql = "insert into SAN_PHAM values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaSP());
        ps.setString(2, dao.getTenSP());
        ps.setString(3, dao.getMotaSP());
        ps.setString(4, dao.getMaNCC());
        ps.setString(5, dao.getNhaSX());
        ps.setString(6, dao.getHinhAnh());
        ps.setDate(7, dao.getNgaySX());
        ps.setDate(8, dao.getHanSuDung());
        ps.setInt(9, dao.getTrangThai());

        return ps.executeUpdate() > 0;

    }

    @Override
    public boolean remove(SanPham dao) throws Exception {
        String sql = "UPDATE SAN_PHAM" +" SET TinhTrang = 0" +" WHERE MaSP=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaSP());
        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean update(SanPham dao) throws Exception {
        String sql = "update SAN_PHAM set TenSP =? , MotaSP =? , MaNCC = ? ,NhaSX =?,HinhAnh=?,NgaySX=?,HanSuDung = ? ,TinhTrang = ? " + " where MaSP=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getTenSP());
        ps.setString(2, dao.getMotaSP());
        ps.setString(3, dao.getMaNCC());
        ps.setString(4, dao.getNhaSX());
        ps.setString(5, dao.getHinhAnh());
        ps.setDate(6, dao.getNgaySX());
        ps.setDate(7, dao.getHanSuDung());
        ps.setInt(8, dao.getTrangThai());
        ps.setString(9, dao.getMaSP());
    
        return ps.executeUpdate() > 0;
    
    }
    @Override
    public SanPham find(SanPham dao) throws Exception {
        String MaSP;
        String sql = "select * form SAN_PHAM where MaSP = ?" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaSP());
        ResultSet rs = ps.executeQuery();
        SanPham sp = null;
        if (rs.next()) {
            sp = new SanPham(rs.getString("MaSP"), 
                    rs.getString("TenSP"), 
                    rs.getString("MotaSP"), 
                    rs.getString("MaNCC"), 
                    rs.getString("NhaSX"),
                    rs.getString("HinhAnh"),
                    rs.getDate("NgaySX"),
                    rs.getDate("HanSuDung"),
                    rs.getInt("TrangThai"));
        }
        return sp;
    }

    @Override
    public ArrayList<SanPham> getAll() throws Exception {
        ArrayList<SanPham> lst = new ArrayList<>();
        String sql = "select * from SAN_PHAM" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            SanPham sp = new SanPham(rs.getString("MaSP"), 
                    rs.getString("TenSP"), 
                    rs.getString("MotaSP"), 
                    rs.getString("MaNCC"), 
                    rs.getString("NhaSX"),
                    rs.getString("HinhAnh"),
                    rs.getDate("NgaySX"),
                    rs.getDate("HanSuDung"),
                    rs.getInt("TrangThai"));
            lst.add(sp);
        }
        return lst;
    }

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
