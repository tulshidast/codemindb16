package javapractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetMethods {

	public static void main(String[] args) {

		LinkedHashSet<Integer> l0 = new LinkedHashSet<Integer>();

		// Appends the specified element to the end of this list
		l0.add(50);
		l0.add(60);

		LinkedHashSet<Integer> l1 = new LinkedHashSet<Integer>();

		// Appends the specified element to the end of this list
		l1.add(5);
		l1.add(10);

		for (Integer i : l1) {
			System.out.println(i);
		}

		System.out.println("#####################################");
		// Appends all of the elements in the specified collection to the end ofthis
		// list
		l1.addAll(l0);

		for (Integer i : l1) {
			System.out.println(i);
		}

		System.out.println("#####################################");

//		l1.clear();
//
//		for (Integer i : l1) {
//			System.out.println(i);
//		}

		System.out.println("#####################################");

		// Returns true if this list contains the specified element
		System.out.println("L1 Contains Element 5 = " + l1.contains(5));
		System.out.println("L1 Contains Element 500 = " + l1.contains(500));

		System.out.println("#####################################");

		System.out.println("L1 Contains Element L0 = " + l1.containsAll(l0));

		System.out.println("#####################################");

		// Returns true if this list contains no elements.
		System.out.println("L1 is empty = " + l1.isEmpty());
//		l1.clear();
//		System.out.println("L1 is empty = " + l1.isEmpty());

		System.out.println("#####################################");

		Object[] a = l1.toArray();

		for (Object o : a) {
			System.out.println(o);
		}

		System.out.println("#####################################");

		System.out.println("Size of list = " + l1.size());

		System.out.println("#####################################");

		l1.remove(2);

		for (Integer o : l1) {
			System.out.println(o);
		}

		System.out.println("#####################################");

		Iterator<Integer> it = l1.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("#####################################");
		// l1.sort(((o1, o2) -> -2));

		ArrayList<Integer> l4 = new ArrayList<>(l1);

		Collections.sort(l4);

		Collections.reverse(l4);

		it = l4.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("#####################################");

		LinkedHashSet<Integer> hset = new LinkedHashSet<Integer>(l4);
		it = hset.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
