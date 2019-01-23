
public class MethodFrames {

	static void addNumbers(int x, int y){
		int z = x + y;
		System.out.println("add numbers Sum is: "+z);
	}
	
	// main method represents main thread
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum is: "+c);
		
		MethodFrames.addNumbers(50, 80);
				
		System.out.println("This is Last Statement");

	}

}
