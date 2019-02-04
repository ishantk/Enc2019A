package com.auribises.pack;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		// System.out -> Output -> on Console
		// System.in  -> Input  -> From Console
		// in is a reference variable of InputStream class
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is Your Name?");
		String name = scanner.next(); // nextLine();
		System.out.println("Hello, "+name+" !!");
		
		System.out.println("Enter Number A:");
		int a = scanner.nextInt();
		
		System.out.println("Enter Number B:");
		int b = scanner.nextInt();
		
		int sum = a+b;

		System.out.println("Sum is: "+sum);
		
		// What's this problem and how can we fix it !!
		scanner.close();

	}

}
