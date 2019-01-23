
public class Methods {
	
	// f(x) = y + 1
	void fun1(int x){ // non static method
		int y = x + 1;
		System.out.println("y is: "+y);
	}
	
	static void fun2(int x){ // static method
		int y = x + 1;
		System.out.println("y is: "+y);
	}
	
	int mtrsToCms(int mtrs){	// non static method
		int cms = mtrs * 100;
		return cms; // i need to return and it should be the last statement
	}
	

	// Method -> main Method
	// main has an ack which is void i.e. do not acknowledge
	// main has 1 single input which itself is a Multi Value Container i.e. Array of String
	// main Method represents main thread
	public static void main(String[] args) {
		
		int x = 10;
		int y = x + 1;
		System.out.println("y is: "+y);
		
		System.out.println();
		
		// Execution of a static method
		// We just need the name of Class
		Methods.fun2(10);
		Methods.fun2(12);
		Methods.fun2(17);
		Methods.fun2(21);
		
		System.out.println();
		
		// Execution of a non static method
		// We need Object to execute a non static method
		Methods mRef = new Methods(); // Syntax
		mRef.fun1(10);
		mRef.fun1(13);
		mRef.fun1(17);
		
		// We can use the same reference variable to execute static method also
		mRef.fun2(20);
		
		System.out.println("11 mtrs is: "+mRef.mtrsToCms(11)+" cms");
		
		int result = mRef.mtrsToCms(13);
		System.out.println("13 mtrs is: "+result+" cms");
	}

}
