
public class ValueVsRefInMethods {

	static void showSingleValueContainer(int container){
		
		container = container * 3;
		
		System.out.println("container is: "+container);
		
	}
	
	static void showMultiValueContainer(int[] arr){
		
		System.out.println("arr is: "+arr);
		
		arr[0] = arr[0] * 2;
		arr[2] = arr[2] * 4;
		
		for(int elm : arr){
			System.out.print(elm+"  ");
		}
	}
	
	public static void main(String[] args) {
		
		int x = 10;
		ValueVsRefInMethods.showSingleValueContainer(x);
		System.out.println("x is: "+x);
		
		int[] a1 = {1, 2, 3, 4, 5};
		System.out.println("a1 is: "+a1);
		ValueVsRefInMethods.showMultiValueContainer(a1);
		System.out.println();
		for(int elm : a1){
			System.out.print(elm+"  ");
		}
	}

}
