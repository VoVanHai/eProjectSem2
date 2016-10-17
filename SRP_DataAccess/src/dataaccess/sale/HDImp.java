/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.sale;


import Sale.HD;
import dataaccess.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Tien-Dung
 */
public class HDImp implements NhomBanHangDAO<HD>{
    
    private Connection con;

    public HDImp() throws Exception{
        con = ConnectionFactory.getInstance().getConection();
    }
    @Override
    public boolean add(HD dao) throws Exception {
        String sql="insert into HD_BAN_HANG values (?,?,?,?,?) ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getSoHD());
        ps.setDate(2, (Date) dao.getNgayHD());
        ps.setString(3, dao.getMaNV());
        ps.setInt(4, dao.getMoney());
        ps.setString(5, dao.getMaKH());
        ps.setString(6, dao.getTinhTrang());
        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(HD dao) throws Exception {
        String sql = "update HD_BAN_HANG " + "SET TinhTrang =0 " + "where soHD = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getSoHD());
        return ps.executeUpdate() > 0;
    }

    

    @Override
    public ArrayList<HD> getAll() throws Exception {
        ArrayList<HD> lst = new ArrayList<>();
        String sql = "select * from HD_BAN_HANG";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            HD hd = new HD(rs.getString("soHD"), rs.getDate("ngayHD"), rs.getString("maNV"),
                            rs.getInt("money"), rs.getString("maKH"), rs.getString("tinhTrang"));
            lst.add(hd);
        }
        return lst;
    }

    @Override
    public HD find(HD dao) throws Exception {
        String soHD;
        String sql=" select *from HD_BAN_HANG where soHD= ? ";
        PreparedStatement ps = con.prepareStatement(sql); 
        ps.setString(1, dao.getSoHD());
        ResultSet rs=ps.executeQuery();
        HD hd=null;
        if(rs.next()){
            hd=new HD(rs.getString("soHD"), rs.getDate("ngayHD"), rs.getString("maNV"),
                            rs.getInt("money"), rs.getString("maKH"), rs.getString("tinhTrang"));
        }
        return hd;
    }

    @Override
    public boolean update(HD dao) throws Exception {
        String sql = "update HD_BAN_HANG set soHD = ? ,ngayHD = ? , maNV = ?, money=?, maKH=?,tinhTrang=?"
                + " where soHD = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getSoHD());
        ps.setDate(2, (Date) dao.getNgayHD());
        ps.setString(3, dao.getMaNV());
        ps.setInt(4, dao.getMoney());
        ps.setString(5, dao.getMaKH());
        ps.setString(6, dao.getTinhTrang());
       return ps.executeUpdate() > 0;
    }
    
    
}
