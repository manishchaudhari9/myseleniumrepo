package testingPackage;

public class SuperDemo {
	public static void main(String[] args){
		
//		A obj = new A();
		B obj1 = new B(5);	//This will goto default constructor of Super class first(i.e. A()) then into a constructor of Sub class(i.e. B)
	}
	
	static class A{	//	Super/Parent/Base class
		
		//Default constructor of Class A
		public A(){
			System.out.println("In default constructor A()");
		}
		
		//Parameterized constructor of Class A
		public A(int i){
			System.out.println("In Parameterized constructor A()");
		}
		
	}
	
	
	static class B extends A{		//	Subclass/child/derived class

		//Default constructor of Class B
		public B(){
			System.out.println("In default constructor B()");
		}
		
		//Parameterized constructor of Class A
		public B(int i){
			super(i);	//	Here we are using super keyword a method. This will call a parameterized constructor of Parent of this class
			System.out.println("In Parameterized constructor B()");
		}		
	}
	
	
	
}