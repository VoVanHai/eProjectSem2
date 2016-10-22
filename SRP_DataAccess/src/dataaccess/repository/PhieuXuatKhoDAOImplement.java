/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.repository;

import dataaccess.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import repository.KhachHang;
import repository.PhieuXuatKho;

/**
 *
 * @author TrungChi
 */
public class PhieuXuatKhoDAOImplement implements PhieuXuatKhoDAO{

    private Connection con;

    public PhieuXuatKhoDAOImplement() throws Exception{
        con = ConnectionFactory.getInstance().getConection();
    }
    
    
    @Override
    public boolean add(PhieuXuatKho PXK) throws Exception {
        String sql = "INSERT INTO PHIEU_XUAT_KHO VALUES(?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, PXK.getSoPhieuXK());
        ps.setString(2, PXK.getMaNV());
        ps.setString(3, PXK.getMaCuaHang());
        ps.setString(4, PXK.getNgayLap());
        ps.setString(5, PXK.getGhiChu());
        ps.setInt(6, PXK.getTrangThai());        
        
        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(int trangThai, String soPhieuXK) throws Exception {
        String sql = "UPDATE PHIEU_XUAT_KHO SET TrangThai = ? WHERE SoPhieuXK = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, trangThai);
        ps.setString(2, soPhieuXK);
        
        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean update(String SoPhieuXK, String MaNV, String MaCuaHang, String NgayLap, String GhiChu, int TrangThai) throws Exception {
        String sql = "UPDATE PHIEU_XUAT_KHO SET MaNV = ?, MaCuaHang = ?, NgayLap = ?, GhiChu = ?, TrangThai = ?"
                + " WHERE SoPhieuXK = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, MaNV);        
        ps.setString(2, MaCuaHang);
        ps.setString(3, NgayLap);
        ps.setString(4, GhiChu);
        ps.setInt(5, TrangThai);
        ps.setString(6, SoPhieuXK);
        
        return ps.executeUpdate() > 0;
    }

    @Override
    public ArrayList<PhieuXuatKho> getAll() throws Exception {
        ArrayList<PhieuXuatKho> list = new ArrayList<>();
        String sql = "SELECT * FROM PHIEU_XUAT_KHO";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            PhieuXuatKho PXK = new PhieuXuatKho(rs.getString("SoPhieuXK"), rs.getString("MaNV"), rs.getString("MaCuaHang"),
                                         rs.getString("NgayLap"), rs.getString("GhiChu"), rs.getInt("TrangThai"));
            list.add(PXK);
        }
        return list;
    }

    @Override
    public PhieuXuatKho searchByID(String soPXK) throws Exception {
        String sql = "SELECT * FROM PHIEU_XUAT_KHO WHERE SoPhieuXK = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, soPXK);
        
        ResultSet rs = ps.executeQuery();
        PhieuXuatKho PXK = null;
        while(rs.next())
        {
            PXK = new PhieuXuatKho(rs.getString("SoPhieuXK"), rs.getString("MaNV"), rs.getString("MaCuaHang"),
                                         rs.getString("NgayLap"), rs.getString("GhiChu"), rs.getInt("TrangThai"));
        }
        return PXK;
    }
    
    @Override
    public ArrayList<PhieuXuatKho> searchByDayToDay(Date dStart, Date dEnd) throws Exception {
        ArrayList<PhieuXuatKho> list = new ArrayList<>();
        String sql = "SELECT * FROM PHIEU_XUAT_KHO WHERE NgayLap >= ? and NgayLap <= ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDate(1, dStart);
        ps.setDate(2, dEnd);
        
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            PhieuXuatKho PXK = new PhieuXuatKho(rs.getString("SoPhieuXK"), rs.getString("MaNV"), rs.getString("MaCuaHang"),
                                         rs.getString("NgayLap"), rs.getString("GhiChu"), rs.getInt("TrangThai"));
            list.add(PXK);
        }
        return list;
    }

    @Override
    public ArrayList<PhieuXuatKho> searchAll(String s) throws Exception {
        ArrayList<PhieuXuatKho> dsPXK = new ArrayList<>();
        String sql ="SELECT * FROM PHIEU_XUAT_KHO WHERE "
            +" SoPhieuXK like N'%"+s+"%' or "
            +" MaNV like N'%"+s+"%' or "
            +" MaCuaHang like N'%"+s+"%' or "
            +" NgayLap like N'%"+s+"%' or "
            +" GhiChu like N'%"+s+"%' or "
            +" TrangThai like '%"+s+"%'";
        PreparedStatement ps = con.prepareStatement(sql);        
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            PhieuXuatKho PXK = new PhieuXuatKho(rs.getString("SoPhieuXK"), rs.getString("MaNV"), rs.getString("MaCuaHang"),
                                         rs.getString("NgayLap"), rs.getString("GhiChu"), rs.getInt("TrangThai"));
            dsPXK.add(PXK);
        }
        return dsPXK;
    }

    @Override
    public void close() throws Exception {
        if(con != null){
            con.close();
        }
    }
    
}
