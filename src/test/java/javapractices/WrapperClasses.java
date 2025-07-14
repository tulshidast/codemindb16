package javapractices;

public class WrapperClasses {

	public static void main(String[] args) {

		WrapperClasses w = new WrapperClasses();
		w.integerWrapperClass();

	}

	public void integerWrapperClass() {
		Integer a = 10;
		Integer b = 20;

		Integer result = a + b;

		// un-boxing
		int d = a.intValue();

		// auto boxing
		Integer e = Integer.valueOf(d);

		Character ch = 'C';

		// un-boxing
		char ch1 = ch.charValue();

		// auto boxing
		Character ch2 = Character.valueOf(ch1);

		System.out.println(result);

	}

}
