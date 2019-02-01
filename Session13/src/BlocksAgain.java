class Point{
	
	static int x;
	
	static{
		x = 100;
		System.out.println(">> This is static block of Point");
	}
	
	{
		System.out.println(">> This is block of Point");
	}
}

public class BlocksAgain {
	
	
	static{
		System.out.println(">> This is static block of BlocksAgain");
	}

	public static void main(String[] args) {
		System.out.println(">> Main Started");

		Point pRef = new Point();
		
		// Local Variable: Initialization Before Use 
		int a=0;
		a = a+10;
		
		System.out.println(">> Main Finished");
	}

}
