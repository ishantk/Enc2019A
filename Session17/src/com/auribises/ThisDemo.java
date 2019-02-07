package com.auribises;

class Point{
	
	int x, y;
	
	Point(){
		x = 1;
		y = 1;
	}
	
	Point(int x, int y){
		// this.x represents Object's x and x represent Constructor's x
		// this is a reference variable which points to current object 
		this.x = x;
		this.y = y;
		System.out.println("this is: "+this);
	}
	
	void showPoint(){
		System.out.println("Point is: "+x+":"+y);
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		Point pRef1 = new Point();
		Point pRef2 = new Point(10, 20);
		Point pRef3 = new Point(11, 22);
		
		System.out.println("pRef2 is: "+pRef2);
		System.out.println("pRef3 is: "+pRef3);
		
		pRef1.showPoint();
		pRef2.showPoint();
		pRef3.showPoint();
		
		

	}

}
