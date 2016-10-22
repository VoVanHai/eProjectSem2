/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.repository;

import dataaccess.factory.ConnectionFactory;
import repository.KhachHang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author TrungChi
 */
public class KhachHangDAOImpl implements KhachHangDAO{
    private Connection con;
    public KhachHangDAOImpl() throws Exception{
        con = ConnectionFactory.getInstance().getConection();
    }
    
    @Override
    public boolean add(KhachHang KH) throws Exception {
        String sql = "INSERT INTO KHACH_HANG VALUES(?, ?, ?, ?, ?, ? , ?, ?, ?, ?)";
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
    public boolean remove(int trangThai, String maKH) throws Exception {
        String sql = "UPDATE KHACH_HANG SET TrangThai = ? WHERE MaKH = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, trangThai);
        ps.setString(2, maKH);
        
        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean update(String MaKH, String TenKH, String SoDT, String DiaChi, String CongViec, String SoCMND, String GioiTinh, String LoaiTK, String GhiChu, int TrangThai) throws Exception {
        String sql = "UPDATE KHACH_HANG SET TenKH = ?, SoDT = ?, DiaChi = ?, CongViec = ?, SoCMND = ?,"
                + " GioiTinh = ?, LoaiTK = ?, GhiChu = ?, TrangThai = ? "
                + "WHERE MaKH = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, TenKH);        
        ps.setString(2, SoDT);
        ps.setString(3, DiaChi);
        ps.setString(4, CongViec);
        ps.setString(5, SoCMND);
        ps.setString(6, GioiTinh);
        ps.setString(7, LoaiTK);
        ps.setString(8, GhiChu);
        ps.setInt(9, TrangThai);
        ps.setString(10, MaKH);
        
        return ps.executeUpdate() > 0;
    }

    @Override
    public ArrayList<KhachHang> getAll() throws Exception {
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM KHACH_HANG";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            KhachHang kh = new KhachHang(rs.getString("MaKH"), rs.getString("TenKH"), rs.getString("SoDT"),
                                         rs.getString("DiaChi"), rs.getString("CongViec"), rs.getString("SoCMND"),
                                         rs.getString("GioiTinh"), rs.getString("LoaiTK"), rs.getString("GhiChu"), rs.getInt("TrangThai"));
            list.add(kh);
        }
        return list;
    }

    @Override
    public KhachHang searchByID(String MaKH) throws Exception {
        String sql = "SELECT * FROM KHACH_HANG WHERE MaKH = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, MaKH);
        
        ResultSet rs = ps.executeQuery();
        KhachHang kh = null;
        while(rs.next())
        {
            kh = new KhachHang(rs.getString("MaKH"), rs.getString("TenKH"), rs.getString("SoDT"),
                                         rs.getString("DiaChi"), rs.getString("CongViec"), rs.getString("SoCMND"),
                                         rs.getString("GioiTinh"), rs.getString("LoaiTK"), rs.getString("GhiChu"), rs.getInt("TrangThai"));
        }
        return kh;
    }
    
    public ArrayList<KhachHang> searchByName(String s) throws Exception {
        ArrayList<KhachHang> dsKH = new ArrayList<>();
        String sql = "SELECT * FROM KHACH_HANG WHERE TenKH LIKE N'%"+s+"%'";
        PreparedStatement ps = con.prepareStatement(sql);        
        
        ResultSet rs = ps.executeQuery();
        KhachHang kh = null;
        while(rs.next())
        {
            kh = new KhachHang(rs.getString("MaKH"), rs.getString("TenKH"), rs.getString("SoDT"),
                                         rs.getString("DiaChi"), rs.getString("CongViec"), rs.getString("SoCMND"),
                                         rs.getString("GioiTinh"), rs.getString("LoaiTK"), rs.getString("GhiChu"), rs.getInt("TrangThai"));
            dsKH.add(kh);
        }
        
        return dsKH;
    }

    @Override
    public ArrayList<KhachHang> searchAll(String s) throws Exception {
        ArrayList<KhachHang> dsKH = new ArrayList<>();
        String sql ="SELECT * FROM KHACH_HANG WHERE "
            +" MaKH like N'%"+s+"%' or "
            +" TenKH like N'%"+s+"%' or "
            +" SoDT like N'%"+s+"%' or "
            +" DiaChi like N'%"+s+"%' or "
            +" CongViec like N'%"+s+"%' or "
            +" SoCMND like '%"+s+"%' or "
            +" GioiTinh like N'%"+s+"%' or "
            +" LoaiTK like N'%"+s+"%' or "
            +" GhiChu like N'%"+s+"%' or "
            +" TrangThai like N'%"+s+"%'";
        PreparedStatement ps = con.prepareStatement(sql);        
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            KhachHang kh = new KhachHang(rs.getString("MaKH"), rs.getString("TenKH"), rs.getString("SoDT"),
                                         rs.getString("DiaChi"), rs.getString("CongViec"), rs.getString("SoCMND"),
                                         rs.getString("GioiTinh"), rs.getString("LoaiTK"), rs.getString("GhiChu"), rs.getInt("TrangThai"));
            dsKH.add(kh);
        }
        return dsKH;
    }
    
    @Override
    public void close() throws Exception{
        if(con != null){
            con.close();
        }
    }
    
}
