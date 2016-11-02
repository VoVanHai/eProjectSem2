package dataaccess.factory;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author VoVanHai - https://vovanhai.wordpress.com/
 */
public class ConnectionFactory {

    
    private Connection conDB;
    private static ConnectionFactory factory;

    private ConnectionFactory() throws Exception {
        String url="jdbc:sqlserver://localhost:1433;databaseName=QL_BAN_HANG";
        conDB = DriverManager.getConnection(url, "sa", "binosaka");//change user/passwprd
    }

    public synchronized static ConnectionFactory getInstance() throws Exception {
        if (factory == null) {
            factory = new ConnectionFactory();
        }
        return factory;
    }

    public Connection getConection() {
        return conDB;
    }
   
    
}
