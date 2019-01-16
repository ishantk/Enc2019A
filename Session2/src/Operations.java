
public class Operations {

	public static void main(String[] args) {
		

		int num1 = 100;
		int num2 = 200;
		
		int num3 = num1 + num2;
		System.out.println("num3 is: "+num3);
		System.out.println("Result is: "+(num1+num2));

		// Arithmetic Operators
		// + - * / %
		
		int num4 = num1 % 3;
		System.out.println("num4 is: "+num4);
		
		// Division on Integers will not include decimal values -> use float or double instead
		int num5 = num1 / 3;
		System.out.println("num5 is: "+num5);
		
		// Arithmetic Unary Operators
		// ++ --
		int num = 100; // insertion
		num++;
		++num;
		--num;
		num--;
		num = 123; // update
		System.out.println("num is: "+num);
		
		int x = 10;
		//int y = x++;
		int y = ++x;
		System.out.println("x is: "+x+" and y is: "+y);
		
		// Assignment Operators
		// =, +=, -=, *=, /=, %=
		int p = 10;
		//p += 20; // p = p + 20
		//p %= 3; // p = p % 3
		p = p % 3;
		System.out.println("p is: "+p);
		
		// Bitwise Operators
		int a = 8;		// 1 0 0 0
		int b = 12; 	// 1 1 0 0
		
		int c = a & b;	// 1 0 0 0
		int d = a | b;  // 1 1 0 0
		int e = a ^ b;  // 0 1 0 0
		System.out.println("c is "+c);
		System.out.println("d is "+d);
		System.out.println("e is "+e);
		
		// Conditional Operators -> Result in either true or false
		// >, <, >=, <=, ==, !=
		
		int johnsAge = 22;
		int jenniesAge = 52;
		int jacksAge = 32;
		
		System.out.println("Is John's Age Equal to Jennies Age? "+(johnsAge != jenniesAge));
		
		// Logical Operators
		// &&, ||
		System.out.println("Is Jack the Oldest? "+( (jacksAge>johnsAge) || (jacksAge > jenniesAge)));
		
		// Shift Operators
		
	}

}
