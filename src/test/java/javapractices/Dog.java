package javapractices;

public class Dog {

	// properties
	String color;
	int age;

	int c = 9;

	static String species = "animal";

	public static void main(String args[]) {
		Dog d = new Dog();
		d.eating();
	}

	// Behavior
	public void eating() {
		int c = 25;
		System.out.println(Math.sqrt(this.c));
		System.out.println(Math.sqrt(c));
		float height = 2.5f;
		System.out.println("Dog is eating");
	}

	public void barking() {
		color = "white";
		System.out.println("Dog id eating");
	}

	public static void test() {

	}

}
