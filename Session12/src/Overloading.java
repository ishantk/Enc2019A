class Maths{
	
	void addNumbers(int num1, int num2){
		int num3 = num1 + num2;
		System.out.println("Sum is: "+num3);
	}
	
	void addNumbers(int num1, double num2){
		double num3 = num1 + num2;
		System.out.println("Sum is: "+num3);
	}
	
	void addNumbers(double num1, int num2){
		double num3 = num1 + num2;
		System.out.println("Sum is: "+num3);
	}
	
	/* error
	int addNumbers(int n1, int n2){
		int num3 = n1 + n2;
		return num3;
	}*/
	
	// Overloading
	void addNumbers(int num1, int num2, int num3){
		int num4 = num1 + num2 + num3;
		System.out.println("Sum is: "+num4);
	}
	
	void addNumbers(double num1, double num2, double num3){
		double num4 = num1 + num2 + num3;
		System.out.println("Sum is: "+num4);
	}
	
	/*
	 	Rules to Overload:
	 		1. Method Name Should Be Same
	 		2. Inputs must be unique i.e. always different
	 		   2.1 Number Of Inputs
	 		   2.2 Type of Inputs
	 		   2.3 Sequence of Inputs
	 		3. Return Type has no role to play
	  
	 */
	
	/*void addNumbers(int[] arr){
		System.out.println("arr is: "+arr);
		int sum = 0;
		for(int elm : arr){
			sum = sum + elm;
		}
		System.out.println("Sum is: "+sum);
	}*/
	
	// int... VarArgs in Java -> Variable Arguments in Java
	void addNumbers(int... arr){
		System.out.println("arr is: "+arr);
		int sum = 0;
		for(int elm : arr){
			sum = sum + elm;
		}
		System.out.println("Sum is: "+sum);
	}
	
	
}

public class Overloading {

	public static void main(String[] args) {
		
		Maths mRef = new Maths();
		// Binding -> Linking a Method Call to its Definition
		// Compiler performs binding. -> Compile Time Binding / Early Binding / Static Binding
		// POLYMOPHISM : Compile Time Polymorphism
		mRef.addNumbers(10, 20);
		mRef.addNumbers(10, 20, 30);
		mRef.addNumbers(10.2, 20.7, 30.335);
		mRef.addNumbers(10, 20.23);
		mRef.addNumbers(10.57, 20);
		
		int[] a1 = {10, 20, 30, 40, 50};
		System.out.println("a1 is: "+a1);
		mRef.addNumbers(a1);
		mRef.addNumbers(10, 20, 30, 40, 50, 60, 70);
	}

}
