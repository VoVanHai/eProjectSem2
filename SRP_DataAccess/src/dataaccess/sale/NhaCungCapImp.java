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
import sale.NhaCungCap;

/**
 *
 * @author Trương Hồng Đoàn
 */
public class NhaCungCapImp implements NhomBanHangDAO<NhaCungCap> {

    private Connection con;

    public NhaCungCapImp() throws Exception {
        con = ConnectionFactory.getInstance().getConection();
    }

    @Override
    public boolean add(NhaCungCap dao) throws Exception {
        String sql = "insert into NHA_CUNG_CAP values (?,?,?,?,?,?,?,1)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getTenNCC());
        ps.setString(2, dao.getMaNCC());
        ps.setString(3, dao.getDiaChi());
        ps.setString(4, dao.getSDT());
        ps.setString(5, dao.getEmail());
        ps.setString(6, dao.getTenNguoiDaiDien());
        ps.setString(7, dao.getGhiChu());

        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(NhaCungCap dao) throws Exception {
        String sql = "UPDATE NHA_CUNG_CAP" + " SET TrangThai = 0" + " WHERE MaNCC=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaNCC());
        return ps.executeUpdate() > 0;
    }

    @Override
    public NhaCungCap find(NhaCungCap dao) throws Exception {
        String msHinh;
        String sql = "select * form NHA_CUNG_CAP where MaNCC = ?" + " where TrangThai = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaNCC());
        ResultSet rs = ps.executeQuery();
        NhaCungCap ncc = null;
        if (rs.next()) {
            ncc = new NhaCungCap(rs.getString("MaNCC"), 
                    rs.getString("TenNCC"), 
                    rs.getString("DiaChi"),
                    rs.getString("SDT"), 
                    rs.getString("Email"), 
                    rs.getString("TenNguoiDaiDien"),
                    rs.getString("GhiChu"));
        }
        return ncc;
    }

    @Override
    public boolean update(NhaCungCap dao) throws Exception {
        String sql = "update NHA_CUNG_CAP set TenNCC = ? ,MaNCC = ? , GhiChu = ?" + " where MaNCC = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getTenNCC());
        ps.setString(2, dao.getMaNCC());
        ps.setString(3, dao.getDiaChi());
        ps.setString(3, dao.getSDT());
        ps.setString(3, dao.getEmail());
        ps.setString(3, dao.getTenNguoiDaiDien());
        ps.setString(4, dao.getGhiChu());

        return ps.executeUpdate() > 0;
    }

    @Override
    public ArrayList<NhaCungCap> getAll() throws Exception {
        ArrayList<NhaCungCap> lst = new ArrayList<>();
        String sql = "select MaNCC from NHA_CUNG_CAP" + " where TrangThai = 1 ";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            NhaCungCap ncc = new NhaCungCap(rs.getString("MaNCC"));
            lst.add(ncc);
        }
        return lst;
    }

    public void close() throws Exception {
        if (con != null) {
            con.close();
        }
    }

}
