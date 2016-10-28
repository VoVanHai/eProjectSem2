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
import java.util.ArrayList;
import phongkehoach.CT_Chuong_Trinh_KM;
import phongkehoach.Chuong_Trinh_KM;
public class CTKMImp {

    private Connection con;
    public CTKMImp() throws Exception {
        con = ConnectionFactory.getInstance().getConection();
    }

    public void add(Chuong_Trinh_KM ctkm) throws Exception {
        boolean ac = con.getAutoCommit();
        con.setAutoCommit(false);
        try {
            String sql = "INSERT INTO CHUONG_TRINH_KM VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ctkm.getMaCT());
            ps.setString(2, ctkm.getTenCT());
            ps.setDate(3, ctkm.getNgayBD());
            ps.setDate(4, ctkm.getNgayKT());
            ps.setString(5, ctkm.getGhiChu());
            ps.setInt(6, ctkm.getTrangThai());
            ps.executeUpdate();

            ArrayList<CT_Chuong_Trinh_KM> ctctkm = ctkm.getCtctkm();
            for (CT_Chuong_Trinh_KM ct : ctctkm) {
                String sqlCT = "INSERT INTO CT_CHUONG_TRINH_KM VALUES(?, ?, ?, ?)";
                PreparedStatement psCT = con.prepareStatement(sqlCT);
                psCT.setInt(1, ct.getMaCT());
                psCT.setString(2, ct.getMaSP());
                psCT.setFloat(3, ct.getPhanTramKM());
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
    public void update(Chuong_Trinh_KM ctkm) throws Exception{
        boolean ac = con.getAutoCommit();
        con.setAutoCommit(false);
        try {
        String sql = "update CHUONG_TRINH_KM set TenCT =? , NgayBD =? , NgayKT = ? ,GhiChu =?,TrangThai=?"
                + " where MaCT=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ctkm.getTenCT());
        ps.setDate(2, ctkm.getNgayBD());
        ps.setDate(3, ctkm.getNgayKT());
        ps.setString(4, ctkm.getGhiChu());
        ps.setInt(5, ctkm.getTrangThai());
        ps.setInt(6, ctkm.getMaCT());
        ps.executeUpdate();
        
            ArrayList<CT_Chuong_Trinh_KM> ctctkm = ctkm.getCtctkm();
            for (CT_Chuong_Trinh_KM ct : ctctkm) {
                String sqlCT = "update CT_CHUONG_TRINH_KM set PhanTramKM =? , GhiChu = ?"
                + " where MaCT=? and MaSP=?";
                PreparedStatement psCT = con.prepareStatement(sqlCT);
                psCT.setFloat(1, ct.getPhanTramKM());
                psCT.setString(2, ct.getGhiChu());
                psCT.setInt(3, ct.getMaCT());
                psCT.setString(4, ct.getMaSP());
                psCT.executeUpdate();
            }
        } catch (Exception ex) {
            con.rollback();
            throw ex;
        } finally {
            con.setAutoCommit(ac);
        }
    }
    public Chuong_Trinh_KM getChuong_Trinh_KM(int mact)throws Exception{
        Chuong_Trinh_KM ctkm = null;
        String sql = "select * from CHUONG_TRINH_KM where MaCT=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, mact);
        ResultSet rsP = ps.executeQuery();
        if (rsP.next()) {
            ctkm=new Chuong_Trinh_KM(
                    rsP.getInt("MaCT"),
                    rsP.getString("TenCT"),
                    rsP.getDate("NgayBD"),
                    rsP.getDate("NgayKT"),
                    rsP.getString("GhiChu"),
                    rsP.getInt("TrangThai")
            );
        } else {
            return null;
        }

        sql = "select * from CT_CHUONG_TRINH_KM where MaCT=? ";
        ps = con.prepareStatement(sql);
        ps.setInt(1, mact);
        rsP = ps.executeQuery();
        
        ArrayList<CT_Chuong_Trinh_KM> lst = ctkm.getCtctkm();
        
        while(rsP.next()){
            CT_Chuong_Trinh_KM ct=new CT_Chuong_Trinh_KM(
                    rsP.getInt("MaCT"),
                    rsP.getString("MaSP"),
                    rsP.getFloat("PhanTramKM"),
                    rsP.getString("GhiChu")
            );
            lst.add(ct);
        }
        return ctkm;
    }

    public boolean remove(int mact) throws Exception {
        String sql = "UPDATE CHUONG_TRINH_KM" +" SET TrangThai = 0" +" WHERE MaCT=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, mact);
        return ps.executeUpdate() > 0;
    }
    
}
