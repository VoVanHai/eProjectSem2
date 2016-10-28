/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.phongkehoach;

/**
 *
 * @author WIN7
 */
import dataaccess.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import phongkehoach.CT_Phieu_Mua_Hang;
import phongkehoach.Phieu_Mua_Hang;
public class PhieuMuaHangImp {
    private Connection con;
    public PhieuMuaHangImp() throws Exception {
        con = ConnectionFactory.getInstance().getConection();
    }

    public void add(Phieu_Mua_Hang pmh) throws Exception {
        boolean ac = con.getAutoCommit();
        con.setAutoCommit(false);
        try {
            String sql = "INSERT INTO PHIEU_MUA_HANG VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pmh.getSoPhieu());
            ps.setString(2, pmh.getMaNV());
            ps.setString(3, pmh.getMaNCC());
            ps.setDate(4, pmh.getNgayLapPhieu());
            ps.setString(5, pmh.getGhiChu());
            ps.setInt(6, pmh.getTrangThai());
            ps.executeUpdate();

            ArrayList<CT_Phieu_Mua_Hang> ctpmh = pmh.getChitietpmh();
            for (CT_Phieu_Mua_Hang ct : ctpmh) {
                String sqlCT = "INSERT INTO CT_PHIEU_MUA_HANG VALUES(?, ?, ?, ?, ?)";
                PreparedStatement psCT = con.prepareStatement(sqlCT);
                psCT.setString(1, ct.getSoPhieu());
                psCT.setString(2, ct.getMaSP());
                psCT.setInt(3, ct.getSoLuong());
                psCT.setFloat(4, ct.getGiaNhap());
                psCT.setString(5, ct.getGhiChu());
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
    public void update(Phieu_Mua_Hang pmh) throws Exception{
        boolean ac = con.getAutoCommit();
        con.setAutoCommit(false);
        try {
        String sql = "update PHIEU_MUA_HANG set MaNV =? , MaNCC =? , NgayLapPhieu = ? ,GhiChu =?,TrangThai=?"
                + " where SoPhieu=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pmh.getMaNV());
        ps.setString(2, pmh.getMaNCC());
        ps.setDate(3, pmh.getNgayLapPhieu());
        ps.setString(4, pmh.getGhiChu());
        ps.setInt(5, pmh.getTrangThai());
        ps.setString(6, pmh.getSoPhieu());
        ps.executeUpdate();
        
            ArrayList<CT_Phieu_Mua_Hang> ctpmh = pmh.getChitietpmh();
            for (CT_Phieu_Mua_Hang ct : ctpmh) {
                String sqlCT = "update CT_PHIEU_MUA_HANG set SoLuong =? , GiaNhap =? , GhiChu = ?"
                + " where SoPhieu=? and MaSP=?";
                PreparedStatement psCT = con.prepareStatement(sqlCT);
                psCT.setInt(1, ct.getSoLuong());
                psCT.setFloat(2, ct.getGiaNhap());
                psCT.setString(3, ct.getGhiChu());
                psCT.setString(4, ct.getSoPhieu());
                psCT.setString(5, ct.getMaSP());
                psCT.executeUpdate();
            }
        } catch (Exception ex) {
            con.rollback();
            throw ex;
        } finally {
            con.setAutoCommit(ac);
        }
    }
    public Phieu_Mua_Hang getPhieu_Mua_Hang(String sophieu)throws Exception{
        Phieu_Mua_Hang pmh = null;
        String sql = "select * from PHIEU_MUA_HANG where SoPhieu=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, sophieu);
        ResultSet rsP = ps.executeQuery();
        if (rsP.next()) {
            pmh=new Phieu_Mua_Hang(
                    rsP.getString("SoPhieu"),
                    rsP.getString("MaNV"),
                    rsP.getString("MaNCC"),
                    rsP.getDate("NgayLapPhieu"),
                    rsP.getString("GhiChu"),
                    rsP.getInt("TrangThai")
            );
        } else {
            return null;
        }

        sql = "select * from CT_PHIEU_MUA_HANG where SoPhieu=?";
        ps = con.prepareStatement(sql);
        ps.setString(1, sophieu);
        rsP = ps.executeQuery();
        
        ArrayList<CT_Phieu_Mua_Hang> lst = pmh.getChitietpmh();
        
        while(rsP.next()){
            CT_Phieu_Mua_Hang ct=new CT_Phieu_Mua_Hang(
                    rsP.getString("SoPhieu"),
                    rsP.getString("MaSP"),
                    rsP.getInt("SoLuong"),
                    rsP.getFloat("GiaNhap"),
                    rsP.getString("GhiChu")
            );
            lst.add(ct);
        }
        return pmh;
    }

    public boolean remove(String soPhieu) throws Exception {
        String sql = "UPDATE PHIEU_MUA_HANG" +" SET TrangThai = 0" +" WHERE SoPhieu=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, soPhieu);
        return ps.executeUpdate() > 0;
    }
     
    
}
