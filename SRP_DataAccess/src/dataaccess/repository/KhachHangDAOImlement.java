/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.repository;

import dataaccess.factory.ConnectionFactory;
import repository.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author TrungChi
 */
public class KhachHangDAOImlement implements KhachHangDAO{
    private Connection con;
    public KhachHangDAOImlement() throws Exception{
        con = ConnectionFactory.getInstance().getConection();
    }
    
    @Override
    public boolean add(KhachHang KH) throws Exception {
        String sql = "INSERT INTO KHACH_HANG(?, ?, ?, ?, ?, ? , ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, KH.getMaKH());
        ps.setString(2, KH.getTenKH());
        ps.setString(3, KH.getSoDT());
        ps.setString(4, KH.getDiaChi());
        ps.setString(5, KH.getCongViec());
        ps.setString(6, KH.getSoCMND());
        ps.setString(7, KH.getGioiTinh());
        ps.setString(8, KH.getLoaiTK());
        ps.setString(9, KH.getGhiChu());
        ps.setInt(10, KH.getTrangThai());
        
        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(String MaKH) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(KhachHang newKH) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<KhachHang> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public KhachHang searchByID(String MaKH) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<KhachHang> searchAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
