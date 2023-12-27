package api.lang.string2;

public class Test02이름검사2 {
	public static void main(String[] args) {

		String name = "피카츄";

		//regex는 regular expression(정규 표현식)의 줄임 표현이다
		String regex = "^[가-힣]{1,2}[가-힣]{1,5}$";
		//String regex = "^[가-힣]{2,7}$";

		//참고 : 낱자까지 모두 검사하고 싶다면 ^[ㄱ-ㅎㅏ-ㅣ가-힣]{2,7}$

		if(name.matches(regex)) {//형식과 일치한다면
			System.out.println("멋진 이름입니다!");
		}
		else {//형식과 일치하지 않는다면
			System.out.println("올바른 한국 이름이 아닙니다");
		}

	}
}