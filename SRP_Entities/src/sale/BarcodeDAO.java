/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sale;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author VINH MARK
 */
public class BarcodeDAO {
    private Connection conn;

    public BarcodeDAO() throws Exception{
        conn = ConnectFactory.getInstance().getConnection();
    }
    public ArrayList<Barcode> getAll() throws Exception {
        ArrayList<Barcode> lst = new ArrayList<>();
        String sql = "select * form BARCODE";
        ResultSet rs = conn.prepareStatement(sql).executeQuery();
        while (rs.next()) {
            Barcode bc = new Barcode(rs.getString("barcode"), rs.getString("MaSP"), rs.getString("MaNV"), rs.getString("GhiChu"), rs.getInt("TrangThai"));
            lst.add(bc);
        }
        return lst;
    }
    
    //them hinh anh 
    public boolean add(Barcode bc) throws Exception {
        String sql = "insert into BARCODE(?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, bc.getBarcode());
        ps.setString(2, bc.getMaSP());
        ps.setString(3, bc.getMaNV());
        ps.setString(4, bc.getGhiChu());
        ps.setInt(5, bc.getTrangThai());
        return ps.executeUpdate() > 0;
    }
    
    
    public boolean delete(String barcode) throws Exception {
        String sql = "delete From BARCODE where barcode = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, barcode);
        return ps.executeUpdate() > 0;
    }
    
    // update san pham 
    public boolean update(Barcode bc)throws Exception{
        String sql = "Update BARCODE set MaSP=?,MaNV=?,GhiChu=?,TrangThai=?" + "where barcode=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, bc.getMaSP());
        ps.setString(2, bc.getMaNV());
        ps.setString(3, bc.getGhiChu());
        ps.setInt(4, bc.getTrangThai());
        ps.setString(5, bc.getBarcode());
        return ps.executeUpdate()>0;
    }

    //Tìm sản phẩm 
    public Barcode findByBarcode(String barcode) throws Exception {
        String sql = "select * form BARCODE where barcode = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, barcode);
        ResultSet rs = ps.executeQuery();
        Barcode bc = null;
        if (rs.next()) {
            bc = new Barcode(
                    rs.getString("barcode"), 
                    rs.getString("MaSP"), 
                    rs.getString("MaNV"),
                    rs.getString("GhiChu"), 
                    rs.getInt("TrangThai")
            );
        }
        return bc;
    }
}
