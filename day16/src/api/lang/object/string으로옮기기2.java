package api.lang.object;

public class string으로옮기기2 {
	public static void main(String[] args) {
		//문자열(String)
		//- 자바에서 제공하는 문자열 제어 클래스
		//- 정말 몇 개 안되는 new 없이 객체가 생성되는 클래스
		
		//객체 생성
		String a = new String();
		String b = new String("hello");
		
		StringBuffer c = new StringBuffer("hello");
		String d = new String(c);
		
		String e = "hello";
		String f = "hello";
		
		//정보 출력
		//System.out.println("a = " + a.toString());
		System.out.println("a = " + a); //a안에 있는게 아무것도 없지만 a라는 객체는 있따 지갑은 있으나 돈은 없다 차는 있으나 사람이 없다 비슷한 느낌
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		
		//비교 연산? 객체에서는 사용하기가 까다롭다 // 문자열에서는 비교 연산 쓰지말자
		System.out.println("b랑 d랑 같나요? " + (b == d));
		System.out.println("d랑 e랑 같나요? " + (d == e));
		System.out.println("e랑 f랑 같나요? " + (e == f));
		System.out.println("b랑 f랑 같나요? " + (b == f));
		
		//비교 메소드
		System.out.println("b랑 d랑 같나요? " + (b.equals(d)));
		System.out.println("d랑 e랑 같나요? " + (d.equals(e)));
		System.out.println("e랑 f랑 같나요? " + (e.equals(f)));
		System.out.println("b랑 f랑 같나요? " + (b.equals(f)));
	}

}
