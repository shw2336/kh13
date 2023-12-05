package data;

public class Test04자료형 {
	public static void main(String[] args) {
		//자료형이란?
		//- 데이터를 저장하기 위해 구분하는 방법
		// - 숫자는 크게 소수점 유무로 없으면 정수, 있으면 실수
		// - 빠른 처리를 위해 각자 여러 형태를 미리 정해두었다
		// - 정수 : byte, short, int, long 4가지 (int가 기본)
		// - 실수 : float, double 2가지 (double이 기본)
		// int a = 10856156185; // 자리가 부족하다
		long b = 546181511541651L; //충분한 자리를 갖는 변수(숫자뒤에 L을 적어주기)
		// 21억정도 int로 담을 수 있다
		System.out.println(b);
		
		//계산하다가 넘어갈 경우 뒤집힌다(순환한다)
		long c = 1234567L * 1234567L; //이렇게 long으로 바꾸면 계산이 됨
		System.out.println(c);
		
		//(중요) 정수의 계산 결과는 정수가 나온다(나눗셈에서도)
		int d = 10;
		int e = 3;
		System.out.println(d / e);  // 3이 나오고 나머지 1은 안나온다
		System.out.println(d % e); // 나머지를 알려주는 수식
		
	}
}
