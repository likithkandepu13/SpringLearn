package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgresConnection {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/springjdbc";
        String username = "postgres";
        String password = "admin123";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM students");

            while(rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println(id + " " + name + " " + email);
            }

            rs.close();
            st.close();
            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}