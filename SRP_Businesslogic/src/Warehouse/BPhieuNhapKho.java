/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse;

import dataaccess.factory.DataAccess;
import java.sql.ResultSet;

/**
 *
 * @author TrungChi
 */
public class BPhieuNhapKho extends Bussiness{

    public BPhieuNhapKho() throws Exception{
        DB      = new DataAccess();
        Table   = "PhieuNhapKho";
        ID      = "SoPhieuNK";
    }
    
    public ResultSet getAllPhieuNhapKho()
    {
        Table = "PhieuNhapKho";
        return getAll();
    }
    
    public boolean insertByProperties(String SoPhieuNK, String MaNV, String MaKho, String NgayNhap, String GhiChu, int TrangThai)
    {
        SQL = "INSERT INTO PhieuNhapKho VALUES ("
                + "'"+SoPhieuNK+"',"
                + "'"+MaNV+"',"
                + "'"+MaKho+"',"
                + "'"+NgayNhap+"',"
                + "'"+GhiChu+"',"
                + "'"+TrangThai+"'";
        
        return super.insertBySQLString(SQL);
    }
    
    public boolean updateByProperties(String SoPhieuNK, String MaNV, String MaKho, String NgayNhap, String GhiChu, int TrangThai)
    {
        SQL = "UPDATE PhieuNhapKho SET"
                + " MaNV = '"+ MaNV +"',"
                + " MaKho = '"+ MaKho +"',"
                + " NgayNhap = '"+ NgayNhap +"',"
                + " GhiChu = N'"+ GhiChu +"',"
                + " TrangThai = '"+ TrangThai +"'"
                + " WHERE SoPhieuNK = '"+ SoPhieuNK +"'";
        
        return super.insertBySQLString(SQL);
    }
    
    public boolean deleteBySate(String _columnNameId, String _id, int _state)
    {
        return super.deleteByState(_columnNameId, _id, _state);
    }
    
    public ResultSet searchAll(String s)
    {
        SQL = "SELECT * FROM " + Table + " WHERE "
                + " SoPhieuNK LIKE '%"+s+"%' or"
                + " MaNV LIKE N'%"+s+"%' or"
                + " MaKho LIKE N'%"+s+"%' or"
                + " NgayNhap LIKE '%"+s+"%' or"
                + " GhiChu LIKE N'%"+s+"%' or"
                + " TrangThai LIKE '%"+s+"%'";               
                
        return super.searchAll(SQL);
    }
        
}
