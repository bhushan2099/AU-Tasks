package com.JDBC;

import java.sql.*;

public class _5_SelectDataFromDB{


    public static void main(String args[]){

        try{

            Connection con = ConnectionProvider.getConnection();

            // Creating a query -

            String query = "select * from EmployeeTable";

            Statement stmt  = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
            int id = rs.getInt("employeeID");   // --> we can either mention column name or column number
            String name = rs.getString("employeeName");

            System.out.println("ID - "+id+" Name - "+name);
            }

            con.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }

    }
}