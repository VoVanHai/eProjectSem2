/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.repository;

import Repository.Kho;
import Repository.PhieuYeuCauNhapKho;
import dataaccess.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class PhieuYCNhapKhoImp implements DAORepository<PhieuYeuCauNhapKho>{
     private Connection con;
    public PhieuYCNhapKhoImp() throws Exception{
        con = ConnectionFactory.getInstance().getConection();
    
    
}

    @Override
    public boolean add(PhieuYeuCauNhapKho pycnk) throws Exception {
         String sql = "insert into PHIEU_YC_NHAP_KHO values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pycnk.getSoPhieuYCNK());
        ps.setString(2, pycnk.getSoPhieuMH());
        ps.setString(3, pycnk.getMaNV());
        ps.setString(4, pycnk.getMaKho());
        ps.setDate(5, pycnk.getNgayLap());
        ps.setString(6, pycnk.getGhiChu());
        ps.setInt(7, pycnk.getTrangThai());

        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(PhieuYeuCauNhapKho pycnk) throws Exception {
           String sql = "UPDATE PHIEU_YC_NHAP_KHO" +" SET TinhTrang = 0" +" WHERE SoPhieuYCNK=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pycnk.getMaKho());
        return ps.executeUpdate() > 0;
    }

    @Override
    public PhieuYeuCauNhapKho find(PhieuYeuCauNhapKho pycnk) throws Exception {
        String soPhieuYCNK;
        String sql = "select * form PHIEU_YC_NHAP_KHO where SoPhieuYCNK = ?" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pycnk.getMaKho());
        ResultSet rs = ps.executeQuery();
        PhieuYeuCauNhapKho pycnkho = null;
        if (rs.next()) {
           pycnkho = new PhieuYeuCauNhapKho(
                    rs.getString("SoPhieuYCNK"),
                    rs.getString("SoPhieuMH"),
                    rs.getString("MaNV"),
                    rs.getString("MaKho"), 
                    rs.getDate("NgayLap"),
                    rs.getString("GhiChu"),
                    rs.getInt("TrangThai"));
                    
        }
        return pycnkho;
    }

    @Override
    public boolean update(PhieuYeuCauNhapKho pycnk) throws Exception {
          String sql = "update PHIEU_YC_NHAP_KHO set SoPhieuMH =? , MaNV = ? ,MaKho =?,NgayLap=?,GhiChu =?, TrangThai = ? " + " where SoPhieuYCNK=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pycnk.getSoPhieuMH());
        ps.setString(2, pycnk.getMaNV());
        ps.setString(3, pycnk.getMaKho());
        ps.setDate(4, pycnk.getNgayLap());
        ps.setString(5, pycnk.getGhiChu());
        ps.setInt(6, pycnk.getTrangThai());
        ps.setString(7, pycnk.getSoPhieuYCNK());
    
        return ps.executeUpdate() > 0;
    }

    @Override
    public ArrayList<PhieuYeuCauNhapKho> getAll() throws Exception {
          ArrayList<PhieuYeuCauNhapKho> lst = new ArrayList<>();
        String sql = "select * from PHIEU_YC_NHAP_KHO" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            PhieuYeuCauNhapKho pycnkho = new PhieuYeuCauNhapKho(
                    rs.getString("SoPhieuYCNK"),
                    rs.getString("SoPhieuMH"),
                    rs.getString("MaNV"),
                    rs.getString("MaKho"), 
                    rs.getDate("NgayLap"),
                    rs.getString("GhiChu"),
                    rs.getInt("TrangThai"));
            lst.add(pycnkho);
        }
        return lst;
    }
    }

