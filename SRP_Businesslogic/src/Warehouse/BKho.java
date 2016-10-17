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
public class BKho extends Bussiness{

    public BKho() throws Exception{
        DB      = new DataAccess();
        Table   = "Kho";
        ID      = "MaKho";
    }
    
    public ResultSet getAllKho()
    {
        Table = "Kho";
        return getAll();
    }
    
    public boolean updateByProperties(String MaKho, String TenKho, String DiaChi, String SoDT, String GhiChu, int TrangThai)
    {
        SQL = "UPDATE Kho SET"
                + " TenKho = N'"+ TenKho +"',"
                + " DiaChi = N'"+ DiaChi +"',"
                + " SoDT = '"+ SoDT +"',"
                + " GhiChu = N'"+ GhiChu +"',"
                + " TrangThai = '"+ TrangThai +"'"
                + " WHERE MaKho = '"+ MaKho +"'";
        
        return super.updateBySQLString(SQL);
    }
    
    public boolean insertByProperties(String MaKho, String TenKho, String DiaChi, String SoDT, String GhiChu, int TrangThai)
    {
        SQL = "INSERT INTO Kho VALUES ("
                + "'"+MaKho+"',"
                + "'"+TenKho+"',"
                + "'"+DiaChi+"',"
                + "'"+SoDT+"',"
                + "'"+GhiChu+"',"
                + "'"+TrangThai+"'";
    
        return super.insertBySQLString(SQL);
    }
    
    public ResultSet searchAll(String s)
    {
        SQL = "SELECT * FROM " + Table + " WHERE "
                + " MaKho LIKE '%"+s+"%' or"
                + " TenKho LIKE N'%"+s+"%' or"
                + " DiaChi LIKE N'%"+s+"%' or"
                + " SoDT LIKE '%"+s+"%' or"
                + " GhiChu LIKE N'%"+s+"%' or"
                + " TrangThai LIKE '%"+s+"%'";
        return super.searchAll(SQL);
    }
    
    public boolean deleteBySate(String _columnNameId, String _id, int _state)
    {
        return super.deleteByState(_columnNameId, _id, _state);
    }
}
