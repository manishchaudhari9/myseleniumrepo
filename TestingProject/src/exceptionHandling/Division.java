package exceptionHandling;

public class Division {

	public static void main(String[] args) throws Exception {

		// final int x = 100;
		// // x= 102;
		// System.out.println(x+50);
		//
		//
		// try{
		// int i = 2/0;
		// System.out.println(i);
		// }catch(Throwable e){
		// System.out.println("Exception "+ e.getMessage());
		// e.printStackTrace();
		//
		// }
		//
		// System.out.println("Test");
		// }

		String[] x = new String[2];

		x[0] = "Manish";
		x[1] = "Tanishka";
//		x[2] = "Sarita";
//		x[3] = "Gaargi";
//		x[4] = "Gaurangi";
		
		System.out.println(x[0]);
		Thread.sleep(1000);
		System.out.println(x[1]);
		
		throw new Exception("Custom Exception");
	}
}
