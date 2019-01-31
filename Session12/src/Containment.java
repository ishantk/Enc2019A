// Object within another Object
class Outer{
	
	void show(){
		System.out.println("This is show of Outer");
	}
	
	// Nested Class
	class Inner{
		void show(){
			System.out.println("This is show of Inner");
		}
	}
}

public class Containment {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		oRef.show();
		
		Outer.Inner iRef = oRef.new Inner();
		iRef.show();
		
	}

}
