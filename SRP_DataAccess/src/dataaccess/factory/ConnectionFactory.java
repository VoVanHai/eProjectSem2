package dataaccess.factory;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author VoVanHai - https://vovanhai.wordpress.com/
 */
public class ConnectionFactory {

    private Connection con;
    private static ConnectionFactory factory;

    private ConnectionFactory() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QL_BAN_HANG";
        con = DriverManager.getConnection(url, "sa", "123456");//change user/passwprd
    }

    public synchronized static ConnectionFactory getInstance() throws Exception {
        if (factory == null) {
            factory = new ConnectionFactory();
        }
        return factory;
    }

    public Connection getConection() {
        return con;
    }

//    public static void main(String[] args) throws Exception{
//        ConnectionFactory fac=ConnectionFactory.getInstance();
//        Connection x = fac.getConection();
//        System.out.println(x);
//    }
}
