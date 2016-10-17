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
public class BKhachHang extends Bussiness{

    public BKhachHang() throws Exception{
        DB      = new DataAccess();
        Table   = "KhachHang";
        ID      = "MaKH";
    }
    
    public ResultSet getAllKhachHang()
    {
        Table = "KhachHang";
        return getAll();
    }
    
    public  boolean updateByProperties(String MaKH, String TenKH, String SoDT, String DiaChi, String CongViec, String SoCMND, String GioiTinh, String LoaiTK, String GhiChu, int TrangThai)
    {
        SQL = "UPDATE KhachHang SET"
                + " TenKH = N'"+ TenKH +"',"
                + " SoDT = '"+ SoDT +"',"
                + " DiaChi = N'"+ DiaChi +"',"
                + " CongViec = N'"+ CongViec +"',"
                + " SoCMND = N'"+ SoCMND +"',"
                + " GioiTinh = N'"+ GioiTinh +"',"
                + " LoaiTK = N'"+ LoaiTK +"',"
                + " TenKH = N'"+ TenKH +"',"
                + " GhiChu = N'"+ GhiChu +"',"
                + " TrangThai = N'"+ TrangThai +"'"
                + " WHERE MaKH = '"+ MaKH +"'";
        
        return super.updateBySQLString(SQL);
    }
    
    public boolean insertByProperties(String MaKH, String TenKH, String SoDT, String DiaChi, String CongViec, String SoCMND, String GioiTinh, String LoaiTK, String GhiChu, int TrangThai)
    {
        SQL = "INSERT INTO KhachHang VALUES ("
                + "'"+MaKH+"',"
                + "'"+TenKH+"',"
                + "'"+SoDT+"',"
                + "'"+DiaChi+"',"
                + "'"+CongViec+"',"
                + "'"+SoCMND+"',"
                + "'"+GioiTinh+"',"
                + "'"+LoaiTK+"',"
                + "'"+GhiChu+"',"
                + "'"+TrangThai+"'";
        
        return super.insertBySQLString(SQL);
    }
    
    public ResultSet searchAll(String s)
    {
        SQL = "SELECT * FROM " + Table + " WHERE "
                + " MaKH LIKE '%"+s+"%' or"
                + " TenKH LIKE N'%"+s+"%' or"
                + " SoDT LIKE N'%"+s+"%' or"
                + " DiaChi LIKE '%"+s+"%' or"
                + " CongViec LIKE N'%"+s+"%' or"
                + " SoCMND LIKE '%"+s+"%' or"
                + " GioiTinh LIKE '%"+s+"%' or"
                + " LoaiTK LIKE '%"+s+"%' or"
                + " GhiChu LIKE '%"+s+"%' or"
                + " TrangThai LIKE '%"+s+"%'";
                
        return super.searchAll(SQL);
    }
    
    public boolean deleteBySate(String _columnNameId, String _id, int _state)
    {
        return super.deleteByState(_columnNameId, _id, _state);
    }
    
}
