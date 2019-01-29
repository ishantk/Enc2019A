// Application Class -> Execution !!
public class UberApp {

	public static void main(String[] args) {
		
		Cab c1 = new Cab();
		Driver d1 = new Driver();
		
		System.out.println("c1 is: "+c1);
		System.out.println("d1 is: "+d1);
		
		// Writing Data Directly
		/*c1.regNum = "PB10AB1111";
		c1.color = "Black";
		c1.name = "Honda City";
		c1.type = 1;*/
		
		// Writing Data In-Directly
		// Writing data in Cab Object using a Method
		c1.setDataForCab("PB10AB1111", "Black",	"Honda City", 1);
		//d1.setDataForDriver("John", "+91 99999 88888", "john@example.com", 'M');
		d1.setDataForDriver("John", "+91 99999 88888", "john@example.com", 'M', c1);
		
		// Fulfilling HAS-A Relationship | 1 to 1
		//d1.cRef = c1;
		
		//c1.showDataForCab();
		
		d1.showDataForDriver();
		
		// arr is a Ref Variable
		// it will point to int array in Heap will all elements as 0
		int[] arr = new int[5];
		arr[0] = 111;
		
		// cArr is a Ref Variable
		// it will point to cab reference variable array in Heap will all ref variables of cab as null
		Cab[] cArr = new Cab[5];
		
		cArr[0] = new Cab();
		
		cArr[2] = new Cab();

		cArr[0].setDataForCab("PB10XY3333", "White", "Swift", 2);
		//cArr[1].setDataForCab("PB10FG5555", "Silver", "i10", 2); //  -> Error at Runtime
		cArr[2].setDataForCab("PB10FG4444", "Silver", "i20", 2);
		
		cArr[0].showDataForCab();
		//cArr[1].showDataForCab(); // -> Error at Runtime
		cArr[2].showDataForCab();
		
		
		
	}

}
