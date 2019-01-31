class Point{
	
	// Attributes - Property of Object
	int x, y;
	
	// Constructor is the 1st method which will be executed in Object
	// Purpose : To Provide some default values to attributes of an Object
	// Special Method - Constructor
	// Default Constructor or No Arg Constructor
	/*Point(){
		x = 0;
		y = 0;
	}*/
	
	Point(){
		x = 7;
		y = 7;
	}
	
	// Non Default,  Arg Constructor or Parameterized Constructor
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// Methods - Property of Object
	// 1. Write Data in Object
	void setPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//2. Read Data from Object
	void showPoint(){
		System.out.println("Point is: "+x+":"+y);
	}
	
}

public class Constructors {

	public static void main(String[] args) {
		
		// Object Construction Statement
		Point p1 = new Point(); //Point(); -> Call to Default Constructor
		Point p2 = new Point();
		Point p3 = new Point(111, 222);
		
		p1.setPoint(10, 20);
		
		p1.showPoint();  // 10 20
		p2.showPoint();  // 0  0

	}

}
