package testingPackage;

public class ThisKeyword {
	int a;
	int b;

	public static void main(String[] arg) {
		ThisKeyword th = new ThisKeyword();
		th.setData(10, 12);
		th.showData();

		String name = "James";

		StringBuilder sb = new StringBuilder(name);

		// following will return true since name is type of String
		boolean result = name instanceof String;
		System.out.println(result);

	}

	public void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void showData() {
		System.out.println("Value of A = " + a);
		System.out.println("Value of B = " + b);
	}

}
