/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.repository;

import dataaccess.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import repository.CTPhieuYCXuatKho;
import repository.PhieuYCXuatKho;

/**
 *
 * @author TrungChi
 */
public class PhieuYCXuatKhoDAOImpl //implements PhieuYCXuatKhoDAO 
{

    private Connection con;

    public PhieuYCXuatKhoDAOImpl() throws Exception {
        con = ConnectionFactory.getInstance().getConection();
    }

//    @Override
//    public boolean add(PhieuYCXuatKho PYCXK, PhieuYCXuatKho.CTPhieuYCXuatKho ctPYCXK) throws Exception {
//        String sql = "INSERT INTO PHIEU_YC_XUAT_KHO VALUES(?, ?, ?, ?, ?, ?)";
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setString(1, PYCXK.getSoPhieuYCXK());
//        ps.setString(2, PYCXK.getMaNV());
//        ps.setString(3, PYCXK.getMaKho());
//        ps.setString(4, PYCXK.getNgayLap());
//        ps.setString(5, PYCXK.getGhiChu());
//        ps.setInt(2, PYCXK.getTrangThai());
//
//        String sqlCT = "INSERT INTO CT_PHIEU_YC_XUAT_KHO VALUES(?, ?, ?, ?)";
//        PreparedStatement psCT = con.prepareStatement(sql);
//        psCT.setString(1, PYCXK.getSoPhieuYCXK());
//        psCT.setString(2, PYCXK.getSoPhieuYCXK());
//        psCT.setString(3, PYCXK.getSoPhieuYCXK());
//        psCT.setString(4, PYCXK.getSoPhieuYCXK());
//
//        return ps.executeUpdate() > 0;
//    }
//
//    @Override
//    public boolean removePYCXK(int trangThai, String SoPPhieuYCXK) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean removeCTPYCXK(String SoPhieuYCXK, String MaSP) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean updatePYCXK(String SoPhieuYCXK, String MaNV, String MaKho, String NgayLap, String GhiChu, int TrangThai) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean updateCTPYCXK(String SoPhieuYCXK, String MaSP, float SoLuong, String GhiChu) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public ArrayList<PhieuYCXuatKho> getAllPYCXK() throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public ArrayList<CTPhieuYCNhapKho> getCTPYCXKBySoPhieuYCXK() throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public KhachHang searchPYCXKByID(String SoPhieuYCXK) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public ArrayList<KhachHang> searchByName(String s) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public ArrayList<KhachHang> searchAll(String s) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void close() throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public void persist(PhieuYCXuatKho PYCXK) throws Exception {
        boolean ac = con.getAutoCommit();
        con.setAutoCommit(false);
        try {
            String sql = "INSERT INTO PHIEU_YC_XUAT_KHO VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, PYCXK.getSoPhieuYCXK());
            ps.setString(2, PYCXK.getMaNV());
            ps.setString(3, PYCXK.getMaKho());
            ps.setDate(4, PYCXK.getNgayLap());
            ps.setString(5, PYCXK.getGhiChu());
            ps.setInt(6, PYCXK.getTrangThai());
            ps.executeUpdate();

            ArrayList<CTPhieuYCXuatKho> ctpyc = PYCXK.getChitietPhieuYCXK();
            for (CTPhieuYCXuatKho ct : ctpyc) {
                String sqlCT = "INSERT INTO CT_PHIEU_YC_XUAT_KHO VALUES(?, ?, ?, ?)";
                PreparedStatement psCT = con.prepareStatement(sqlCT);
                psCT.setString(1, ct.getSoPhieuYCXK());
                psCT.setString(2, ct.getMaSP());
                psCT.setFloat(3, ct.getSoLuong());
                psCT.setString(4, ct.getGhiChu());
                psCT.executeUpdate();
            }
            con.commit();
        } catch (Exception ex) {
            con.rollback();
            throw ex;
        } finally {
            con.setAutoCommit(ac);
        }
    }

    public PhieuYCXuatKho getPhieuYCXK(String sophieu) throws Exception {
        PhieuYCXuatKho pycxk = null;
        String sql = "select * from PHIEU_YC_XUAT_KHO where SoPhieuYCXK=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, sophieu);
        ResultSet rsP = ps.executeQuery();
        if (rsP.next()) {
            pycxk=new PhieuYCXuatKho(
                    rsP.getString("SoPhieuYCXK"),
                    rsP.getString("MaNV"),
                    rsP.getString("MaKho"),
                    rsP.getDate("NgayLap"),
                    rsP.getString("GhiChu"),
                    rsP.getInt("TrangThai")
            );
        } else {
            return null;
        }

        sql = "select * from CT_PHIEU_YC_XUAT_KHO where SoPhieuYCXK=?";
        ps = con.prepareStatement(sql);
        ps.setString(1, sophieu);
        rsP = ps.executeQuery();
        
        ArrayList<CTPhieuYCXuatKho> lst = pycxk.getChitietPhieuYCXK();
        
        while(rsP.next()){
            CTPhieuYCXuatKho ct=new CTPhieuYCXuatKho(
                    rsP.getString("SoPhieuYCXK"),
                    rsP.getString("MaSP"),
                    rsP.getFloat("SoLuong"),
                    rsP.getString("GhiChu")
            );
            lst.add(ct);
        }
        return pycxk;
    }

}
