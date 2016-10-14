/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thongtin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author VINH MARK
 */
public class HinhAnhSPDAO {
    private Connection conn;

    public HinhAnhSPDAO() throws Exception{
        conn = ConnectFactory.getInstance().getConnection();
    }
    public ArrayList<HinhAnhSP> getAll() throws Exception {
        ArrayList<HinhAnhSP> lst = new ArrayList<>();
        String sql = "select * form HINH_ANH_SP";
        ResultSet rs = conn.prepareStatement(sql).executeQuery();
        while (rs.next()) {
            HinhAnhSP ha = new HinhAnhSP(rs.getInt("msHinh"),rs.getString("tenHinh"),rs.getString("duongdan"));
                    
            lst.add(ha);
        }
        return lst;
    }
    
    //them hinh anh 
    public boolean add(HinhAnhSP ha) throws Exception {
        String sql = "insert into HINH_ANH_SP(?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, ha.getMsHinh());
        ps.setString(2, ha.getTenHinh());
        ps.setString(3, ha.getDuongdan());
        return ps.executeUpdate() > 0;
    }
    
    
    public boolean delete(String msHinh) throws Exception {
        String sql = "delete From HINH_ANH_SP where MaSP = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, msHinh);
        return ps.executeUpdate() > 0;
    }
    
    // update san pham 
    public boolean update(HinhAnhSP ha)throws Exception{
        String sql = "Update HINH_ANH_SP set tenHinh=?,duongdan=?" + "where msHinh=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, ha.getTenHinh());
        ps.setString(2, ha.getDuongdan());
        ps.setInt(3, ha.getMsHinh());
        return ps.executeUpdate()>0;
    }

    //Tìm sản phẩm 
    public HinhAnhSP findByHinhAnh(String msHinh) throws Exception {
        String sql = "select * form HINH_ANH_SP where msHinh = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, msHinh);
        ResultSet rs = ps.executeQuery();
        HinhAnhSP ha = null;
        if (rs.next()) {
            ha = new HinhAnhSP(rs.getInt("msHinh"), rs.getString("tenHinh"),rs.getString("duongdan"));
        }
        return ha;
    }
}
