package Collections_Reflection;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {

		int count[] = { 34, 22, 10, 22, 30, 60 };
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < count.length; i++) {
			set.add(count[i]);
		}
		System.out.println(set);
		System.out.println(set.contains(34));
		System.out.println(set.remove(10));
//		System.out.println(set.removeAll(set));
		System.out.println(set);
		
		System.out.println("******************************");

		TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
		System.out.println(sortedSet);

		System.out.println(sortedSet.first());
		System.out.println(sortedSet.last());

	}

}
