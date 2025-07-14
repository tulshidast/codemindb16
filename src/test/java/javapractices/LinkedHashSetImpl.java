package javapractices;

import java.util.LinkedHashSet;

public class LinkedHashSetImpl {

	public static void main(String[] args) {
		LinkedHashSet<Integer> panNumers = new LinkedHashSet<Integer>();

		panNumers.add(1);
		panNumers.add(2);
		panNumers.add(5);
		panNumers.add(1);
		panNumers.add(4);
		panNumers.add(null);

		for (Integer i : panNumers) {
			System.out.println(i);
		}

	}

}
