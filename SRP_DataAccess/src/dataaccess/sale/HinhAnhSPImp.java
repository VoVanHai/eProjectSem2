
package dataaccess.sale;

import dataaccess.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import sale.HinhAnhSP;
import sale.SanPham;


public class HinhAnhSPImp implements NhomBanHangDAO<HinhAnhSP>{

    private Connection con;

    public HinhAnhSPImp() throws Exception{
        con = ConnectionFactory.getInstance().getConection();
    }
    
    
    @Override
    public boolean add(HinhAnhSP dao) throws Exception {
        String sql = "insert into HINH_ANH_SP values (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dao.getMsHinh());
        ps.setString(2, dao.getTenHinh());
        ps.setString(3, dao.getDuongdan());
        ps.setString(4, dao.getMaSP());
        return ps.executeUpdate() > 0;
    }

    @Override
    public boolean remove(HinhAnhSP dao) throws Exception {
        String sql = "delete from HINH_ANH_SP where MaSP = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dao.getMsHinh());
        return ps.executeUpdate() > 0;
    }

    @Override
    public HinhAnhSP find(HinhAnhSP dao) throws Exception {
        String msHinh;
        String sql = "select * form HINH_ANH_SP where msHinh = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dao.getMsHinh());
        ResultSet rs = ps.executeQuery();
        HinhAnhSP ha = null;
        if (rs.next()) {
            ha = new HinhAnhSP(rs.getInt("msHinh"),rs.getString("tenHinh"), rs.getString("đuongdan"), rs.getString("MaSP"));
        }
        return ha;
    }

    @Override
    public ArrayList<HinhAnhSP> getAll() throws Exception {
        ArrayList<HinhAnhSP> lst = new ArrayList<>();
        String sql = "select * from HINH_ANH_SP";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            HinhAnhSP ha = new HinhAnhSP(rs.getInt("msHinh"),rs.getString("tenHinh"), rs.getString("đuongdan"), rs.getString("MaSP"));
            lst.add(ha);
        }
        return lst;
    }

    @Override
    public boolean update(HinhAnhSP dao) throws Exception {
        String sql = "update HINH_ANH_SP set tenHinh = ? ,duongdan = ? , Masp = ?" + " where msHinh = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dao.getTenHinh());
        ps.setString(2, dao.getDuongdan());
        ps.setString(3, dao.getMaSP());
        ps.setInt(4, dao.getMsHinh());
       return ps.executeUpdate() > 0;
    }

   
    
}
