package com.auribises;

// Single Method Interface : Functional Interface
interface Shape{
	void draw();
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		/*
		Shape sRef = new Shape(){
			public void draw(){
				System.out.println(">> Drawing a Shape"); 
			}
		};	
		
		sRef.draw();
		*/
		
		// Lambda Expression is just another syntax to write Functional Interfaces
		Shape sRef = ()->{
			System.out.println(">> Drawing a Shape :)"); 
		};
		
		sRef.draw();
		
		// Explore -> Method with input(s) and Ack

	}

}
