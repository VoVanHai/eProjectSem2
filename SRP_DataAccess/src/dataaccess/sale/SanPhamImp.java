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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sale.SanPham;

/**
 *
 * @author VINH MARK
 */
public class SanPhamImp implements NhomBanHangDAO<SanPham> {

    private Connection con;

    public SanPhamImp() {
        try {
            con = ConnectionFactory.getInstance().getConection();
        } catch (Exception ex) {
            Logger.getLogger(SanPhamImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean add(SanPham dao) throws Exception {
        String sql = "insert into SAN_PHAM values(?,?,?,?,?,?,?,?,?,1)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaSP());
        ps.setString(2, dao.getTenSP());
        ps.setInt(3, dao.getGiaSP());
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
        String sql = "UPDATE SAN_PHAM" + " SET TrangThai = 0" + " WHERE MaSP=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaSP());
        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean update(SanPham dao) throws Exception {
        String sql = "update SAN_PHAM set TenSP =? , MotaSP =? , MaNCC = ? ,NhaSX =?,HinhAnh=?,NgaySX=?,HanSuDung = ?" + " where MaSP=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getTenSP());
        ps.setInt(2, dao.getGiaSP());
        ps.setString(3, dao.getMotaSP());
        ps.setString(4, dao.getMaNCC());
        ps.setString(5, dao.getNhaSX());
        ps.setString(6, dao.getHinhAnh());
        ps.setDate(7, new java.sql.Date(dao.getNgaySX().getTime()));
        ps.setDate(8, new java.sql.Date(dao.getHanSuDung().getTime()));
        ps.setString(9, dao.getMaSP());

        return ps.executeUpdate() > 0;

    }

    @Override
    public SanPham find(SanPham dao) throws Exception {
        String MaSP;
        String sql = "select * from SAN_PHAM where MaSP = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaSP());
        ResultSet rs = ps.executeQuery();
        SanPham sp = new SanPham();
        while (rs.next()) {

            sp.setMaSP(rs.getString("MaSP"));
            sp.setTenSP(rs.getString("TenSP"));
            sp.setGiaSP(rs.getInt("Gia"));
            sp.setMotaSP(rs.getString("MotaSP"));
            sp.setMaNCC(rs.getString("MaNCC"));
            sp.setNhaSX(rs.getString("NhaSX"));
            sp.setHinhAnh(rs.getString("HinhAnh"));
            sp.setNgaySX(Happy.Add(rs.getDate("NgaySX"), 2));
            sp.setHanSuDung(Happy.Add(rs.getDate("HanSuDung"), 2));

        }
        return sp;
    }

    @Override
    public ArrayList<SanPham> getAll() throws Exception {
        ArrayList<SanPham> lst = new ArrayList<>();
        String sql = "select * from SAN_PHAM" + " where TrangThai = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            SanPham sp = new SanPham(rs.getString("MaSP"),
                    rs.getString("TenSP"),
                    rs.getInt("Gia"),
                    rs.getString("MotaSP"),
                    rs.getString("MaNCC"),
                    rs.getString("NhaSX"),
                    rs.getString("HinhAnh"),
                    rs.getDate("NgaySX"),
                    rs.getDate("HanSuDung"));
            lst.add(sp);
        }
        return lst;
    }

    public void close() throws Exception {
        if (con != null) {
            con.close();
        }
    }

    public List<SanPham> findllday(int month, int year) {
        List<SanPham> sp = new ArrayList<SanPham>();
        try {
            String sql = "select MaSP,TenSP, Gia, MotaSP, MaNCC,NhaSX,HinhAnh \n"
                    + "from SAN_PHAM \n"
                    + "where month(HanSuDung)= ? and year(HanSuDung) = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, month);
            ps.setInt(2, year);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham s = new SanPham();
                s.setMaSP(rs.getString("MaSP"));
                s.setTenSP(rs.getString("TenSP"));
                s.setGiaSP(rs.getInt("Gia"));
                s.setMaNCC(rs.getString("MaNCC"));
                s.setNhaSX(rs.getString("NhaSX"));
                s.setHinhAnh(rs.getString("HinhAnh"));
                s.setNgaySX(Happy.Add(rs.getDate("Date"), 2));
                s.setHanSuDung(Happy.Add(rs.getDate("Date"), 2));
                sp.add(s);
            }
        } catch (Exception e) {
            return sp = null;

        }

        return sp;
    }
}
