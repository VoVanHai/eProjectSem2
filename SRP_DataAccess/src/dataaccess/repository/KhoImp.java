/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.repository;
import Repository.Kho;
import dataaccess.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Administrator
 */
import java.util.ArrayList;/**
 *
 * @author Administrator
 */
public class KhoImp implements DAORepository<Kho>{
     private Connection con;
    public KhoImp() throws Exception{
        con = ConnectionFactory.getInstance().getConection();
    }
    
    @Override
    public boolean add(Kho kho) throws Exception {
        String sql = "insert into Kho values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kho.getMaKho());
        ps.setString(2, kho.getTenKho());
        ps.setString(3, kho.getDiaChi());
        ps.setString(4, kho.getSoDT());
        ps.setString(5, kho.getGhiChu());
        ps.setInt(6, kho.getTrangThai());

        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(Kho kho) throws Exception {
         String sql = "UPDATE Kho" +" SET TinhTrang = 0" +" WHERE MaKho=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kho.getMaKho());
        return ps.executeUpdate() > 0;
    }

    @Override
    public Kho find(Kho kho) throws Exception {
        String maKho;
        String sql = "select * form KHO where MaKho = ?" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kho.getMaKho());
        ResultSet rs = ps.executeQuery();
        Kho kho1 = null;
        if (rs.next()) {
            kho1 = new Kho(rs.getString("MaKho"),
                    rs.getString("TenKho"),
                    rs.getString("DiaChi"),
                    rs.getString("SoDT"), 
                    rs.getString("GhiChu"),
                    rs.getInt("TrangThai"));
                    
        }
        return kho1;
    }

    @Override
    public boolean update(Kho kho) throws Exception {
        String sql = "update KHO set TenKho =? , DiaChi = ? ,SoDT =?,GhiChu=?,TrangThai = ? " + " where MaKho=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kho.getTenKho());
        ps.setString(2, kho.getDiaChi());
        ps.setString(3, kho.getGhiChu());
        ps.setInt(4, kho.getTrangThai());
        ps.setString(5, kho.getMaKho());
    
        return ps.executeUpdate() > 0;
    }

    @Override
    public ArrayList<Kho> getAll() throws Exception {
        ArrayList<Kho> lst = new ArrayList<>();
        String sql = "select * from KHO" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Kho kho1 = new Kho(
                    rs.getString("MaKho"),
                    rs.getString("TenKho"),
                    rs.getString("DiaChi"),
                    rs.getString("SoDT"), 
                    rs.getString("GhiChu"),
                    rs.getInt("TrangThai"));
            lst.add(kho1);
        }
        return lst;
    }
    
}
