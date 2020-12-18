package com.cts.training.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DataSourceManager {

    private static DataSourceManager dataSourceManager;

    private BasicDataSource basicDataSource;

    private DataSourceManager() {

        basicDataSource = new BasicDataSource();
        Properties dbProperties = null;
//        try {
//            FileInputStream in = new FileInputStream("database.properties");
//            dbProperties = new Properties();
//            dbProperties.load(in);

//            basicDataSource.setDriverClassName(dbProperties.getProperty("jdbc.mysql.driver_class"));
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/orcl");
        basicDataSource.setUsername("ashish");
        basicDataSource.setPassword("P@$$w0rd");

//        }

    }

    public static DataSourceManager getInstance() {
        if (dataSourceManager == null) {
            dataSourceManager = new DataSourceManager();
        }
        return dataSourceManager;
    }

    public Connection getConnection() throws SQLException {
        return this.basicDataSource.getConnection();
    }
}
