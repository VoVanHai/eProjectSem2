/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanpham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author VINH MARK
 */
public class SanPhamDAO {

    private Connection conn;

    public SanPhamDAO() throws Exception {
        conn = ConnectFactory.getInstance().getConnection();
    }

    public ArrayList<SanPham> getAll() throws Exception {
        ArrayList<SanPham> lst = new ArrayList<>();
        String sql = "select * form SAN_PHAM";
        ResultSet rs = conn.prepareStatement(sql).executeQuery();
        while (rs.next()) {
            SanPham sp = new SanPham(
                    rs.getString("MaSp"),
                    rs.getString("TenSP"),
                    rs.getString("MotaSP"),
                    rs.getString("MaNCC"),
                    rs.getString("KhoiLuong"),
                    rs.getString("KichThuocSP"),
                    rs.getString("MauSac"),
                    rs.getString("ThanhPhan"),
                    rs.getString("NhaSX"),
                    rs.getDate("NgaySX"),
                    rs.getDate("HanSuDung"),
                    rs.getInt("HinhAnh"),
                    rs.getInt("TinhTrang"));
            lst.add(sp);
        }
        return lst;
    }

    //thêm sản phẩm 
    public boolean add(SanPham sp) throws Exception {
        String sql = "insert into SAN_PHAM(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, sp.getMaSP());
        ps.setString(2, sp.getTenSP());
        ps.setString(3, sp.getMotaSP());
        ps.setString(4, sp.getMaNCC());
        ps.setString(5, sp.getKhoiLuong());
        ps.setString(6, sp.getKichThuocSp());
        ps.setString(7, sp.getMauSac());
        ps.setString(8, sp.getThanhPhan());
        ps.setString(9, sp.getNhaSX());
        ps.setDate(10, sp.getNgaySX());
        ps.setDate(11, sp.getHanSuDung());
        ps.setInt(12, sp.getHinhAnh());
        ps.setInt(13, sp.getTinhTrang());
        return ps.executeUpdate() > 0;
    }

    //Xoa san pham 
    public boolean delete(String MaSP) throws Exception {
        String sql = "delete From SAN_PHAM where MaSP = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, MaSP);
        return ps.executeUpdate() > 0;
    }
    
    // update san pham 
    public boolean update(SanPham sp)throws Exception{
        String sql = "Update SAN_PHAM set TenSP=?,MotaSP=?,MaNCC=?,KhoiLuong=?,KichThuocSP=?,MauSac=?,ThanhPhan=?,NhaSX=?,NgaySX=?,HanSuDung=?,HinhAnh=?,TinhTrang=?" + "where MaSP = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, sp.getTenSP());
        ps.setString(2, sp.getMotaSP());
        ps.setString(3, sp.getMaNCC());
        ps.setString(4, sp.getKhoiLuong());
        ps.setString(5, sp.getKichThuocSp());
        ps.setString(6, sp.getMauSac());
        ps.setString(7, sp.getThanhPhan());
        ps.setString(8, sp.getNhaSX());
        ps.setDate(9, sp.getNgaySX());
        ps.setDate(10, sp.getHanSuDung());
        ps.setInt(11, sp.getHinhAnh());
        ps.setInt(12, sp.getTinhTrang());
        ps.setString(13, sp.getMaSP());
        return ps.executeUpdate()>0;
    }

    //Tìm sản phẩm 
    public SanPham findBySanPham(String MaSP) throws Exception {
        String sql = "select * form SAN_PHAM where MaSP = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, MaSP);
        ResultSet rs = ps.executeQuery();
        SanPham sp = null;
        if (rs.next()) {
            sp = new SanPham(
                    rs.getString("MaSp"),
                    rs.getString("TenSP"),
                    rs.getString("MotaSP"),
                    rs.getString("MaNCC"),
                    rs.getString("KhoiLuong"),
                    rs.getString("KichThuocSP"),
                    rs.getString("MauSac"),
                    rs.getString("ThanhPhan"),
                    rs.getString("NhaSX"),
                    rs.getDate("NgaySX"),
                    rs.getDate("HanSuDung"),
                    rs.getInt("HinhAnh"),
                    rs.getInt("TinhTrang")
            );
        }
        return sp;
    }

}
