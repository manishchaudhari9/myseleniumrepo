package Collections_Reflection;

import java.util.*;
import java.util.stream.Collectors;

public class Lists {

	public static void main(String[] args) {

//		//************  LIST  ************
//		List<Object> list = new ArrayList<Object>();
////		List<Object> list = new LinkedList<Object>();
//		list.add(100);
//		list.add("Manish");
//		
//		System.out.println(list.getClass().getName());
//		list.stream();
//		System.out.println(list.getClass().getName());
//		list.forEach(item -> {
//			if (item.equals("Manish")) {
//				System.out.println(item);
//			}
//		});
		
		
		
////------------------------------------------------------		
		// Create a list of strings 
        List<String> al = new ArrayList<String>(); 
        al.add("Banana");
        al.add("Cucumber");
        al.add("Apple");
        al.add("Blueberry");
       
        Collections.sort(al);	//Sort in Ascending order
        System.out.println("Ascending order : " + al);
        
        Collections.sort(al, Collections.reverseOrder()); //Sort in Decending order
        System.out.println("Decending order : " + al);
        
////------------------------------------------------------        
	
//		//--------Converting Integer Array into List	
//		Integer[] arryInteger = {1,2,3,4,5,6};
//		List<Integer> list = Arrays.asList(arryInteger);
//		List<Integer> l = list.subList(0, 3);
//		System.out.println(Collections.frequency(list, 4));
//		System.out.println(Collections.frequency(l, 4));
//		System.out.println("************************");
//		
//		//Print list
//		list.forEach(item ->{
//			System.out.println(item);
//		});	
//		
//		System.out.println("************************");
//		//Print l
//		l.forEach(item ->{
//			System.out.println(item);
//		});
//		
//
//		//----------- Converting int array to an Integer array ------------
//		System.out.println("************************");
//		int[] intArr = {1,2,3,4,5,6,7};
//		List<Integer> lst  = Arrays.stream(intArr).boxed().collect(Collectors.toList());
//		System.out.println(Collections.frequency(lst, 4));
		
		
//		//************  ArrayList  ************
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("Zero");
//		list.add(1, "One");
//		list.add(2, "Two");
//
//		ArrayList<String> list2 = (ArrayList<String>) list.clone();
//
//		System.out.println(list);
//		System.out.println(list2);
//
//		list.clear();
//		list2.remove(0);
//		
//		System.out.println(list);
//		System.out.println(list2);
//		
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println(list2.get(i));
//		}
//		
//		Iterator<String> itr = list2.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
	}
}