package com.auribises;

public class LocalClasses {

	void fun1(){
		// Local Class
		class A{
			void show(){
				System.out.println("This is show from fun1");
			}
		}
		
		A aRef = new A();
		aRef.show();
		
		// Local Interface is not Allowed
		/*interface I{
			void hello();
		}*/
		
	}
	
	static void fun2(){
		// Local Class
		class A{
			void show(){
				System.out.println("This is show from fun2");
			}
		}
		
		A aRef = new A();
		aRef.show();
		
		// Local Interface is not Allowed
		/*interface I{
			void hello();
		}*/
	}
	
	class NestedClass{
		
	}
	
	interface NestedInterfcae{
		
	}
	
	static class SNestedClass{
		
	}
	
	static interface SNestedInterfcae{
		
	}
	
	public static void main(String[] args) {
		
		LocalClasses lRef = new LocalClasses();
		lRef.fun1();
		
		LocalClasses.fun2();
		
	}

}
