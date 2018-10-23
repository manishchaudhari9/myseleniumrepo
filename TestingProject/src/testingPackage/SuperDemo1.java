package testingPackage;

public class SuperDemo1 {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();

	}
	
	static class A{
		int i= 5;
	}
	
	static class B extends A{
		
		int i = 4;
		public void show(){
			System.out.println(i);
			System.out.println(super.i);	//
		}
		
	}

}
