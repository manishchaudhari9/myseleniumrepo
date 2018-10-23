package testingPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {

		
		//Function to convert string to integer
		//
		
		
		List<Object> list = new ArrayList<Object>();		
		int[] arr = {1,6,3,2,4};	
		
//		arr.
		
		for (int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}	
		//Print array in ascending order
		System.out.println("--------------");
		
		Arrays.sort(arr);
		
		for (int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("--------------");
		//Print array in descending order		
		for (int i=arr.length-1; i>=0; i--){
			System.out.println(arr[i]);
		}

	}

}