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
public class BPhieuYCNhapKho extends Bussiness{

    public BPhieuYCNhapKho() throws Exception{
        DB      = new DataAccess();
        SQL     = "";
        Table   = "Phieu_YC_Nhap_Kho";
        ID      = "SoPhieuYCNK";
    }
    
    public boolean insertByProperties(String SoPhieuYCNK, String SoPhieuMH, String MaNV, String MaKho, String NgayLap, String GhiChu, int TrangThai)
    {
        SQL="INSERT INTO Phieu_YC_Nhap_Kho VALUES('"
               +SoPhieuYCNK+"','"
               +SoPhieuMH+"','"
               +MaNV+"','"
               +MaKho+"')"
               +NgayLap+"')"
               +GhiChu+"')"
               +TrangThai+"')";
        
       return insertBySQLString(SQL);
    }
     public boolean updateProperties(String SoPhieuYCNK, String SoPhieuMH, String MaNV, String MaKho, String NgayLap, String GhiChu, int TrangThai)
     {
         SQL="UPDATE Phieu_YC_Nhap_Kho SET "
               +" SoPhieuMH = '"+SoPhieuMH+"', "
               +" MaNV = '"+MaNV+"',"
               +" MaKho = '"+MaKho+"'"
               +" NgayLap = '"+NgayLap+"'"
               +" GhiChu = '"+GhiChu+"'"
               +" TrangThai = '"+TrangThai+"'"
               +" WHERE SoPhieuYCNK = '"+SoPhieuYCNK+"'";
       return updateBySQLString(SQL);
     }
     
     public boolean deleteBySate(String _columnNameId, String _id, int _state)
    {
        return super.deleteByState(_columnNameId, _id, _state);
    }
     
    public boolean insertCTPhieuYCNhapKho(String SoPhieuYCNK, String MaSP, String TenSP, float SoLuong, String GhiChu, int TrangThai)
    {
        SQL = "SELECT SoLuong FROM CT_Phieu_YC_Nhap_Kho WHERE SoPhieuYCNK = '"+ SoPhieuYCNK +"' AND MaSP = '"+ MaSP +"'";
        ResultSet rs = getDataBySQLString(SQL);
        try {
            if(rs.next() && rs.getFloat("SoLuong") >= 0)
            {
                SoLuong += rs.getFloat("SoLuong");
            }
        } catch (Exception e) {
        }
    }
    
}
