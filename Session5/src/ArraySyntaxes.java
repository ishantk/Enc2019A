
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		//1.
		int[] a1 = {10, 20, 30, 40, 50};			// Implicit Statement
		
		//2.
		int a2[] = {10, 20, 30, 40, 50};			// Implicit Statement
		
		//3.
		int[] a3 = new int[]{10, 20, 30, 40, 50};  	// Explicit Statement
				
		//4.
		int a4[] = new int[]{10, 20, 30, 40, 50};   // Explicit Statement
		
		// So what is new ?
		// new is an operator which creates Array Dynamically
		// i.e. at Run Time in the HEAP Area of RAM
		// Run Time or Dynamic means when program is in execution phase
		// Compile Time or Static means when program is in compilation phase
		
		//5.
		int[] a5 = new int[10];
		// So an array of 10 integers will be created with all elements as 0
		
		// READ OPERATION on Array
		System.out.println("a1[0] is: "+a1[0]);
		System.out.println("a5[0] is: "+a5[0]);
		
		// Traditional For Loops
		/*
		for(int i=0;i<a1.length;i++){
			System.out.print(a1[i]+"  ");
		}
		
		System.out.println();
		
		for(int i=0;i<a5.length;i++){
			System.out.print(a5[i]+"  ");
		}
		*/
		
		// Enhanced For Loop | For Each Loop
		// Purpose : Read All Array Elements
		for(int elm : a5){
			System.out.print(elm+"  ");
		}
		System.out.println();

		// WRITE/UPDATE OPERATION on Array
		a5[0] = 11;
		a5[4] = 55;
		a5[9] = 111;
		
		a1[2] = 22;
		
		for(int elm : a5){
			System.out.print(elm+"  ");
		}
		
		System.out.println();
		
		int[] a6, a8;
		a6 = new int[10];
		a8 = new int[5];
		
		int a7[], a9;
		a7 = new int[10];
		a9 = 18; // a9 will be a Single Value Container !!
		
		// error
		//int[] a7;
		//a7 = {10, 20, 30, 40, 50};
		
		float[] fArr = {12.22F, 2.3F, 5.67F};
		char[] cArr = {'A', 'B', 'C'};
		
	}

}
