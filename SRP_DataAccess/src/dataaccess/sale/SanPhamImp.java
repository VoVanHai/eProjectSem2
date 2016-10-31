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
        String sql = "insert into SAN_PHAM values(?,?,?,?,?,?,?,?,?,1)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaSP());
        ps.setString(2, dao.getTenSP());
        ps.setString(2, dao.getGiaSP());
        ps.setString(4, dao.getMotaSP());
        ps.setString(5, dao.getMaNCC());
        ps.setString(6, dao.getNhaSX());
        ps.setString(7, dao.getHinhAnh());
        ps.setDate(8, new java.sql.Date(dao.getNgaySX().getTime()));
        ps.setDate(9, new java.sql.Date(dao.getHanSuDung().getTime()));
        

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
        String sql = "update SAN_PHAM set TenSP =? , MotaSP =? , MaNCC = ? ,NhaSX =?,HinhAnh=?,NgaySX=?,HanSuDung = ?" + " where MaSP=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getTenSP());
        ps.setString(2, dao.getGiaSP());
        ps.setString(3, dao.getMotaSP());
        ps.setString(4, dao.getMaNCC());
        ps.setString(5, dao.getNhaSX());
        ps.setString(6, dao.getHinhAnh());
        ps.setDate(7,new java.sql.Date(dao.getNgaySX().getTime()));
        ps.setDate(8, new java.sql.Date(dao.getHanSuDung().getTime()));
        ps.setString(9, dao.getMaSP());
    
        return ps.executeUpdate() > 0;
    
    }
    @Override
    public SanPham find(SanPham dao) throws Exception {
        String MaSP;
        String sql = "select * form SAN_PHAM where MaSP = ?" + " where TrangThai = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaSP());
        ResultSet rs = ps.executeQuery();
        SanPham sp = null;
        if (rs.next()) {
            sp = new SanPham(rs.getString("MaSP"), 
                    rs.getString("TenSP"), 
                    rs.getString("MotaSP"), 
                    rs.getString("Gia"),
                    rs.getString("MaNCC"), 
                    rs.getString("NhaSX"),
                    rs.getString("HinhAnh"),
                    rs.getDate("NgaySX"),
                    rs.getDate("HanSuDung"));
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
                    rs.getString("Gia"),
                    rs.getString("MaNCC"), 
                    rs.getString("NhaSX"),
                    rs.getString("HinhAnh"),
                    rs.getDate("NgaySX"),
                    rs.getDate("HanSuDung"));
            lst.add(sp);
        }
        return lst;
    }

    @Override
    public void close() throws Exception {
        if(con != null){
            con.close();
        }
    }


}
