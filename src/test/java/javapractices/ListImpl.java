package javapractices;

import java.util.ArrayList;
import java.util.List;

public class ListImpl {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<Integer>();

		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(5);
		num.add(7);
		num.add(7);
		num.add(10);
		num.add(null);

		for (Integer i : num) {
			System.out.println(i);
		}
	}

}
