package javapractices;

public class FinalKeywordUse {

	// instance member variable
	int mobNum = 1099889883;

	// final instance member variable
	final long adharNum = 23244344554L;

	// static variable
	static String companyName = "Infosys";

	public static void main(String[] args) {

	}

	public void testFinalVariable(int a, int b) {

		mobNum = 90388375;

		// getting compile time error because final variable re assignment is not
		// allowed
		// adharNum = 7388754837589L;

		// local varible
		int calResult = a + b;

	}

	final public void finalMethod() {
		System.out.println("Final method");
	}

}

class ChildForMethodOverriding extends FinalKeywordUse {

//	public void finalMethod()
//	{
//		System.out.println("Overriden method");
//	}

}
