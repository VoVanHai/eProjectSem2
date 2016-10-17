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
public class Bussiness {
    protected DataAccess DB;
    protected String SQL;
    protected String Table;
    protected String ID;

    public Bussiness() {
    }

    public Bussiness(DataAccess DB, String Table, String ID) {
        this.DB     = DB;
        this.Table  = Table;
        this.ID     = ID;
    }

    public Bussiness(DataAccess DB, String Table) {
        this.DB     = DB;
        this.Table  = Table;
    }
    
    //Lấy toàn bộ dữ liệu thuộc một bảng bất kì
    public ResultSet getAll()
    {
        SQL = "SELECT * FROM" + Table;
        ResultSet rs = DB.getData(SQL);
        return rs;
    }
    
    //Lấy dữ liệu theo ID hay Mã
    public ResultSet getById(String _id)
    {
        ResultSet rs = null;
        SQL = "SELECT * FROM " + Table + " WHERE " + ID + " = " + _id;
        rs  = DB.getData(SQL);
        return rs;
    }
    
    //Tìm kiếm theo ID hay Mã
    public ResultSet searchById(String _id)
    {
        ResultSet rs = null;
        SQL = "SELEC * FROM " + Table + " WHERE " + ID + " LIKE '%" + _id + "%'";
        return rs;
    }
    
    //Tìm kiếm bất kì
    public ResultSet searchAll(String _query)
    {
        return DB.getData(_query);
    }
    
    //Xóa dữ liệu theo Id
    public boolean deleteById(String _id)
    {
        SQL = "DELETE " + Table + " WHERE " + ID + " = '" + _id + "'";
        try {
            if(DB.updateData(SQL))
            {
                System.out.println("Xóa thành công cho ID: " + _id);
                return true;
            }
        } catch (Exception e) {
            System.out.println("Lỗi " + e.getMessage());
        }
        
        return false;
    }
    
    //Xóa dữ liệu bằng cách cập nhật trạng thái(1 hoặc 0 hoặc -1) để không bị mất dự liệu hoặc xảy ra lỗi
    public boolean deleteByState(String _columnNameId, String _id, int _state)
    {
        SQL = "UPDATE " + Table + " SET " + " TrangThai = '"+_state+"'" 
                + " WHERE " + _columnNameId + " = '"+_id+"'";
        
        try {
            if(DB.updateData(SQL))
            {
                System.out.println("Cập nhật thành công cho ID: " + _id + "với trang thái là " + _state);
                return true;
            }
        } catch (Exception e) {
            System.out.println("Lỗi " + e.getMessage());
        }
        
        return false;
    }
    
    //Update dữ liệu
    public boolean updateBySQLString(String _query)
    {
        try {
            if(DB.updateData(_query))
            {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }        
        return false;
    }
    
    //Insert dữ liệu
    public boolean insertBySQLString(String _query){
        return updateBySQLString(_query);
    }
    
    //Lấy dữ liệu theo một câu SQL
    public ResultSet getDataBySQLString(String _query){
        return DB.getData(_query);
    }
}
