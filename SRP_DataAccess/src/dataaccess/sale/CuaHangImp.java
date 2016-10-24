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
import sale.CuaHang;

/**
 *
 * @author Trương Hồng Đoàn
 */
public class CuaHangImp implements NhomBanHangDAO<CuaHang> {
private Connection con ;

    public CuaHangImp() throws Exception{
        con = ConnectionFactory.getInstance().getConection();
    }
    @Override
    public boolean add(CuaHang dao) throws Exception {
        String sql = "insert into CUA_HANG values (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaCuaHang());
        ps.setString(2, dao.getTenCuaHang());
        ps.setString(3, dao.getDiaChi());
        ps.setString(3, dao.getSoDT());
        ps.setString(4, dao.getGhiChu());
        ps.setInt(4, dao.getTrangThai());
        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(CuaHang dao) throws Exception {
String sql = "UPDATE CUA_HANG" +" SET TrangThai = 0" +" WHERE MaCuaHang=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaCuaHang());
        return ps.executeUpdate() > 0;
    }

    @Override
    public CuaHang find(CuaHang dao) throws Exception {
        String msHinh;
        String sql = "select * form CUA_HANG where MaCuaHang = ?" + " where TrangThai = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaCuaHang());
        ResultSet rs = ps.executeQuery();
        CuaHang ch = null;
        if (rs.next()) {
            ch = new CuaHang(rs.getString("MaCuaHang"), rs.getString("TenCuaHang"), rs.getString("DiaChi"), rs.getString("SoDT"), rs.getString("GhiChu"), rs.getInt("TrangThai"));
        }
        return ch;
    }

    @Override
    public boolean update(CuaHang dao) throws Exception {
        String sql = "update CUA_HANG set MaCuaHang = ? ,TenCuaHang = ? , GhiChu = ?  , DiaChi = ?   , SoDT = ? , TrangThai = ?" + " where MaCuaHang = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaCuaHang());
        ps.setString(2, dao.getTenCuaHang());
        ps.setString(3, dao.getDiaChi());
        ps.setString(3, dao.getSoDT());
        ps.setString(4, dao.getGhiChu());
        ps.setInt(4, dao.getTrangThai());
       return ps.executeUpdate() > 0;
    }

    @Override
    public ArrayList<CuaHang> getAll() throws Exception {
        ArrayList<CuaHang> lst = new ArrayList<>();
        String sql = "select * from CUA_HANG" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            CuaHang ch = new CuaHang(rs.getString("MaCuaHang"), rs.getString("TenCuaHang"), rs.getString("DiaChi"), rs.getString("SoDT"), rs.getString("GhiChu"), rs.getInt("TrangThai"));
            lst.add(ch);
        }
        return lst;
    }

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
