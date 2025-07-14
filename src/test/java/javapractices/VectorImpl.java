package javapractices;

import java.util.Vector;

public class VectorImpl {

	public static void main(String[] args) {
		Vector<Integer> num = new Vector<Integer>();

		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(5);
		num.add(7);
		num.add(10);
		num.add(null);

		for (Integer n : num) {
			System.out.println(n);
		}

		System.out.println(num.get(4));

	}

}
