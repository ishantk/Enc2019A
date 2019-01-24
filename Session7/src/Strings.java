
public class Strings {

	public static void main(String[] args) {
		
		int age = 10;
		int[] arr = {10, 20, 30, 40, 50};
		char[] cArr = {'H','e','l','l','o'};
		
		// Strings are Reference Type | Multi Value Container

		// Interned Strings
		String s1 = "HelLo";
		String s2 = "Hello";
		
		// Object Way
		String s3 = new String("HeLLo");
		String s4 = new String("Hello");
		
		System.out.println("Age is: "+age); // -> Value
		System.out.println("arr is: "+arr); // -> HashCode
		System.out.println("cArr is: "+cArr); // -> HashCode
		
		
		// Even though String is a Reference Type we cannot see HashCode
		// We See value !! -> This seems to be a bit different
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);
		System.out.println("s3 is: "+s3);
		System.out.println("s4 is: "+s4);
		
		System.out.println();
		
		System.out.println("s1.toString() is: "+s1.toString());
		System.out.println("s2.toString() is: "+s2.toString());
		System.out.println("s3.toString() is: "+s3.toString());
		System.out.println("s4.toString() is: "+s4.toString());
		
		// When we print reference variable of String, 
		//toString() built in method is automatically executed which shows value rather than hashCode
		
		// Strings are Reference Variables !! They hold hashCodes !!
		// Reference Comparison with == operator
		if(s1 == s2){
			System.out.println("s1 == s2");
		}else{
			System.out.println("s1 != s2");
		}
		
		if(s3 == s4){
			System.out.println("s3 == s4");
		}else{
			System.out.println("s3 != s4");
		}
		
		if(s1 == s3){
			System.out.println("s1 == s3");
		}else{
			System.out.println("s1 != s3");
		}
		
		// Content Comparison
		// equals() method -> shall return either true or false
		//if(s1.equals(s2)){
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("s1 equals s2");
		}else{
			System.out.println("s1 not equals s2");
		}
		
		//if(s3.equals(s4)){
		if(s3.equalsIgnoreCase(s4)){
			System.out.println("s3 equals s4");
		}else{
			System.out.println("s3 not equals s4");
		}
		
		//if(s1.equals(s3)){
		if(s1.equalsIgnoreCase(s3)){
			System.out.println("s1 equals s3");
		}else{
			System.out.println("s1 not equals s3");
		}
		
		//if(s1.compareTo(s2) == 0){
		if(s1.compareToIgnoreCase(s2) == 0){
			System.out.println("s1 compared to s2");
		}else{
			System.out.println("s1 not compared to s2");
		}
	}

}
