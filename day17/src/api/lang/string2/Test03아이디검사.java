package api.lang.string2;

public class Test03아이디검사 {
	public static void main(String[] args) {
//		맨 앞자리는 영문 소문자 또는 숫자로 작성
//		전체 글자수는 5~20자로 설정
//		나머지 자리는 영문 소문자,숫자,대시,언더바로 구성
		
		String name = "shw2336";
		
		String regex = "^[a-z 0-9]{1}[a-z 0-9\\-_]{4,19}$";


		 
		if(name.matches(regex)) {
			System.out.println("아이디 생성");
		}
		else {
			System.out.println("아이디 생성안됨");
		}
			
		

		
				
	}

}
