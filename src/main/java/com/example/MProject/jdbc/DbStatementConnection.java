package com.example.MProject.jdbc;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;


public class DbStatementConnection {
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/TestProject";
    private static final String DB_USER_NAME = "root";
    private static final String DB_PASSWORD = "paroladb";

    @Test
    public void testDb() {

        try (Connection connection = DriverManager.getConnection(DB_URL,DB_USER_NAME,DB_PASSWORD)) {
            connection.setAutoCommit(false);

            Statement statement = connection.createStatement();

            String sqlQuery = "SELECT * FROM Books";

            ResultSet result = statement.executeQuery(sqlQuery);
            while(result.next())
            {
                System.out.println(result.getInt("idBook") + "  " +
                        result.getString("name") + "   " +
                        result.getString("author"));
            }

            PreparedStatement stmt = connection.prepareStatement("insert into Books (name,author) values (?,?)");
            stmt.setString(1,"Prepare");
            stmt.setString(2,"Statement");

            stmt.executeUpdate();

            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
