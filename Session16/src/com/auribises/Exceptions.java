package com.auribises;

public class Exceptions {

	public static void main(String[] args) {
		
		final boolean debug = false;
		
		System.out.println(">> Main Started");
		
		int a = 10, b=2, c=0;
		int[] arr = {10, 20, 30, 40, 50};
		// Whenever we detect a crash program stops working
		// Application stops working
		// Application Crashes
		// Abnormal termination of program/process -> Bad for OS !!
		// -> can be changed to normal with try and catch !!
		try{
			c = a/b;
			System.out.println("arr[30] is:"+arr[30]);
		}/*catch(ArithmeticException aRef){
			System.out.println(">> Some Exception: "+aRef);
		}catch(ArrayIndexOutOfBoundsException aRef){
			//System.out.println(">> Some Exception: "+aRef);
			System.out.println(">> Some Exception");
		}*/
		catch(Exception eRef){
			if(debug){
				// for developers, for debugging
				eRef.printStackTrace();
			}else{
				// for customers
				System.out.println(">> Some Exception: "+eRef);
			}
		}finally{
			System.out.println(">> This is important");
		}
		System.out.println("c is: "+c);

		System.out.println(">> Main Finished");		
	}

}
