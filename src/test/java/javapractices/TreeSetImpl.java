package javapractices;

import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		TreeSet<Integer> panNumers = new TreeSet<Integer>();

		panNumers.add(1);
		panNumers.add(2);
		panNumers.add(5);
		panNumers.add(1);
		panNumers.add(4);
		//panNumers.add(null);

		for (Integer i : panNumers) {
			System.out.println(i);
		}

	}

}
