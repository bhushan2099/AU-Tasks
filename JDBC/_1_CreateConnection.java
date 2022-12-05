package com.JDBC;

import java.sql.*;

public class _1_CreateConnection{

    public static void main(String[] args){

        try{

            // Load Database Driver -

            Class.forName("com.mysql.cj.jdbc.Driver"); // --> Driver gets loaded in memory

            // Create a connection -

            String url = "jdbc:mysql://localhost:3306/employeedb";
            String username = "root";
            String password = "Bhushan@2099";

            Connection con = DriverManager.getConnection(url,username,password);

            if(con.isClosed()){
                System.out.println("Connection is closed !! No Connection created yet !!");
            }
            else{
                System.out.println("Connection created successfully !!");
            }

        }
        catch(Exception e){
            System.out.println("Exception Occurred !!");
            e.printStackTrace();
        }
    }
}