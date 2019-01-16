// A Class containing main shall be only executed
// Hence, it behaves as application for us
public class Containers {

	// Containers created in main are temporary
	// they will be created in RAM in Stack Arrangement
	// Will be destroyed automatically when main finishes
	public static void main(String[] args) {

		// age is a Single Value Container
		// byte represent size (8 Bits) and type of Container
		// 10 is value or literal or data
		
		// 256	128 64	32 16 8 4 2 1
		// 0 0 0 0 1 0 1 0 -> 10 in decimal
		// 0 0 0 0 1 1 0 0 -> 12 in decimal
		
		byte age = 10;
		
		age = 12;
		
		System.out.println("age is: "+age);
		
		// age can store only from -128 to 0 to 127
		// age = 128; -> error
		
		// Downcasting
		age = (byte)256;
		System.out.println("age now is: "+age);
		
		int num = 10000;
		
		long salary = 100000231210L;
		
		byte johnsAge = 10;
		
		System.out.println("num is: "+num);

		
		float pi = 3.14f;
		double pi1 = 3.14;
		
		System.out.println("Salary is: "+salary);
		
		boolean flag = true; // 1
		
		char ch = 'A';
		
	}

}
