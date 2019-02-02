
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		int[] a1 = {10, 20, 30, 40, 50};			// Implicit
		int[] a2 = new int[]{10, 20, 30, 40, 50};	// Explicit
		
		int a3[] = {10, 20, 30, 40, 50};
		int a4[] = new int[]{10, 20, 30, 40, 50};

		int[] a5 = new int[5]; // All Values are 0
		int a6[] = new int[5]; // All Values are 0
		
		a5[2] = 222;
		
		for(int elm : a5){
			System.out.println(elm);
		}
	}

}
