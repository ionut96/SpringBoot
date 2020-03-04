package com.example.MProject.jdbc;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DbHikariDataSource {

    private static Properties properties = null;
    private static HikariDataSource dataSourceHikari;

    private static final String DB_DRIVER_JDBC = "driver.class.name";
    private static final String DB_URL = "db.url";
    private static final String DB_USER_NAME = "db.username";
    private static final String DB_PASSWORD = "db.password";

    public DataSource getDataSourceFunction()
    {
        return dataSourceHikari;
    }

    @Test
    public void testHiakriDataSource() {
        try {
            //properties from file
            properties = new Properties();
            properties.load(getClass().getClassLoader().getResourceAsStream("database.properties"));



            dataSourceHikari = new HikariDataSource();
            //set properties
            dataSourceHikari.setDriverClassName(properties.getProperty(DB_DRIVER_JDBC));

            dataSourceHikari.setJdbcUrl(properties.getProperty(DB_URL));
            dataSourceHikari.setUsername(properties.getProperty(DB_USER_NAME));
            dataSourceHikari.setPassword(properties.getProperty(DB_PASSWORD));

            dataSourceHikari.setMinimumIdle(100);
            dataSourceHikari.setMaximumPoolSize(1000);
            dataSourceHikari.setAutoCommit(false);
            dataSourceHikari.setLoginTimeout(5);

            try(Connection connection = dataSourceHikari.getConnection())
            {
                Statement st = connection.createStatement();
                String sqlQuery = "SELECT * FROM Books";

                ResultSet result = st.executeQuery(sqlQuery);
                while(result.next())
                {
                    System.out.println(
                            result.getInt("idBook") + "  " +
                            result.getString("name") + "   " +
                            result.getString("author")
                    );
                }
            }

        } catch (Exception e) {

        }
    }
}

