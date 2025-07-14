package javapractices;

import java.util.HashSet;
import java.util.Set;

public class HashSetImpl {

	public static void main(String[] args) {
		HashSet<Integer> panNumers = new HashSet<Integer>();

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
