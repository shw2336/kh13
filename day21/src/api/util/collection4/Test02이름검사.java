package api.util.collection4;

public class Test02이름검사 {
	public static void main(String[] args) {
		
		String name = "피자좋아ㅡㅋㅎㅡ";
		
		//regex는 regular expression(정규 표현식)의 줄임 표현이다

				String regex = "^[ㄱ-ㅎㅏ-ㅣ가-힣]{1,10}$";
		//		String regex = "^[가-힣]{1,2}[가-힣]{1,5}$";
		//String regex = "^[가-힣]{2,7}$";
		
		//참고 : 낱자까지 모두 검사하고 싶다면 ^[ㄱ-ㅎㅏ-ㅣ가-힣]{2,7}$
		
		System.out.println(name.matches(regex));
		
	}
}