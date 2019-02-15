package com.auribises.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DAO -> Data Access Object | Design Pattern

import com.auribises.model.Student;

/*
 	JDBC Procedure:
 	1. Link Jar File with your Project (Rt Click > Build Path > Configure > Libraries > Add External Jar)
 		Download the jar file
 	2. Load the Driver
 	3. Create Connection
 	4. Write SQL Statement to insert data
 	5. Execute SQL Statement
 	6. Close the Connection
 	
 	SQL:
 	update Student set name = 'John Watson', phone='+91 99999 00000', age = 20, address = 'Camino Heights' where roll = 2
 	delete from Student where roll = 2
 	select * from Student
 	select name, phone from Student
 	select name, phone from Student where age > 30
 	select * from Student where roll = 1
 */

public class DBHelper {
	
	Connection con; // Has-A Relation
	Statement stmt; // Has-A Relation
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
	
	public void insertStudentInDB(Student sRef){
		try {
			
			// 4. Create SQL Statement
			//String sql = "insert into Student values(null, '"+sRef.name+"', '"+sRef.phone+"',"+sRef.age+" , '"+sRef.address+"')";
			String sql = "insert into Student values(null, ?, ?, ?, ?)";
			
			// 5. Execute SQL Statement
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql);
			
			pStmt = con.prepareStatement(sql);
			// Substitute the data in SQL Statement
			pStmt.setString(1, sRef.name);
			pStmt.setString(2, sRef.phone);
			pStmt.setInt(3, sRef.age);
			pStmt.setString(4, sRef.address);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> "+sRef.name+" Inserted in Table");
			}else{
				System.out.println(">> "+sRef.name+" Not Inserted in Table");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateStudentInDB(Student sRef){
		try {
			
			// 4. Create SQL Statement
			String sql = "update Student set name = ?, phone= ?, age = ?, address = ? where roll = ? ";
			
			// 5. Execute SQL Statement
			
			pStmt = con.prepareStatement(sql);
			// Substitute the data in SQL Statement
			pStmt.setString(1, sRef.name);
			pStmt.setString(2, sRef.phone);
			pStmt.setInt(3, sRef.age);
			pStmt.setString(4, sRef.address);
			pStmt.setInt(5, sRef.roll);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> "+sRef.name+" Updated in Table");
			}else{
				System.out.println(">> "+sRef.name+" Not Updated in Table");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteStudentFromDB(int roll){
		try {
			
			// 4. Create SQL Statement
			String sql = "delete from Student where roll = ? ";
			
			// 5. Execute SQL Statement
			
			pStmt = con.prepareStatement(sql);
			// Substitute the data in SQL Statement
			pStmt.setInt(1, roll);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> "+roll+" Deleted from Table");
			}else{
				System.out.println(">> "+roll+" Not Deleted from Table");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fetchStudentsFromDB(){
		try {
			
			String sql = "Select * from Student";
			pStmt = con.prepareStatement(sql);
			
			// ResultSet is a data structure which will hold data retrieved from Table
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				Student s = new Student();
				s.roll = rs.getInt(1);
				s.name = rs.getString(2);
				s.phone = rs.getString(3);
				s.age = rs.getInt(4);
				s.address = rs.getString(5);
				
				System.out.println(s);
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void processBatch(){
		try {
			
			String sql1 = "update Student set name = 'Fionna Flynn', phone='+91 99999 00000', age = 20, address = 'Camino Heights' where roll = 1";
			String sql2 = "delete from Student where roll = 4";
			
			stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			stmt.executeBatch();
			System.out.println(">> Batch Processed");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void processBatchAsTransaction(){
		try {
			
			String sql1 = "update Student set name = 'Fionna Flynn', phone='+91 99999 00000', age = 20, address = 'Camino Heights' where roll = 1";
			String sql2 = "delete from Student1 where roll = 4";
			
			con.setAutoCommit(false);
			
			stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.executeBatch();
			con.commit();
			
			System.out.println(">> Transaction Done !!");
			
		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				con.rollback();
				System.out.println(">> We have Roll Backed Transaction");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
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
