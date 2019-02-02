
public class MultiDimArrays {

	public static void main(String[] args) {
		
		int[] a1 = {10, 20, 30, 40, 50};
		// a1 is a ref variable which will contain hashCode
		System.out.println("a1 is: "+a1);
		System.out.println("a1 length is: "+a1.length);
		System.out.println("a1[0] is: "+a1[0]);

		// Array of Arrays
		int[][] a2 = {
						{10, 20, 30},				// 0
						{10, 20, 30, 40},			// 1
						{10, 20},					// 2
						{10, 20, 30, 40, 50},		// 3
						{10}						// 4
				      };
		
		System.out.println("a2 is: "+a2);
		System.out.println("a2 length is: "+a2.length);
		System.out.println("a2[0] is: "+a2[0]);
		System.out.println("a2[0] length is: "+a2[0].length);
		System.out.println("a2[0][1] is: "+a2[0][1]);
		
		for(int i=0;i<a2.length;i++){
			for(int j=0;j<a2[i].length;j++){
				System.out.print(a2[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][][] a3 ={ 
							{
								{10, 20, 30},				// 0
								{10, 20, 30, 40},			// 1
								{10, 20},					// 2	// 0
								{10, 20, 30, 40, 50},		// 3
								{10}						// 4
								      
							},
							{
								{10, 20, 30},				// 0
								{10, 20, 30, 40},			// 1
								{10, 20},					// 2	// 1
								{10, 20, 30, 40, 50},		// 3
								{10}						// 4
								      
							},
							
			};
		System.out.println("a3 length is: "+a3.length);
		System.out.println("a3[0][1][0] is: "+a3[0][1][0]);
		
	}

}
