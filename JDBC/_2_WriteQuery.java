package com.JDBC;

import java.sql.*;

public class _2_WriteQuery{
    public static void main(String args[]){

        try{

            // Load Database Driver -

            Class.forName("com.mysql.jdbc.Driver"); // --> Driver gets loaded in memory

            // Create a connection -

            String url = "jdbc:mysql://localhost:3306/EmployeeDB";
            String username = "root";
            String password = "root";

            Connection con = DriverManager.getConnection(url,username,password);

            // Creating a query -

            String query = "create table EmployeeTable(employeeID int(10) primary key auto increment, employeeName varchar(30) not null, employeeAddress varchar(50))";

            // Execute query - 

            Statement stmt  = con.createStatement();
            stmt.executeUpdate(query);

            System.out.println("Table 'EmployeeTable' created successfully in EmployeeDB Database");

            con.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}