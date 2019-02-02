
public class ArraysAgain {

	public static void main(String[] args) {
		
		int[] a1 = {10, 20, 30, 40, 50};
		System.out.println("Length of a1 is: "+a1.length);

		int sum = 0;
		
		/*for(int i=0; i<a1.length; i++){
			System.out.println("a1["+i+"] is: "+a1[i]);
			sum = sum + a1[i];
		}*/
		
		// Enhanced For Loop | For-Each Loop works with Arrays
		for(int anyName : a1){
			System.out.println(anyName);
			sum = sum + anyName;
		}
		
		System.out.println("sum is: "+sum);
	}
	

}
