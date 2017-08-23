package sample;

/**
 * Created by svetlanailina on 23.08.17.
 */

import org.sqlite.SQLiteConnection;
import org.sqlite.SQLiteJDBCLoader;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by svetlanailina on 23.08.17.
 */
public class LoginModel {
    Connection conection;
    public LoginModel () {
        conection = SqliteConnection.Connector();
        if (conection == null) System.exit(1);
    }

    public boolean isDbConnected() {
        try {
            return !conection.isClosed();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
