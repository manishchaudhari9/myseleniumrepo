package Collections_Reflection;

import java.util.ArrayList;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
//		//************  HashTable  ************
		Hashtable<String, String> t1 = new Hashtable<String, String>();
		t1.put("name", "Manish");
		t1.put("sex", "Male");
		t1.put("country", "India");
		
		Hashtable<String, String> t2 = new Hashtable<String, String>();
		t2.put("name", "Tanishka");
		t2.put("sex", "Female");
		t2.put("country", "UAS");
		
//		Hashtables in a hashtable
		Hashtable<String, Hashtable<String, String>> t = new Hashtable<String, Hashtable<String, String>>();
		t.put("name", t1);
		
//		System.out.println(t);
//		System.out.println(t.get("name").get("name"));
		
		
//		List of Hashtables
		ArrayList<Hashtable<String, String>> lh = new ArrayList<Hashtable<String, String>>();
		
		lh.add(t1);
		lh.add(t2);
		
		for (int j=0; j<lh.size(); j++){
			System.out.println(lh.get(j).get("sex"));
		}

	}

}
