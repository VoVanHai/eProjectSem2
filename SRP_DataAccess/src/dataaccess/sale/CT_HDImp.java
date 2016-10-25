/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.sale;
import sale.Ct_Hd_Ban_Hang;
import dataaccess.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Tien-Dung
 *//**
 *
 * @author Tien-Dung
 */
public class CT_HDImp implements NhomBanHangDAO<Ct_Hd_Ban_Hang>{

       private Connection con;

    public CT_HDImp() throws Exception{
        con = ConnectionFactory.getInstance().getConection();
    }
    @Override
    public boolean add(Ct_Hd_Ban_Hang dao) throws Exception {
        String sql="insert into CT_HD_BAN_HANG values (?,?,?,?,?) ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getSoHD());
        ps.setString(2, dao.getMaSP());
        ps.setInt(3, dao.getSoLuong());
        ps.setInt(4, dao.getDongiaBan());
        ps.setInt(5, dao.getGiaKM());
        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(Ct_Hd_Ban_Hang dao) throws Exception {
        String sql="delete from CT_HD_BAN_HANG where soHD= ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaSP());
        return ps.executeUpdate() > 0;
    }

    @Override
    public Ct_Hd_Ban_Hang find(Ct_Hd_Ban_Hang dao) throws Exception {
        String maSP;
        String sql=" select *from CT_HD_BAN_HANG where soHD= ? " + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql); 
        ps.setString(1, dao.getMaSP());
        ResultSet rs=ps.executeQuery();
        Ct_Hd_Ban_Hang ct=null;
        if(rs.next()){
            ct=new Ct_Hd_Ban_Hang(rs.getString("soHD"),rs.getString("maSP") ,
                    rs.getInt("soLuong"), rs.getInt("dongiaBan"), rs.getInt("giaKM"));
        }
        return ct;
    }

    @Override
    public ArrayList<Ct_Hd_Ban_Hang> getAll() throws Exception {
        ArrayList<Ct_Hd_Ban_Hang> lst = new ArrayList<>();
        String sql = "select * from CT_HD_BAN_HANG" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Ct_Hd_Ban_Hang ct = new Ct_Hd_Ban_Hang(rs.getString("soHD"),rs.getString("maSP") ,
                    rs.getInt("soLuong"), rs.getInt("dongiaBan"), rs.getInt("giaKM"));
            lst.add(ct);
        }
        return lst;
    }
    

    @Override
    public boolean update(Ct_Hd_Ban_Hang dao) throws Exception {
        String sql = "update CT_HD_BAN_HANG set soHD = ? ,maSP = ? , soLuong = ?, dongiaBan=?, giaKM=?"
                + " where soHD = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getSoHD());
        ps.setString(2, dao.getMaSP());
        ps.setInt(3, dao.getSoLuong());
        ps.setInt(4, dao.getDongiaBan());
        ps.setInt(5, dao.getGiaKM());
       return ps.executeUpdate() > 0;
    }

    @Override
    public void close() throws Exception {
        if(con != null){
            con.close();
        }
    }
    
}
