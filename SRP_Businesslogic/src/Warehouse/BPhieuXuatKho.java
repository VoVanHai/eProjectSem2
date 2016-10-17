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
public class BPhieuXuatKho extends Bussiness{

    public BPhieuXuatKho() throws Exception{
        DB      = new DataAccess();
        Table   = "PhieuXuatKho";
        ID      = "SoPhieuXK";
    }
    
    public ResultSet getAllPhieuXuatKho()
    {
        Table = "PhieuXuatKho";
        return getAll();
    }
    
    public boolean insertByProperties(String SoPhieuXK, String MaNV, String MaCuaHang, String NgayLap, String GhiChu, int TrangThai)
    {
        SQL = "INSERT INTO PhieuXuatKho VALUES ("
                + "'"+SoPhieuXK+"',"
                + "'"+MaNV+"',"
                + "'"+MaCuaHang+"',"
                + "'"+NgayLap+"',"
                + "'"+GhiChu+"',"
                + "'"+TrangThai+"'";
        
        return super.insertBySQLString(SQL);
    }
    
    public boolean updateByProperties(String SoPhieuXK, String MaNV, String MaCuaHang, String NgayLap, String GhiChu, int TrangThai)
    {
        SQL = "UPDATE PhieuXuatKho SET"
                + " MaNV = N'"+ MaNV +"',"
                + " MaCuaHang = '"+ MaCuaHang +"',"
                + " NgayLap = N'"+ NgayLap +"',"
                + " GhiChu = N'"+ GhiChu +"',"
                + " TrangThai = N'"+ TrangThai +"'"
                + " WHERE SoPhieuXK = '"+ SoPhieuXK +"'";
        
        return super.updateBySQLString(SQL);
    }
    
    public boolean deleteBySate(String _columnNameId, String _id, int _state)
    {
        return super.deleteByState(_columnNameId, _id, _state);
    }
}
