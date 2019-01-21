
public class ValueVsReference {

	public static void main(String[] args) {
		
		// Single Value Containers or Primitive Types
		int a = 10;
		int b = a;  // Copy Operation -> Values

		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
		
		// We are updating data only in a
		a = 100;
		
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
		
		// Multi Value Containers or Reference Types
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = arr1; // Copy Operation -> Reference
		
		System.out.println("arr1 is: "+arr1);
		System.out.println("arr2 is: "+arr2);
		
		arr2[1] = 111;
		
		for(int elm : arr1){
			System.out.print(elm+"  ");
		}
	}

}
