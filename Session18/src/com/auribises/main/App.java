package com.auribises.main;

import com.auribises.controller.IOHelper;
import com.auribises.model.Student;

public class App {

	public static void main(String[] args) {
		
		
//		Student sRef1 = new Student();
//		Student sRef2 = new Student(201, "Fionna", 30);
//		Student sRef3 = new Student();
		
		// sRef1.roll = 101; error
		
//		sRef1.setRoll(101);
//		sRef1.setName("George");
//		sRef1.setAge(28);
		
//		sRef3.setDataForStudent(301, "Kim", 29);
		
		// We have data of Object in String format
//		String s1 = sRef1.toString();
//		String s2 = sRef2.toString();
//		String s3 = sRef3.toString();
		
		//System.out.println("sRef1 is: "+sRef1);
		//System.out.println("sRef2 is: "+sRef2);
		//System.out.println("sRef3 is: "+sRef3);
		
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		
		
		// Objects constructed above are temporary. Data in Objects can be lost !!
		// When program will finishes objects will be removed and data will be lost !!
		
		// We need to persist data somewhere.
		// We must save data !!
		// 1. Files
		// 2. DataBase (DB is also a file) 

		IOHelper iRef = new IOHelper();
		//iRef.writeDataInFile(s1);
		//iRef.writeDataInFile(s2);
		//iRef.writeDataInFile(s3);
		
		//iRef.readDataFromFile();
		iRef.readJavaFile();
		
	}

}
