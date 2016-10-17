/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse;

import dataaccess.factory.DataAccess;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author TrungChi
 */
public class BThuKho extends Bussiness{

    public BThuKho() throws Exception{
        DB      = new DataAccess();
        Table   = "ThuKho";
        ID      = "MaNV";
    }
    
    public ResultSet getAllThuKho()
    {
        Table = "ThuKho";
        return getAll();
    }
    
    public boolean updateByProperties(String MaNV, String MaKho, Date startDate, Date endDate, String GhiChu, String MaCV)
    {
        SQL = "UPDATE ThuKho SET "
                + " startDate = '"+ startDate +"',"
                + " endDate = '"+ endDate +"',"
                + " GhiChu = '"+ GhiChu +"',"
                + " GhiChu = '"+ GhiChu +"',"
                + " MaCV = '"+ MaCV +"'"
                + " WHERE MaNV = '"+ MaNV +"' and "
                + " MaKho = '" + MaKho +"'";
        return super.updateBySQLString(SQL);
    }  
    
    public ResultSet searchAll(String s)
    {
        SQL = "SELECT * FROM " + Table + " WHERE "
                + " MaNV LIKE '%"+s+"%' or"
                + " MaKho LIKE N'%"+s+"%' or"
                + " startDate LIKE N'%"+s+"%' or"
                + " endDate LIKE '%"+s+"%' or"
                + " GhiChu LIKE N'%"+s+"%' or"
                + " MaCV LIKE '%"+s+"%'";
        
        return super.searchAll(SQL);
    }
    
    public ResultSet searchByDate(Date startDate, Date endDate)
    {
        SQL = "SELECT * FROM " + Table + " WHERE "
                + " startDate >= '"+ startDate +"' and "
                + " endDate <= '"+ endDate +"'";
        
        return super.searchAll(SQL);
    }
    
    
}
