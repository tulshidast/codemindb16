package javapractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		// this is changes by another user

		ArrayList<Integer> l0 = new ArrayList<Integer>();

		// Appends the specified element to the end of this list
		l0.add(50);
		l0.add(60);

		ArrayList<Integer> l1 = new ArrayList<Integer>();

		// Appends the specified element to the end of this list
		l1.add(5);
		l1.add(10);

		l1.add(1, 100);

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

		l1.addFirst(1);
		l1.addLast(1000);

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

		System.out.println("2 index element = " + l1.get(2));

		System.out.println("#####################################");

		System.out.println("First element = " + l1.getFirst());
		System.out.println("Last element = " + l1.getLast());

		System.out.println("#####################################");

		System.out.println("Index of 50 = " + l1.indexOf(50));

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

		List l2 = l1.subList(3, 6);

		for (Object o : l2) {
			System.out.println(o);
		}

		System.out.println("#####################################");

		List l3 = l2.reversed();

		for (Object o : l3) {
			System.out.println(o);
		}

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

		Collections.sort(l1);

		Collections.reverse(l1);

		it = l1.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
