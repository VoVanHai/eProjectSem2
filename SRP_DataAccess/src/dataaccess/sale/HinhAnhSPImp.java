
package dataaccess.sale;

import dataaccess.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
        String sql = "update "
    }

    @Override
    public HinhAnhSP find(HinhAnhSP dao) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<HinhAnhSP> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(HinhAnhSP dao) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
