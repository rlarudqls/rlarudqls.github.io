package hello;

public class Hello {

	public static void main(String[] args) {
		String x = null;
		giveMeAString(x);
		System.out.println(x);
	}
	static void giveMeAString(String y) {
		y= "This is a string";
	}
}
