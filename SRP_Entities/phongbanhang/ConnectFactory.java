/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongbanhang;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author VINH MARK
 */
public class ConnectFactory implements Serializable{
    private static ConnectFactory factory = null;
    private Connection con;

    public ConnectFactory() throws Exception{
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QL_Ban_Hang";
        con = DriverManager.getConnection(url,"sa","123456");
    }

    public synchronized static ConnectFactory getInstance() throws Exception{
        if (factory == null) {
            factory = new ConnectFactory();
        }
        return factory;
    }

    public Connection getConnection() {
        return con;
    }
    
    
}
