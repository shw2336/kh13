package api.lang.string2;

public class Test01전화번호검사3 {
	public static void main(String[] args) {
		//(Q) 사용자가 입력한 전화번호가 올바른 전화번호인지 검사하여 출력
		String number = "010-123-5678";
		
		String regex = "^01[016-9]-[1-9][0-9]{2,3}-[0-9]{4}$";
		
		System.out.println(number.matches(regex));
	}

}
