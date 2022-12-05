package com.JDBC;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.BufferedReader;

public class _4_UpdateDataInDB{


    public static void main(String args[]){

        try{

            Connection con = ConnectionProvider.getConnection();

            // Creating a query -

            String query = "update EmployeeTable set employeeName = ?, employeeAddress=? where employeeID=?";

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter Name : ");
            String name = br.readLine();

            System.out.print("Enter Address : ");
            String address = br.readLine();

            System.out.print("Enter ID : ");
            int id = Integer.parseInt(br.readLine());

            // Execute query -

            PreparedStatement pstmt  = con.prepareStatement(query);

            pstmt.setString(1,name);
            pstmt.setString(2,address);
            pstmt.setInt(3,id);

            pstmt.executeUpdate();

            System.out.println("Updated EmployeeTable");

            con.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }

    }
}