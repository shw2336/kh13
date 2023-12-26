package api.lang.string;

public class Test04문자열검사 {
	public static void main(String[] args) {
		String url = "http://www.naver.com"; //http 보다 https가 보안이 강화된 형태
		
		//홈페이지 주소인가? (http로 시작하는가)		
		System.out.println("http로 시작?" + url.startsWith("http"));
		System.out.println("https로 시작?" + url.startsWith("https"));
		
		
		//회사 주소인가(.com으로 끝나는가)
		System.out.println(".com으로 종료?" + url.endsWith(".com"));
		
		//네이버 주소인가?(naver가 들어있는가)
		System.out.println("naver 포함?" + url.contains("naver"));
		
		//네이버가 어디에 있어요?
		System.out.println("naver 위치 = " + url.indexOf("naver")); //index는 자료형 int에 있다 위에있는것들은 전부 String에 있다  true false 구분 가능
		System.out.println("kakao 위치 = " + url.indexOf("kakao")); //int라서 false를 보여줄 수 없다 // 위치가 없으니 -1이 나온다
		
		//글자 수 
		System.out.println("글자 수 = " + url.length());
		
		//특정 위치의 글자를 추출
		char a = url.charAt(11);
		
		System.out.println("+11 위치의 글자" + url.charAt(3));
		System.out.println("+11 위치의 글자" + a); //변수를 이용해서 구하는 위치의 글자
	}
}