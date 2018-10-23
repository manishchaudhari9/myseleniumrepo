package interview;

public class String_Functions {

	public static void main(String[] args) {
		
		String str = "I am learning JAVA from the scratch";
		
//		System.out.println(str.contains("Manish"));	//true
//		System.out.println(str.charAt(0));
//		System.out.println(str.concat(" boy"));
//		System.out.println(str.startsWith("Manish"));
//		System.out.println(str.endsWith("boy"));
//		System.out.println(str.isEmpty());
//		System.out.println(str.length());
//		System.out.println(str.matches("Manish%"));
		
        StringBuilder sb = new StringBuilder(str);
//        System.out.println(sb);
//        System.out.println(sb.reverse());
//        System.out.println(sb.equals(str));
        sb.reverse();
        
//      //Compare StringBuilder to String object
        if (sb.toString().equals(str)){
        	System.out.println("Matching");
        }else{
        	System.out.println("Not Matching");
        }
        System.out.println(str);
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

}
