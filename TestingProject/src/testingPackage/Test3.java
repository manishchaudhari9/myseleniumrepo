package testingPackage;

//public class Test3 {
//	public static void main(String[] args) {
////		A a = new A();
////		B b = new B();
////		System.out.println(a.x);
////		System.out.println(a.y);
////		System.out.println(b.x);
////		System.out.println(b.y);
//	}
//}
//
//class A {
//	String x = "Parent";
//}
//
//class B extends A {
//	String y = "Child";
//}

//public class Test {
//
//	public static void main(String[] args) {
//		A a = new A();
//		B b = new B();
//
//		a.parentMeth();
//		a.childMeth();
//
//		b.childMeth();
//		a.parentMeth();
//
//	}
//}
//
//class A{
//	public void parentMeth(){
//	
//	}
//}
//
//class B extends A{
//	public void childMeth(){
//	
//	}
//}

public class Test3{
	public static void main(String[] a){
		A a1 = new B();
		a1.meth1();
		a1.meth2();
		a1.meth3();

	}
}

interface A{
	public void meth1();
	public void meth2();
	public void meth3();
}

class C extends B{
	
}

class B implements A{
	@Override
	public void meth1() {
		System.out.println("meth1");
	}

	@Override
	public void meth2() {
		System.out.println("meth2");
	}

	@Override
	public void meth3() {
		System.out.println("meth3");
		
	}
	
	public void meth4() {
		System.out.println("meth4");
	}
}