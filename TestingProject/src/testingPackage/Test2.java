package testingPackage;

////1) What will be the output of following program?
//public class Test2 {
//	int a;
//	static int b;
//	public static void main(String[] args) {
////		int i;
////		System.out.println(i);
//
//		int j = 100;
//		System.out.println(j);
//		
//		testing();
//	}
//	
//	public void testing(){
////		Test2 t = new Test2();
//		System.out.println("In testing - "+t.a+"---"+b);
//	}
//}

//// 2) What will be the output of following program?
//
//public class Test2 {
//
//	int i;
//	static int j;
//
//	public static void main(String[] args) {
//		Test2 t = new Test2();
//		System.out.println(i);
//		System.out.println(j);
//		t.non_static();
//	}
//
//	public void non_static() {
//		System.out.println(i);
//		System.out.println(j);
//	}
//
//}

//// 3) What will be the output of following program?
//public class Test2 {
//
//	public static void main(String[] args) {
//		non_static();
//	}
//
//	public void non_static() {
//		System.out.println("pass");
//	}
//}

//// 4) What will be the output of following program?
//public class Test2 {
//	int i;
//	static int j;
//
//	public static void main(String[] args) {
//		non_static();
//	}
//
//	public static void non_static() {
//		System.out.println("pass");
//	}
//}
//
// 5) What will be the output of following program?
//public class Test2 {
//
//	int i;
//	static int j;
//
//	public static void main(String[] args) {
//		Test2 t = new Test2();
//		t.non_static();
//		t.meth_static2();
//		meth_static2();
//		t.i = 100;
//		j = 200;
//		t.j = 400;
//	}
//
//	public void non_static() {
//		System.out.println("pass1");
//	}
//
//	public static void meth_static2() {
//		System.out.println("pass2");
//	}
//}

//// 6) Will this code compile?
//public class Test2 {
//	int var = 10;
//
//	public static void main(String s[]) {
//		Test2 t = new Test2();
//		int local = var;
//	}
//}


////// 7) Will this code compile?
//class Demo {
//	static int var = 9;
//	public static void func() {
//		System.out.println("learning static keyword");
//	}
//}
//
//public class Test2 {
//	public static void main(String s[]) {
//		Demo ob = new Demo();
//		ob.var = 9;
//		ob.func();
//
//	}
//}

//// 8) What will be the output of following program?
//public class Test2 {
//	int var;
//	static int stc = 7;
//
//	public static void main(String s[]) {
//		Test2 ob1 = new Test2();
//		ob1.var = 9;
//		System.out.println("var of ob1 " + ob1.var);
//
//		Test2 ob2 = new Test2();
//		ob2.var = 90;
//		System.out.println("var of ob2 " + ob2.var);
//		System.out.println("var of ob1 " + ob1.var);
//
//		ob1.stc = ob1.stc + 100;
//
//		System.out.println("ob1 " + ob1.stc);
//
//		System.out.println("ob2 " + ob2.stc);
//
//	}
//}

//// 9) What will be the output of following program?
//public class Test2 {
//	int i;
//
//	Test2(int i) {
//		i = i;
//	}
//
//	public static void main(String[] args) {
//
//		Test2 t = new Test2(7);
//		System.out.println(t.i);
//	}
//}

//// 10) What will be the output of following program?
//public class Test2 {
//	int age;
//	String name;
//
//	Test2(int age, String name) {
//		this.age = age;
//		this.name = name;
//	}
//
//	public static void main(String[] args) {
//
//		Test2 t1 = new Test2(17, "A");
//		Test2 t2 = new Test2(13, "B");
//		Test2 t3 = new Test2(14, "C");
//		t3 = t2;
//		t2 = t1;
//		t1 = t3;
//		System.out.println(t1.age);
//		System.out.println(t2.age);
//		System.out.println(t3.age);
//	}
//
//}

// 11) Whats the output of following program?

//public class Test2 {
//	int age;
//	String name;
//
//	Test2() {
//		non_static_meth();
//		static_meth();
//	}
//
//	public static void main(String[] args) {
//		Test2 t1 = new Test2();
//	}
//
//	public void non_static_meth() {
//		System.out.print("NM ");
//	}
//
//	public static void static_meth() {
//		System.out.println("SM");
//	}
//}

//// // 12) In real world, Contructors are used to:
////
//// 1) Initialize all variables of a class
//// 2) Initialize non-static varialbles of a class
//// 3) static variables can be initialized in constructors
//// 4) Give initial state to object
//
////13) Whats the output of following program?

//public class Test2 {
//	int i;
//	int j;
//
//	Test2(int i, int j) {
//		this.i = i;
//		this.j = j;
//	}
//
//	public static void main(String[] args) {
//		Test2 t1 = new Test2();
//		Test2 t2 = new Test2();
//	}
//}

//// 13) Whats the output of following program?
//
//public class Test2 {
//	int i;
//	int j;
//
//	public static void main(String[] args) {
//
//		Test2 t1 = new Test2();
//		Test2 t2 = new Test2();
//
//		t1.j = t2.i = 5;
//		t1.i = t2.j = 6;
//
////		System.out.print(t1.j++ + " " + t2.i--);
//		System.out.print(++t1.j + " " + --t2.i);
//
//	}
//}

