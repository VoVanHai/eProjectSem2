/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.repository;

import Repository.Kho;
import Repository.PhieuNhapKho;
import dataaccess.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class PhieuNhapKhoImp implements DAORepository<PhieuNhapKho>{
       private Connection con;
    public PhieuNhapKhoImp() throws Exception{
        con = ConnectionFactory.getInstance().getConection();
    }

    @Override
    public boolean add(PhieuNhapKho pnkho) throws Exception {
          String sql = "insert into PHIEU_NHAP_KHO values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pnkho.getSoPhieuNK());
        ps.setString(2, pnkho.getMaNV());
        ps.setString(3, pnkho.getMaKho());
        ps.setDate(4, pnkho.getNgayNhap());
        ps.setString(5, pnkho.getGhiChu());
        ps.setInt(6, pnkho.getTrangThai());

        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(PhieuNhapKho pnkho) throws Exception {
            String sql = "UPDATE PHIEU_NHAP_KHO" +" SET TinhTrang = 0" +" WHERE SoPhieuNK=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pnkho.getMaKho());
        return ps.executeUpdate() > 0;
    }

    @Override
    public PhieuNhapKho find(PhieuNhapKho pnkho) throws Exception {
           String soPhieuNK;
        String sql = "select * form PHIEU_NHAP_KHO where  = ?" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pnkho.getMaKho());
        ResultSet rs = ps.executeQuery();
        PhieuNhapKho pnk = null;
        if (rs.next()) {
            pnk = new PhieuNhapKho(
                    rs.getString("SoPhieuNK"),
                    rs.getString("MaNV"),
                    rs.getString("MaKho"),
                    rs.getDate("NgayNhap"), 
                    rs.getString("GhiChu"),
                    rs.getInt("TrangThai"));
                    
        }
        return pnk;
    }

    @Override
    public boolean update(PhieuNhapKho pnkho) throws Exception {
         String sql = "update PHIEU_NHAP_KHO set MaNV = ? ,MaKho =?,NgayNhap =?, GhiChu=?,TrangThai = ? " + " where SoPhieuNK=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pnkho.getMaNV());
        ps.setString(2, pnkho.getMaKho());
        ps.setDate(3, pnkho.getNgayNhap());
        ps.setString(4, pnkho.getGhiChu());
        ps.setInt(5, pnkho.getTrangThai());
        ps.setString(6, pnkho.getSoPhieuNK());
    
        return ps.executeUpdate() > 0;
    }

    @Override
    public ArrayList<PhieuNhapKho> getAll() throws Exception {
          ArrayList<PhieuNhapKho> lst = new ArrayList<>();
        String sql = "select * from PHIEU_NHAP_KHO" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            PhieuNhapKho pnk = new PhieuNhapKho(
                    rs.getString("SoPhieuNK"),
                    rs.getString("MaNV"),
                    rs.getString("MaKho"),
                    rs.getDate("NgayNhap"), 
                    rs.getString("GhiChu"),
                    rs.getInt("TrangThai"));
            lst.add(pnk);
        }
        return lst;
    }
    }

    

