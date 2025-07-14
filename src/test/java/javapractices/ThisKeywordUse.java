package javapractices;

public class ThisKeywordUse {

	String name;

	public ThisKeywordUse() {
		this(10);
		System.out.println("Defaut constructor");
	}

	public ThisKeywordUse(int age) {
		this(20, 25000f);
		System.out.println("Single parameterized constructor");
	}

	public ThisKeywordUse(int age, float salary) {
		System.out.println("two parameterized constructor");
	}

	public static void main(String[] args) {

//		Employee e = new Employee("sachin", 29, "tech lead");
//
//		e.pritEmployeeDetails();
//
//		System.out.println("E hash code = " + e.hashCode());

		ThisKeywordUse t = new ThisKeywordUse();
		System.out.println(t.hashCode());
		t.sum();
		t.details("Sachin tendulkar");

	}

	public void sum() {
		System.out.println(this.hashCode());
		this.sub();
	}

	public void sub() {
		System.out.println(20 - 10);
	}

	public void details(String name) {
		this.name = name;
		System.out.println("Name = " + this.name);
	}

}

class Employee {

	// instance/object/example member variable
	String name;
	float age;
	String designation;

	public Employee(String n, float a, String d) {

		System.out.println("this hash code = " + this.hashCode());

		name = n;
		age = a;
		designation = d;

	}

	public String getName() {
		return name;
	}

	public float getAge() {
		return age;
	}

	public String getDesignation() {
		return designation;
	}

	public void pritEmployeeDetails() {
		System.out.println(this.getName());
		System.out.println(this.getAge());
		System.out.println(this.getDesignation());
	}

}
