package com.JDBC;

import java.sql.*;
import java.io.*;


public class _3_InsertUsingPreparedStatement{

    // PreparedStatement is used to execute dynamic or parametrised query

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

            String query = "insert into EmployeeTable(employeeName,employeeAddress) values (?,?)";

            // Execute query - 

            PreparedStatement pstmt  = con.prepareStatement(query);
            
            // Set the values in query-

            // // pstmt.setString(1,"Bhushan");       
            // // pstmt.setString(2,"Aadarsh Nagar");

            // // pstmt.executeUpdate();

            // // System.out.println("Inserted values in EmployeeTable")

            // // con.close();

            // OR we can also take input for name and address from user using Scanner or using BufferReader (present in java.io package)

//            Scanner sc = new Scanner(System.in);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter Name : ");
            String name = br.readLine();

            System.out.print("Enter Address : ");
            String address = br.readLine();

            pstmt.setString(1,name);       
            pstmt.setString(2,address);

            pstmt.executeUpdate();

            System.out.println("Inserted values in EmployeeTable");

            con.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}