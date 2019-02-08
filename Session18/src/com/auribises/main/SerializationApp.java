package com.auribises.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.auribises.model.Student;

public class SerializationApp {

	public static void main(String[] args) {
		
		/*Student sRef1 = new Student(101, "Fionna", 30);
		Student sRef2 = new Student(201, "George", 28);
		Student sRef3 = new Student(301, "Kia", 29);*/
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/students2019.dat");
			//FileOutputStream out = new FileOutputStream(file);
			// SERIALIAZATION : Writing state of an object in file directly.
			// state of an object means data in object
			/*ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(sRef1);
			oos.close();
			out.close();
			System.out.println(">> Object Written in File");*/
			
			
			FileInputStream in = new FileInputStream(file);
			
			// DE-SERIALIAZATION : Reading state of an object from file and creating an Object.
			ObjectInputStream ois = new ObjectInputStream(in);
			
			Student sRef = (Student)ois.readObject();
			System.out.println(sRef);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
