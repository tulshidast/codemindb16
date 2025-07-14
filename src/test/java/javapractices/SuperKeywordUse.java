package javapractices;

public class SuperKeywordUse {

	public static void main(String[] args) {

		ChildSuper c = new ChildSuper();
		// c.testP();
		c.testC();
	}

}

class ParentSuper {

	// instance member variables
	int parentAge = 40;

	// instance member method/function
	public void testP() {
		System.out.println("Parent test method");
	}

	public ParentSuper() {

	}

	public ParentSuper(int a, int b) {
		System.out.println(a + b);
	}

}

class ChildSuper extends ParentSuper {

	// instance member variables
	int childAge = 20;
	int parentAge = 80;

	// instance member method/function
	public void testC() {

		// super.testP();
		System.out.println("Child test method");
		System.out.println(parentAge + super.parentAge);

	}

	public ChildSuper() {
		super(20, 30);
	}

}
