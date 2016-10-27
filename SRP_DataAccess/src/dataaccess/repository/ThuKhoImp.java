/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.repository;

import Repository.Kho;
import Repository.ThuKho;
import dataaccess.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ThuKhoImp implements DAORepository<ThuKho>{
    private Connection con;
    public ThuKhoImp() throws Exception{
        con = ConnectionFactory.getInstance().getConection();
    }
    
    @Override
    public boolean add(ThuKho tkho) throws Exception {
         String sql = "insert into THU_KHO values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tkho.getMaNV());
        ps.setString(2, tkho.getMaKho());
        ps.setDate(3, tkho.getStartDate());
        ps.setDate(4, tkho.getEndDate());
        ps.setString(5, tkho.getGhiChu());
        ps.setString(6, tkho.getMaCV());

        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(ThuKho tkho) throws Exception {
        String sql = "UPDATE THU_KHO" +" SET TinhTrang = 0" +" WHERE MaNV=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tkho.getMaNV());
        return ps.executeUpdate() > 0;
    }

    @Override
    public ThuKho find(ThuKho tkho) throws Exception {
           String maNV;
        String sql = "select * form THU_KHO where MaNV = ?" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tkho.getMaKho());
        ResultSet rs = ps.executeQuery();
        ThuKho tkho1 = null;
        if (rs.next()) {
            tkho1 = new ThuKho(rs.getString("MaNV"),
                    rs.getString("MaKho"),
                    rs.getDate("startDate"),
                    rs.getDate("endDate"), 
                    rs.getString("GhiChu"),
                    rs.getString("MaCV"));
                    
        }
        return tkho1;
    }

    @Override
    public boolean update(ThuKho tkho) throws Exception {
        String sql = "update THUKHO set  MaKho = ? ,startDate =?,endDate =?,GhiChu = ?, MaCV =? " + " where MaNV=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tkho.getMaKho());
        ps.setDate(2, tkho.getStartDate());
        ps.setDate(3, tkho.getEndDate());
        ps.setString(4, tkho.getGhiChu());
        ps.setString(5, tkho.getMaCV());
        ps.setString(5, tkho.getMaNV());
    
        return ps.executeUpdate() > 0;
    }

    @Override
    public ArrayList<ThuKho> getAll() throws Exception {
         ArrayList<ThuKho> lst = new ArrayList<>();
        String sql = "select * from THU_KHO" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            ThuKho tkho1 = new ThuKho(
                    rs.getString("MaNV"),
                    rs.getString("MaKho"),
                    rs.getDate("startDate"),
                    rs.getDate("endDate"), 
                    rs.getString("GhiChu"),
                    rs.getString("MaCV"));
            lst.add(tkho1);
        }
        return lst;
    }
    
}
