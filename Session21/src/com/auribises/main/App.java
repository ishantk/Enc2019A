package com.auribises.main;

import com.auribises.db.DBHelper;
import com.auribises.model.Student;

public class App {

	public static void main(String[] args) {
		
		Student sRef1 = new Student();
		sRef1.roll = 0;
		sRef1.name = "Jack";
		sRef1.phone = "+91 97787 77777";
		sRef1.age = 22;
		sRef1.address = "Clover Heights";
		
		Student sRef2 = new Student(8, "Joe Watson", "+91 99999 11111", 32, "Eastern Shores");
		
		// Object Oriented Programming Structure

		// 1. Load the Driver
		DBHelper helper = new DBHelper();
		
		// 2. Create the Connection
		helper.createConnection();
		
		// 3. 4. Write SQL Statement and Execute it !!
		//helper.insertStudentInDB(sRef1);
		//helper.insertStudentInDB(sRef2);
		
		//helper.updateStudentInDB(sRef2);
		//helper.deleteStudentFromDB(2);
		//helper.deleteStudentFromDB(7);
		
		//helper.fetchStudentsFromDB();
		//helper.processBatch();
		helper.processBatchAsTransaction();
		
		// 5. Close the Connection
		helper.closeConnection();

	}

}
