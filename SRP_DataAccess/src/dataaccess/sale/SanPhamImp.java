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
        String sql = "insert into SAN_PHAM values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaSP());
        ps.setString(2, dao.getTenSP());
        ps.setString(3, dao.getMotaSP());
        ps.setString(4, dao.getMaNCC());
        ps.setString(5, dao.getKhoiLuong());
        ps.setString(6, dao.getKichThuocSP());
        ps.setString(7, dao.getMauSac());
        ps.setString(8, dao.getThanhPhan());
        ps.setString(9, dao.getNhaSX());
        ps.setDate(10, dao.getNgaySX());
        ps.setDate(11, dao.getHanSuDung());
        ps.setInt(12, dao.getHinhAnh());
        ps.setInt(13, dao.getTinhTrang());

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
        String sql = "update SAN_PHAM set TenSP =? , MotaSP =? , MaNCC = ? , KhoiLuong = ? ,KichThuocSP = ? , MauSac=?, ThanhPhan=?,NhaSX =?,NgaySX=?,HanSuDung = ? ,HinhAnh=?,TinhTrang = ? " + " where MaSP=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getTenSP());
        ps.setString(2, dao.getMotaSP());
        ps.setString(3, dao.getMaNCC());
        ps.setString(4, dao.getKhoiLuong());
        ps.setString(5, dao.getKichThuocSP());
        ps.setString(6, dao.getMauSac());
        ps.setString(7, dao.getThanhPhan());
        ps.setString(8, dao.getNhaSX());
        ps.setDate(9, dao.getNgaySX());
        ps.setDate(10, dao.getHanSuDung());
        ps.setInt(11, dao.getHinhAnh());
        ps.setInt(12, dao.getTinhTrang());
        ps.setString(13, dao.getMaSP());
        return ps.executeUpdate() > 0;
    }
    
    @Override
    public SanPham find(SanPham dao) throws Exception {
        String MaSP;
        String sql = "select * form SAN_PHAM where MaSP = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaSP());
        ResultSet rs = ps.executeQuery();
        SanPham sp = null;
        if (rs.next()) {
            sp = new SanPham(rs.getString("MaSP"), 
                    rs.getString("TenSP"), 
                    rs.getString("MotaSP"), 
                    rs.getString("NhaCC"), 
                    rs.getString("KhoiLuong"), 
                    rs.getString("KichThuocSP"), 
                    rs.getString("MauSac"),
                    rs.getString("ThanhPhan"),
                    rs.getString("MaNSX"),
                    rs.getDate("NgaySX"),
                    rs.getDate("HanSuDung"),
                    rs.getInt("HinhAnh"), 
                    rs.getInt("TinhTrang"));
        }
        return sp;
    }

    @Override
    public ArrayList<SanPham> getAll() throws Exception {
        ArrayList<SanPham> lst = new ArrayList<>();
        String sql = "select * from SAN_PHAM";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            SanPham sp = new SanPham(rs.getString("MaSP"), 
                    rs.getString("TenSP"), 
                    rs.getString("MotaSP"), 
                    rs.getString("NhaCC"),
                    rs.getString("KhoiLuong"),
                    rs.getString("KichThuocSP"),
                    rs.getString("MauSac"),
                    rs.getString("ThanhPhan"),
                    rs.getString("MaNSX"), 
                    rs.getDate("NgaySX"),
                    rs.getDate("HanSuDung"),
                    rs.getInt("HinhAnh"),
                    rs.getInt("TinhTrang"));
            lst.add(sp);
        }
        return lst;
    }


}
