package api.lang.string2;

public class Test04둘중하나2 {
	public static void main(String[] args) {

		//String greet = "hello";
		String greet = "hi Bob";

		//String regex = "^(hello|hi)$";//hello 또는 hi만 가능
		String regex = "^(hello\\s(Tom|Jerry)|hi\\s(Bob|Jack))$";

		System.out.println(greet.matches(regex));

	}
}