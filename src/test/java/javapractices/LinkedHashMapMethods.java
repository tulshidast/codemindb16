package javapractices;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapMethods {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> driverDetails = new LinkedHashMap<Integer, String>();
		driverDetails.put(4, "Virat");
		driverDetails.put(1, "Sachin");
		driverDetails.put(3, "Hardik");
		driverDetails.put(2, "Ravindra");

		LinkedHashMap<Integer, String> driverDetails_1 = new LinkedHashMap<Integer, String>();
		driverDetails_1.put(7, "Sachin");
		driverDetails_1.put(8, null);
		driverDetails_1.put(9, null);

		driverDetails.putAll(driverDetails_1);

		Set<Entry<Integer, String>> s = driverDetails.entrySet();

		for (Entry<Integer, String> e : s) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		System.out.println("####################################################");

//		driverDetails.clear();
//		s = driverDetails.entrySet();
//
//		for (Entry<Integer, String> e : s) {
//			System.out.println(e.getKey() + " : " + e.getValue());
//		}

		System.out.println("####################################################");

		System.out.println("key 7 contains = " + driverDetails.containsKey(7));
		System.out.println("key 100 contains = " + driverDetails.containsKey(100));

		System.out.println("value sachin contains = " + driverDetails.containsValue("Sachin"));
		System.out.println("value vivek contains = " + driverDetails.containsValue("vivek"));

		System.out.println("####################################################");
		System.out.println(driverDetails.get(4));
		System.out.println("####################################################");
		System.out.println("Is may empty = " + driverDetails.isEmpty());
		System.out.println("####################################################");
		Set<Integer> keys = driverDetails.keySet();
		for (Integer i : keys) {
			System.out.println(i);
		}
		System.out.println("####################################################");
		driverDetails.remove(7);

		// s.clear();

		s = driverDetails.entrySet();

		for (Entry<Integer, String> e : s) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		System.out.println("####################################################");

		driverDetails.replace(8, "Sandeep");

		s = driverDetails.entrySet();

		for (Entry<Integer, String> e : s) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		System.out.println("####################################################");

		System.out.println(driverDetails.size());

		System.out.println("####################################################");

		Collection<String> values = driverDetails.values();

		for (String v : values) {
			System.out.println(v);
		}

		System.out.println("####################################################");

		Set<Entry<Integer, String>> ent = driverDetails.entrySet();
		Iterator<Entry<Integer, String>> itr = ent.iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> entr = itr.next();
			System.out.println(entr.getKey() + " : " + entr.getValue());
		}

	}

}
