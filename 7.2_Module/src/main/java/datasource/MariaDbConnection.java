package datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDbConnection {

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn==null) {
            // connect if necessary
            try {
                conn = DriverManager.getConnection(
                        "jdbc:mariadb://localhost:3306/currencyDatabase?user=root&password=root");
                        System.out.println("Connection successful.");
            } catch (SQLException e) {
                System.out.println("Connection failed.");
            }
            return conn;
        }
        else {
            return conn;
        }
    }

    public static void terminate() {
        try {
            getConnection().close();
            System.out.println("Closing the connection");
            
        } catch (SQLException e) {
            System.out.println("Couldn't close the connection");
        }

    }
}
