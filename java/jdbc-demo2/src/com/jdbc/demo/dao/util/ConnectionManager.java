package com.jdbc.demo.dao.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/***
 * This class is deprecated as this is not a thread safe implementation.
 * Use the DataSourceManager to get new database connection as it implements a thread safe connection pool
 */
@Deprecated
public final class ConnectionManager {

    private static Connection connection = null;

    private ConnectionManager(){}

    public static Connection getConnection() {
        try {
            FileInputStream in = new FileInputStream("database.properties");
            Properties dbProperties = new Properties();
            dbProperties.load(in);
            if (connection == null) {

                connection = DriverManager.getConnection(
                        dbProperties.getProperty("jdbc.mysql.mysql_url"),
                        dbProperties.getProperty("jdbc.mysql.userName"),
                        dbProperties.getProperty("jdbc.mysql.password")
                );
            }

        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
