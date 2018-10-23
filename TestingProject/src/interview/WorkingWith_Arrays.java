package interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;

public class WorkingWith_Arrays {

	public static void main(String[] args) {
		// // 1.Copy all the elements of one array into another array
//		int[] arr1 = { 1, 2, 3, 4, 5 };
//		Object[] strArray = { "Manish", "Tanishka", "Sarita" };
//		int[] arr2 = new int[arr1.length];

		// //2. Check whether a single swap is sufficient to sort an array of
		// integers
		// int[] arr = new int[] { 1, 5, 3, 3, 7 };
		// System.out.println(check(arr));
		//
		// int[] arr1 = new int[] { 1, 3, 5, 3, 4 };
		// System.out.println(check(arr1));

		// // 3. Given an array find pairs that add up to a given sum
		// int[] arr = {1,2,3,4,5,6,7,8,6,5};
		// findPairs(arr, 10);

		 // 4. Find duplicate values in an array
		 Integer[] arr = {1,2,3,4,5,6,7,8,6,5};
		 findDuplicate(arr);

		// // 5. Find out the most frequent character in a string
		// String str = "tanisshka";
		// mostFrequentCharacter(str);

		// // 7. Return true if both the arrays are same.		
//		int arr1[] = {1, 2, 3}; 
//	    int arr2[] = {1, 3, 2};
//		isArrayMatching(arr1, arr2);
		
		// String str = "testString";
		// char[] charArray = str.toCharArray();
		// Character[] charObjectArray = ArrayUtils.toObject(charArray);
		//
		// List<Character> list = Arrays.asList(charObjectArray);
		//
		// for (int i=0; i<list.size(); i++){
		// Collections.frequency(list, list.get(i));
		// }
		// System.out.println(list.get(0));

		// // Copy one array into another and COMPLETE / PARTIAL array
		// int[] arr = {1,2,3,4,5,6,7,8,6,5};
		// // Arrays.sort(arr, Collections.reverseOrder());
		// for (int e : arr){
		// System.out.println(e);
		// }
		//
		// int[] arr111 = Arrays.copyOf(arr, arr.length);
		// // Arrays.sort(arr111);
		// //
		// int[] arr222 = Arrays.copyOfRange(arr, 0, 3);
		//
		// int[] arr333 = ArrayUtils.addAll(arr111, arr222);
		//
		// for (int i : arr333){
		// System.out.println(i);
		// }
		//
		// for (int e : arr111){
		// System.out.println(e);
		// }
		// System.out.println("*************************");
		// for (int e : arr222){
		// System.out.println(e);
		// }

		// String str = "wwmanddisha";
		// int len = str.length();
		//
		// char chr = 'x';
		// int maxCount = 0;
		//
		// for(int i=0; i<len; i++){
		// int count = 0;
		// for(int j=0; j<len; j++){
		// if (str.charAt(i) == str.charAt(j)){
		// count++;
		// }
		// }
		//
		// if(count > maxCount){
		// maxCount = count;
		// chr = str.charAt(i);
		// }
		// }
		// System.out.println(chr + "--"+ maxCount);
		//

		// ////Convert String to Integer | Integer.parseInt returns int |
		// Integer.valueOf returns Integer
		// String str = "3456";
		//
		// int a = Integer.parseInt(str);
		// System.out.println(a);
		//
		// Integer b = Integer.valueOf(str);
		// System.out.println(b);

		// Integer[] numArr = {100, 200, 300, 400, 500};
		// List<Integer> numList = Arrays.asList(numArr);
		//
		// System.out.println("size of list is : " + numList.size());
		// System.out.println("elements in list : " + numList);
		//
		// numList.set(3,600); // Update the 4th element in list
		//
		// System.out.println("After update, elements in list : " + numList);
		// System.out.println("4th element in list is : " + numList.get(3));
		// System.out.println("4th element in array is : " + numArr[3]);

		
//
//		// Let us create different types of arrays and 
//        // print their contents using Arrays.toString() 
//        boolean[] boolArr = new boolean[] { true, true, false, true }; 
//        byte[] byteArr = new byte[] { 10, 20, 30 }; 
//        char[] charArr = new char[] { 'g', 'e', 'e', 'k', 's' }; 
//        double[] dblArr = new double[] { 1, 2, 3, 4 }; 
//        float[] floatArr = new float[] { 1, 2, 3, 4 }; 
//        int[] intArr = new int[] { 1, 2, 3, 4 }; 
//        long[] lomgArr = new long[] { 1, 2, 3, 4 }; 
//        Object[] objArr = new Object[] { 1, 2, 3, 4 }; 
//        short[] shortArr = new short[] { 1, 2, 3, 4 }; 
//        
////        Arrays.toString(boolArr);
//  
//        System.out.println(Arrays.toString(boolArr).contains("dsdsds")); 
//        System.out.println(Arrays.toString(byteArr)); 
//        System.out.println(Arrays.toString(charArr)); 
//        System.out.println(Arrays.toString(dblArr)); 
//        System.out.println(Arrays.toString(floatArr)); 
//        System.out.println(Arrays.toString(intArr)); 
//        System.out.println(Arrays.toString(lomgArr)); 
//        System.out.println(Arrays.toString(objArr)); 
//        System.out.println(Arrays.toString(shortArr));

//		int[] arr = {1, 2,3,4,5  ,6};
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr).contains(" 5"));
//		
//        Arrays.fill(arr, 10);
//        System.out.println(Arrays.toString(arr));
        
        

	}
	


	// //*******************************************************************
	// // 1. Copy all the elements of one array into another array

	public static void copyArray(int[] arr1, int[] arr2) {
		// Copying all elements of one array into another
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		// Displaying elements of array arr2
		System.out.println("Elements of new array: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

	// //*******************************************************************
	// // 2. Check whether a single swap is sufficient to sort an array of
	// integers

	public static boolean check(int[] A) {

		int count = 0;
		int[] B = Arrays.copyOf(A, A.length);

		Arrays.sort(B);

		for (int i = 0; i < A.length; i++) {
			if (A[i] != B[i])
				count++;
		}

		if (count > 2) {
			return false;
		}

		return true;
	}

	// //*******************************************************************
	// // 3. Given an array find pairs that add up to a given sum

	public static void findPairs(int[] arr, int sum) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] + arr[j] == sum) {
					System.out.println("Pair : " + arr[i] + "_" + arr[j]);
				}
			}
		}
	}

	// //*******************************************************************
	// // 4.1 Find duplicate values in an array

	public static void findDuplicate(Integer[] arry) {

//		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arry));
		List<Integer> list = Arrays.asList(arry);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			int element = itr.next();
			if (Collections.frequency(list, element) > 1) {
				System.out.println(element + " - "+ Collections.frequency(list, element));
			}
		}
	}

	// //*******************************************************************
	// // 4.2 Find duplicate values in an array
//	public static void findDuplicate(Integer[] arry) {
//
//		Set<Integer> set = new HashSet<Integer>();
//
//		for (int i = 0; i < arry.length; i++) {
//			for (int j = 0; j < arry.length; j++) {
//				if (i != j && arry[i] == arry[j]) {
//					set.add(arry[i]); // This is to eliminate the dups.
//				}
//			}
//		}
//
//		Iterator<Integer> itr = set.iterator();
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//	}

	// //*******************************************************************
	// // 5. Find out the most frequent character in a string

	public static char mostFrequentCharacter(String str) {
		char chr = 'x';
		int maxCount = 0;

		for (int i = 0; i < str.length(); i++) {
			int charCount = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					charCount++;
				}
			}
			if (charCount > maxCount) {
				maxCount = charCount;
				chr = str.charAt(i);
			}
		}
		System.out.println(chr);
		return chr;
	}

	// ////*******************************************************************
	// //// 6. Find out occurrence of an element in an array

	
	// ////*******************************************************************
	// //// 7. Return true if both the arrays are same.
	public static boolean isArrayMatching(int[] arr1, int[] arr2) {
		System.out.println(Arrays.equals(arr1, arr2));
		return Arrays.equals(arr1, arr2);
	}
	

}
