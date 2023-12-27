package api.lang.string2;

public class Test04둘중하나 {
	public static void main(String[] args) {
		
		String greet = "hi";
		
		String regex = "^(hello|hi)$"; //hello 또는 hi만 가능
		
		System.out.println(greet.matches(regex));
		
		
	}

}
