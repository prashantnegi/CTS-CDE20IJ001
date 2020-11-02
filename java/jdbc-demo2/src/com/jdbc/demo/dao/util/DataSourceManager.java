package com.jdbc.demo.dao.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;

public class DataSourceManager {

    private static DataSourceManager dataSourceManager;

    private BasicDataSource basicDataSource;

    private DataSourceManager() {

        basicDataSource = new BasicDataSource();
        Properties dbProperties = null;
        try {
            FileInputStream in = new FileInputStream("database.properties");
            dbProperties = new Properties();
            dbProperties.load(in);

            basicDataSource.setDriverClassName(dbProperties.getProperty("jdbc.mysql.driver_class"));
            basicDataSource.setUrl(dbProperties.getProperty("jdbc.mysql.mysql_url"));
            basicDataSource.setUsername(dbProperties.getProperty("jdbc.mysql.userName"));
            basicDataSource.setPassword(dbProperties.getProperty("jdbc.mysql.password"));

        }catch (IOException e){
            System.err.println("Cannot load the database properties.");
            e.printStackTrace();
        }

    }

    public static DataSourceManager getInstance(){
        if (dataSourceManager == null){
            dataSourceManager = new DataSourceManager();
        }
        return dataSourceManager;
    }

    public Connection getConnection() throws SQLException {
        return this.basicDataSource.getConnection();
    }
}
