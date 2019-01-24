
public class StringBuiltIns {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE. They cannot be changed !!
		String s1 = "This is Awesome";
		System.out.println("s1 is: "+s1);
		
		// Any Method which will modify String will create a new String !!
		// Performing String Manipulation is a costly operation for memory !!
		String s2 = s1.toUpperCase();
		// toLowerCase()
		
		System.out.println("s1 now is: "+s1);
		System.out.println("s2 is: "+s2);
		
		String names = "John, Jennie , Jim, Jack, Joe";
		String s3 = names.substring(5);
		String s4 = names.substring(6, 11); // 6 inclusive and 11 exclusive| >=6 and < 11
		System.out.println("s3 is: "+s3);
		System.out.println("s4 is: "+s4);
		
		char ch = names.charAt(names.length() - 1);
		System.out.println("ch is: "+ch);
		
		int len = names.length();
		System.out.println("Length of names: "+len);
		
		//int idx = names.indexOf('o');
		int idx = names.lastIndexOf('J');
		System.out.println("idx is: "+idx);
		
		char[] chArr = names.toCharArray();
		int JCount = 0;
		for(char chr : chArr){
			System.out.print(chr+"-");
			if(chr == 'J'){
				JCount++;
			}
		}
		System.out.println();
		System.out.println(JCount+" number of J's Found !!");
		
		if(names.contains("Jennie")){
			System.out.println("Jennie is in the names");
		}
		
		String email = "john@example.com";
		if(email.contains("@") && email.contains(".")){
			System.out.println("This is a Valid Email");
		}else{
			System.out.println("Not a Valid Email");
		}
		
		String songName = "SomeSong.mp3";
		if(songName.endsWith(".mp3")){ // startsWith
			System.out.println("Play the Song");
		}else{
			System.out.println("Invalid File Format");
		}
		
		String newNames = names.replace('J', 'K');
		System.out.println(newNames);
		
		int[] arr = {1, 2, 3};
		String[] strArr = {"One","Two","Three"};
		
		System.out.println("arr is: "+arr);
		System.out.println("strArr is: "+strArr);
		
		String[] allNames = names.split(",");
		for(String nm : allNames){
			System.out.println(nm.trim());
		}
		
		int i = names.indexOf("Jennie"); // lastIndexOf()
		System.out.println("i is: "+i);
		
		// Explore More Methods
		
	}

}
