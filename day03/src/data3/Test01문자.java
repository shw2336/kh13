package data3;

public class Test01문자 {
	public static void main(String[] args) {
		//자바의 문자 표현 방식
		//-자바는 유니코드셋을 표현할 수 있다
		//-char 형태로 표현 (캐릭터)[한 글자만 가능]
		// A 65번  / a 97번
		//가 44032번 / 힣 55203번
		char a = '가';
		System.out.println(a);

		int b = a;
		System.out.println(b);
		
		char c =44032;
		System.out.println(c);
	}

}
