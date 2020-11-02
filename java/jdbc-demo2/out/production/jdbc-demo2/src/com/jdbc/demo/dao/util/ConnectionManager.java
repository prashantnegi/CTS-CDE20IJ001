package com.jdbc.demo.dao.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class ConnectionManager {

    private static Connection connection = null;

    private ConnectionManager(){}

    public static Connection getConnection() {
        try {
            FileInputStream in = new FileInputStream("database.properties");
            Properties dbProperties = new Properties();
            dbProperties.load(in);
//            System.err.println(dbProperties.getProperty("jdbc.mysql.driver_class"));
//            try {
//				Class.forName(dbProperties.getProperty("jdbc.mysql.driver_class")).newInstance();
//			} catch (InstantiationException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IllegalAccessException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
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