////13) Whats the output of following program?
//public class Test2 {
//	static int i;
//	static int j;
//
//	public static void main(String[] args) {	
//		i = j = 5;		
////		System.out.println(i + " --- " + j);
////		System.out.println(i++ + " --- " + j++);	//Print the value of i & j then increase it by 1
////		System.out.println(++i + " --- " + ++j);	//Increase the value of i & j by 1 then print
////		System.out.println(i-- + " --- " + j--);	//Print the value of i & j then increase it by 1
//		System.out.println(--i + " --- " + --j);	//Decrease the value of i & j by 1 then print
//	}
//}

////14) Whats the output of following program?
//
//public class Test2 {
//	Test2 t1= new Test2();
//	int i;
//	static int j;
//	static Test2 t2 = new Test2();
//	
//	public static void main(String[] args) {
//		t1.i=10; //1
//		i=19; //2
//		j=10; //3
//		t2.i=19; //4
//	}
//}

//// 15) Compile-time errors are generated at which lines?
//public class Test2 {
//
//	public static void main(String[] args) {
//		public int a; // 1
//		protected int b; // 2
//		private int c; // 3
//		static int d; // 4
//		transient int e; // 5
//		volatile int f; // 6
//		final int g = 1; // 7
//		int i = 7; // 8
//		int h; // 9
//		System.out.println(h); // 10
//
//	}
//}
//
//// 1. 1
//// 2. 2
//// 3. 3
//// 4. 4
//// 5. 5
//// 6. 6
//// 7. 7
//// 8. 8
//// 9. 9
//// 10. 10
//
//// 16) What will be output of follwoing?
//class JavaClass {
//	static int i;
//	static JavaClass obj;
//
//	public static void main(String[] args) {
//
//		System.out.println(obj + "" + i);
//
//	}
//}
//
//// 17) What will be output of follwoing?
//public class Test2 {
//
//	static int i;
//	static Test obj;
//
//	public static void main(String[] args) {
//
//		Test obj;
//		int i;
//		System.out.println(obj + "" + i);
//
//	}
//}
//
//// 18) A compile-time error is generated at which line?
//public class Training {
//
//	public static void main(String[] args) {
//		static int a = 1; // 1
//		int b = 1; // 2
//	}
//
//	public void abc() {
//		static int a = 1; // 3
//		int b = 1; // 4
//
//	}
//
//}
//
//// 19) Which is the valid way of calling the main1 method?
//
//public class JavaClass {
//
//	public static void main(String[] arg) {
//
//		main1(); // 1
//		JavaClass j = new JavaClass();
//		j.main1(); // 2
//	}
//
//	public void main1() {
//
//	}
//
//}
//
//// a) 1
//// b) 2
//// c) Both 1 and 2
//// d) Neither 1 nor 2
//// e) None of these
//
//// 20) Compile time errors are generated at which lines?
//
//public class JavaClass {
//
//	int i = 1;
//	static int a = 1;
//
//	public static void main(String[] args) {
//
//	}
//
//	public void nonstaticMethod() {
//		calArea(); // 1
//		nonstaticMethod(); // 2
//
//		JavaClass.calArea(); // 3
//		JavaClass t = new JavaClass();
//		t.calArea(); // 4
//
//		i = i + 1; // 5
//		a = a + 1; // 6
//
//		static int b = 1; // 7
//	}
//
//	public static int calArea() {
//
//		return 8 * 8;
//	}
//}
//
//// a) 1,2,5,7
//// b) 2,5,7
//// c) 7
//// d) 2,4,6,7
//// e) 4,5,7
//
//// 21) Compile time errors are generated at which lines?
//public class JavaClass {
//
//	int i = 1;
//	static int a = 1;
//
//	public static void main(String[] args) {
//
//		JavaClass t = new JavaClass();
//		calArea(); // 1
//		nonstaticMethod(); // 2
//
//		JavaClass.calArea(); // 3
//		t.calArea(); // 4
//
//		i = i + 1; // 5
//		a = a + 1; // 6
//
//		static int b = 1; // 7
//
//	}
//
//	public void nonstaticMethod() {
//
//	}
//
//	public static int calArea() {
//
//		return 1 * 1;
//
//	}
//}
//
//// a) 1,2,5,7
//// b) 2,5,7
//// c) 4,6,7
//// d) 2,4,6,7
//// e) 4,5,7
//
//// 22) What will be outut of following program?
//public class Test2 {
//	int i;
//	int j;
//
//	public static void main(String[] args) {
//		int area = calArea1(3, 4);
//		System.out.println(area);
//		Test2 t = new Test2();
//		area = calArea2(t);
//		System.out.println(area);
//	}
//
//	public static int calArea1(int i, int j) {
//		return i * j;
//	}
//
//	public static int calArea2(Test2 t) {
//		t.i = t.i + 10;
//		t.j = t.i + 20;
//		return t.i * t.j;
//	}
//
//}
