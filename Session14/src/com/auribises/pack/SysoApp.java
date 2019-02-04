package com.auribises.pack;

class SSystem{
	static PPrintStream oout = new PPrintStream();
}

class PPrintStream{
	void pprintln(String message){
		System.out.println(message);
	}
}

public class SysoApp {

	public static void main(String[] args) {
		
		//System.out.println("Hello World");
		SSystem.oout.pprintln("Hello World");

	}

}
