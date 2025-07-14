package javapractices;

import java.util.TreeMap;

public class LinkedHashMapImpl {

	public static void main(String[] args) {

		TreeMap<String, String> driverDetails = new TreeMap<String, String>();

		driverDetails.put("MH12AB1234", "Sachin");
		driverDetails.put("MH12AB1233", "Hardik");
		driverDetails.put("MH12AB1235", "Virat");
		driverDetails.put("MH12AB1237", "Ravindra");
		driverDetails.put("MH12AB1236", "Sachin");
		driverDetails.put(null, "Sachin");
		driverDetails.put("MH14DF8438", null);
		driverDetails.put("MH14DF8439", null);

		System.out.println(driverDetails);

	}

}
