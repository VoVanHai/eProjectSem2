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
import phongkehoach.Chuc_Vu;
public class ChucVuImp implements PhongKeHoachDAO<Chuc_Vu>{
    private Connection con;

    public ChucVuImp() throws Exception {
        con = ConnectionFactory.getInstance().getConection();
    }
    @Override
    public boolean add(Chuc_Vu dao) throws Exception {
        String sql = "insert into CHUC_VU values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaCV());
        ps.setString(2, dao.getTenCV());
        ps.setString(3, dao.getGhiChu());
        ps.setInt(4, dao.getTrangThai());

        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(Chuc_Vu dao) throws Exception {
        String sql = "UPDATE CHUC_VU" +" SET TrangThai = 0" +" WHERE MaCV=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaCV());
        return ps.executeUpdate() > 0;
    }

    @Override
    public Chuc_Vu find(Chuc_Vu dao) throws Exception {
        String sql = "select * form CHUC_VU where MaCV = ?" + " where TrangThai = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaCV());
        ResultSet rs = ps.executeQuery();
        Chuc_Vu cv = null;
        if (rs.next()) {
            cv = new Chuc_Vu(rs.getString("MaCV"), 
                    rs.getString("TenCV"), 
                    rs.getString("GhiChu"), 
                    rs.getInt("TrangThai"));
        }
        return cv;
    }

    @Override
    public boolean update(Chuc_Vu dao) throws Exception {
        String sql = "update CHUC_VU set TenCV =? , GhiChu = ? ,TrangThai = ? " + " where MaCV=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getTenCV());
        ps.setString(2, dao.getGhiChu());
        ps.setInt(3, dao.getTrangThai());
        ps.setString(4, dao.getMaCV());
    
        return ps.executeUpdate() > 0;
    }

    @Override
    public ArrayList<Chuc_Vu> getAll() throws Exception {
        ArrayList<Chuc_Vu> lst = new ArrayList<>();
        String sql = "select * from CHUC_VU" + " where TrangThai = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
           Chuc_Vu cv = new Chuc_Vu(rs.getString("MaCV"), 
                    rs.getString("TenCV"), 
                    rs.getString("GhiChu"), 
                    rs.getInt("TrangThai"));
            lst.add(cv);
        }
        return lst;
    }
    
}
