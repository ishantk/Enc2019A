package com.auribises.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

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
 */

public class App {

	// main method will have statements which will be executed in a sequence
	public static void main(String[] args) {
		
		Student sRef1 = new Student();
		sRef1.setRoll(1);
		sRef1.setName("John");
		sRef1.setPhone("+91 99999 88888");
		sRef1.setAge(18);
		sRef1.setAddress("Redwood Shores");
		
		
		Student sRef2 = new Student(2,"Jennie","+91 99999 77777",20,"Country Homes");
		
		System.out.println("sRef1 is: "+sRef1);
		System.out.println("sRef2 is: "+sRef2);
		
		try {
			
			// 2. Load the Driver:
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(">> Driver Loaded");
			
			// 3. Create Connection:
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Enc2019", "root", "");
			System.out.println(">> Connection Created");
			
			// 4. Write SQL Statement to insert data in database
			String sql = "insert into Student values(null,'"+sRef2.getName()+"','"+sRef2.getPhone()+"',"+sRef2.getAge()+" , '"+sRef2.getAddress()+"')";
			
			// 5. Execute SQL Statement
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			
			if(i>0){
				System.out.println(">> "+sRef2.getName()+" Inserted in Table");
			}else{
				System.out.println(">> "+sRef2.getName()+" Not Inserted in Table");
			}
			
			// 6. Close the Connection
			con.close();
			System.out.println(">> Connection Closed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
