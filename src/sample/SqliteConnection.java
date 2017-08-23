package sample;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by svetlanailina on 23.08.17.
 */
public class SqliteConnection {

    public static Connection Connector() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:EmployeeDb.sqlite");
            return conn;
        } catch (Exception e) {
            return null;


        }

    }


}
