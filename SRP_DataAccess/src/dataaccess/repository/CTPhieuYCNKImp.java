/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.repository;

import Repository.ChiTietPhieuYCNK;
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
public class CTPhieuYCNKImp implements DAORepository<ChiTietPhieuYCNK>{
      private Connection con;
    public CTPhieuYCNKImp() throws Exception{
        con = ConnectionFactory.getInstance().getConection();
    
 
}

    @Override
    public boolean add(ChiTietPhieuYCNK ctpycnk) throws Exception {
        String sql = "insert into CT_PHIEU_YC_NHAP_KHO values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ctpycnk.getSoPhieuYCNK());
        ps.setString(2, ctpycnk.getMaSP());
        ps.setString(3, ctpycnk.getTenSP());
        ps.setFloat(4, ctpycnk.getSoLuong());
        ps.setString(5, ctpycnk.getGhiChu());
        ps.setInt(6, ctpycnk.getTrangThai());

        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(ChiTietPhieuYCNK ctpycnk) throws Exception {
        String sql = "UPDATE CT_PHIEU_YC_NHAP_KHO" +" SET TinhTrang = 0" +" WHERE SoPhieuYCNK=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ctpycnk.getSoPhieuYCNK());
        return ps.executeUpdate() > 0;
    }

    @Override
    public ChiTietPhieuYCNK find(ChiTietPhieuYCNK ctpycnk) throws Exception {
         String SoPhieuYCNK;
        String sql = "select * form CT_PHIEU_YC_NHAP_KHO where SoPhieuYCNK = ?" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ctpycnk.getSoPhieuYCNK());
        ResultSet rs = ps.executeQuery();
        ChiTietPhieuYCNK ctpycnkho = null;
        if (rs.next()) {
            ctpycnkho = new ChiTietPhieuYCNK(
                    rs.getString("SoPhieuYCNK"),
                    rs.getString("MaSP"),
                    rs.getString("TenSP"),
                    rs.getFloat("SoLuong"), 
                    rs.getString("GhiChu"),
                    rs.getInt("TrangThai"));
                    
        }
        return ctpycnkho;
    }

    @Override
    public boolean update(ChiTietPhieuYCNK ctpycnk) throws Exception {
           String sql = "update CT_PHIEU_YC_NHAP_KHO set MaSP =? , TenSP = ? ,SoLuong =? ,GhiChu =?, TrangThai = ? " + " where SoPhieuYCNK=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ctpycnk.getMaSP());
        ps.setString(2, ctpycnk.getTenSP());
        ps.setFloat(3, ctpycnk.getSoLuong());
        ps.setString(4, ctpycnk.getGhiChu());
        ps.setInt(5, ctpycnk.getTrangThai());
        ps.setString(6, ctpycnk.getSoPhieuYCNK());
    
        return ps.executeUpdate() > 0;
    }

    @Override
    public ArrayList<ChiTietPhieuYCNK> getAll() throws Exception {
          ArrayList<ChiTietPhieuYCNK> lst = new ArrayList<>();
        String sql = "select * from CT_PHIEU_YC_NHAP_KHO" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            ChiTietPhieuYCNK ctpycnkho = new ChiTietPhieuYCNK(
                    rs.getString("SoPhieuYCNK"),
                    rs.getString("MaSP"),
                    rs.getString("TenSP"),
                    rs.getFloat("SoLuong"), 
                    rs.getString("GhiChu"),
                    rs.getInt("TrangThai"));
            lst.add(ctpycnkho);
        }
        return lst;
    }
    }
