class CA{
	
	int a;
	static int b;
	
	void show(){
		System.out.println("This is show of CA Object");
	}
	
	static void hello(){
		System.out.println("This is hello of CA Class");
	}
	
}

class CB extends CA{
	
}


public class OOPSInheritance {

	public static void main(String[] args) {
		CB cRef = new CB();
		cRef.show();
		CB.hello();
		
		cRef.b = 200;
		cRef.hello();
		

	}

}
