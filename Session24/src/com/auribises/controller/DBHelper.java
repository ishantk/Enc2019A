package com.auribises.controller;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.auribises.model.Customer;

/**
 * This class DBHelper helps to insert Customers in DataBase !!
 *
 * @see Connection
 * @see PreparedStatement
 *
 * @author Ishant Kumar
 * @since 1.0
 */

public class DBHelper {
	
	Connection con; // Has-A Relation
	PreparedStatement pStmt; // Has-A Relation

	// When Object is created, Constructor is executed !!
	public DBHelper() {
		// 2. Load the Driver 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(">> Driver Loaded");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void createConnection(){
		try {
			// 3. Create Connection:
			String url = "jdbc:mysql://localhost/Enc2019";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url,user,password);
			System.out.println(">> Connection Created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int addCustomerInDB(Customer cRef){
		
		int i = 0;
		
		try {
			
			// 4. Create SQL Statement
			String sql = "insert into Customer values(null, ?, ?, ?)";
			
			// 5. Execute SQL Statement
			
			pStmt = con.prepareStatement(sql);
			// Substitute the data in SQL Statement
			pStmt.setString(1, cRef.name);
			pStmt.setString(2, cRef.phone);
			pStmt.setString(3, cRef.email);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}
	
	public void closeConnection(){
		try {
			con.close();
			System.out.println(">> Connection Closed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
