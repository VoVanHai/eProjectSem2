/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.factory;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author TrungChi
 */
public class DataAccess {
    
    private Connection conDB          = null;
    private Statement stmDB           = null;
    private ResultSet rsDB            = null;
    private CallableStatement cstmDB  = null;
    
    public DataAccess() throws Exception{
        conDB = ConnectionFactory.getInstance().getConection();
    }
    
    private boolean closeDB() {
        boolean res = true;
        try {
            if (!conDB.isClosed()) {
                conDB.close();
            }
        } catch (Exception ex) {
            res = false;
        }
        return res;
    }
    
    public ResultSet getData(String _query)
    {
        ResultSet rs = null;
        try {
            if(conDB != null)
            {
                cstmDB = conDB.prepareCall(_query);
                rs     = cstmDB.executeQuery();
            }
        } catch (Exception e) {
            rs = null;
            System.out.println("Lỗi " + e.getMessage());
        }
        
        return rs;
    }
    
    public boolean updateData(String _query) throws Exception
    {
        boolean result = true;
        try {
            if(conDB != null)
            {
                stmDB = conDB.createStatement();
                stmDB.executeQuery(_query);
            }
        } catch (Exception e) {
            result = false;
            System.out.println("Lỗi" + e.getMessage());
        }
        finally{
            closeDB();
        }
        return result;
    }
}
