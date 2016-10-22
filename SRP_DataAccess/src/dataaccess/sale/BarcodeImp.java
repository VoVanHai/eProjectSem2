/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.sale;

import dataaccess.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import sale.Barcode;

/**
 *
 * @author VINH MARK
 */
public class BarcodeImp implements NhomBanHangDAO<Barcode>{
    
    private Connection con ;

    public BarcodeImp() throws Exception{
        con = ConnectionFactory.getInstance().getConection();
    }
    
    
    @Override
    public boolean add(Barcode dao) throws Exception {
        String sql = "insert into BARCODE values (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getBarcode());
        ps.setString(2, dao.getMaSP());
        ps.setString(3, dao.getMaNV());
        ps.setString(4, dao.getGhiChu());
        ps.setInt(4, dao.getTrangThai());
        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(Barcode dao) throws Exception {
        String sql = "UPDATE BARCODE" +" SET TinhTrang = 0" +" WHERE barcode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getBarcode());
        return ps.executeUpdate() > 0;
    }

    @Override
    public Barcode find(Barcode dao) throws Exception {
        String msHinh;
        String sql = "select * form BARCODE where barcode = ?" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getBarcode());
        ResultSet rs = ps.executeQuery();
        Barcode ba = null;
        if (rs.next()) {
            ba = new Barcode(rs.getString("barcode"),rs.getString("MaSP") , rs.getString("MaNV"), rs.getString("GhiChu"), rs.getInt("TrangThai"));
        }
        return ba;
    }

    @Override
    public ArrayList<Barcode> getAll() throws Exception {
        ArrayList<Barcode> lst = new ArrayList<>();
        String sql = "select * from BARCODE" + " where TinhTrang = 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Barcode ba = new Barcode(rs.getString("barcode"),rs.getString("MaSP") , rs.getString("MaNV"), rs.getString("GhiChu"), rs.getInt("TrangThai"));
            lst.add(ba);
        }
        return lst;
    }

    @Override
    public boolean update(Barcode dao) throws Exception {
        String sql = "update BARCODE set MaSP = ? ,MaNV = ? , GhiChu = ? , TrangThai = ?" + " where barcode = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getMaNV());
        ps.setString(2, dao.getMaSP());
        ps.setString(3, dao.getGhiChu());
        ps.setInt(4, dao.getTrangThai());
        ps.setString(5, dao.getBarcode());
       return ps.executeUpdate() > 0;
    }

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
