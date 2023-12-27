package api.lang.string2;

public class Test03아이디검사2 {
	public static void main(String[] args) {

		String id = "hello1234";

		String regex = "^[a-z0-9][_\\-a-z0-9]{4,19}$";

		if(id.matches(regex)) {//형식과 일치한다면
			System.out.println("멋진 아이디입니다!");
		}
		else {//형식과 일치하지 않는다면
			System.out.println("5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다.");
		}

	}
}