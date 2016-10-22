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
import phongkehoach.TK_Dang_Nhap;
public class TKDangNhapImp implements PhongKeHoachDAO<TK_Dang_Nhap>{
    private Connection con;

    public TKDangNhapImp() throws Exception {
        con = ConnectionFactory.getInstance().getConection();
    }  
    
    @Override
    public boolean add(TK_Dang_Nhap dao) throws Exception {
        String sql = "insert into TK_DANG_NHAP values(?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaNV());
        ps.setString(2, dao.getTenTK());
        ps.setInt(3, dao.getMatKhau());
        ps.setString(4, dao.getGhiChu());
        ps.setInt(5, dao.getTrangThai());

        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(TK_Dang_Nhap dao) throws Exception {
        String sql = "UPDATE TK_DANG_NHAP" +" SET TrangThai = 0" +" WHERE MaNV=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaNV());
        return ps.executeUpdate() > 0;
    }

    @Override
    public TK_Dang_Nhap find(TK_Dang_Nhap dao) throws Exception {
        String sql = "select * form TK_DANG_NHAP where MaNV = ?" + " where TrangThai = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaNV());
        ResultSet rs = ps.executeQuery();
        TK_Dang_Nhap tk = null;
        if (rs.next()) {
            tk = new TK_Dang_Nhap(rs.getString("MaNV"), 
                    rs.getString("TenTK"), 
                    rs.getInt("MatKhau"), 
                    rs.getString("GhiChu"), 
                    rs.getInt("TrangThai"));
        }
        return tk;
    }

    @Override
    public boolean update(TK_Dang_Nhap dao) throws Exception {
        String sql = "update TK_DANG_NHAP set TenTK =? , MatKhau =? , GhiChu = ? ,TrangThai = ? " + " where MaNV=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getTenTK());
        ps.setInt(2, dao.getMatKhau());
        ps.setString(3, dao.getGhiChu());
        ps.setInt(4, dao.getTrangThai());
        ps.setString(5, dao.getMaNV());
    
        return ps.executeUpdate() > 0;
    }

    @Override
    public ArrayList<TK_Dang_Nhap> getAll() throws Exception {
        ArrayList<TK_Dang_Nhap> lst = new ArrayList<>();
        String sql = "select * from TK_DANG_NHAP" + " where TrangThai = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
           TK_Dang_Nhap tk = new TK_Dang_Nhap(rs.getString("MaNV"), 
                    rs.getString("TenTK"), 
                    rs.getInt("MatKhau"), 
                    rs.getString("GhiChu"), 
                    rs.getInt("TrangThai"));
            lst.add(tk);
        }
        return lst;
    }
    
}
