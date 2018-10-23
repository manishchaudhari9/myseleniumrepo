package testingPackage;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add("Manish");
		
		Object [] objArr = list.toArray();
		
		System.out.println(objArr.getClass());

		
		febo(10);
		
		
		
		String s = findNumber(list, "Manish");
		System.out.print(s);
		
		String a = "abc"; 
		String b = "abc";
		System.out.println(a == b);  // true
		
		String c = new String("abc");
		String d = new String("abc");

		System.out.println(c == d);  // false
		
		String[] arr = { "anaheim", "serrano", "habanero", "thai", "anaheim" };
		
		String str ="anaheim";
		
		List <String> l = Arrays.asList(arr);
		
		System.out.println("**********  "+l.contains(str));
		
		int i = Collections.frequency(Arrays.asList(arr), str);
		System.out.println(i);
		
		String number = "10";
		Integer result = Integer.valueOf(number);
		System.out.println(result);
		
//		int x = add(23,33);
//		System.out.println(x);
		
//		String str = "Manish is good";
		
		
		

		
		double myDb = 12.3;
		int myInt = (int) myDb;	
		System.out.println(myInt);
		
		
		int myInt1 = 12;
		double myDb1 = (double) myInt1;	
		System.out.println(myDb1);
		
		
		System.out.println(Math.round(myDb1));
		
//		String myStr = "Manish";
//		double myDb2 = (String) myStr ;	
//		System.out.println(myDb1);
		
		
//			String s1="javatpoint";  
//			System.out.println(s1.substring(0,6));//returns va  
//			System.out.println(s1.substring(2));//returns vatpoint  
		  
		
		
//		System.out.println(arr[0]);
//		List<Object> list = Arrays.asList(chiles);	
//		System.out.println(list);
//		System.out.println(list.get(0));	
//		System.out.println(reverse("Hi manish"));
	
	}

	
	public static String findNumber(List<Object> list, Object value) {
		String a;
		if (list.contains(value)) {
			a = "YES";
		} else {
			a = "NO";
		}
		return a;
	}

	// /Odd numbers between range

	public int countOdds(int[] values) {
		int countOdd = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] % 2 != 0) {
				countOdd++;
			}
		}
		return countOdd;
	}
	
    public static String reverse(String str){
	        char[] arr = str.toCharArray();
	        String revStr = "";
	        for (int i = arr.length-1; i>=0; i--){
	        	revStr = revStr+arr[i];
	        }	            
			return revStr;
	    }
    
    
    public static void febo(int num){
    	
    	// Set it to the number of elements you want in the Fibonacci Series 
    			 int num1 = 0;
    			 int num2 = 1;
    			 
    		        System.out.print("Fibonacci Series of "+num+" numbers:");
    	 
    		        for (int i = 1; i <= num; ++i)
    		        {
    		            System.out.print(num1+" ");
   		      
    		            int sum = num1 + num2;
    		            num1 = num2;
    		            num2 = sum;
    		        }
    	 
    	
    }
    
	
	

}
