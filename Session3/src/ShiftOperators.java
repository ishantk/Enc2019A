
public class ShiftOperators {

	public static void main(String[] args) {
		/*
		int x = 8;			// 1 0 0 0
		int y = x >> 2;     // 0 0 1 0 		-> 2   -> 8/2pow2
		int z = x << 2;     // 1 0 0 0 0 0 	-> 32  -> 8*2pow2
		
		int p = z >> 2;
		
		System.out.println("y is: "+y);
		System.out.println("z is: "+z);
		System.out.println("p is: "+p);
		*/
		
		int x = 11;			// 1 0 1 1
		int y = x >> 2;     // 0 0 1 0
		
		//int p = -11;		
		// 1 0 1 1
		// 0 1 0 0
		//		 1
		// 0 1 0 1
		// 1 1 0 1
		// 0 0 1 0
		//		 1
		// 0 0 1 1  -> -3
		
		int p = -13;
		int q = p >> 2;
		
		System.out.println("y is: "+y);
		System.out.println("q is: "+q);
		
		// HW> Explore Left Shift on Negative Odd Numbers

	}

}
