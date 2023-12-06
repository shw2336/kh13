package data2;

public class Test04변환연산 {
	public static void main(String[] args) {
		//같은 숫자여도 형태가 다를 수 있다
		
		//int는 long보다 작기 때문에 값을 자연스럽게 옮길 수 있다
		//-묵시적 형변환(자동 형변환)
		int a = 10;
		long b = a;
		
		//long은 int보다 크기 때문에 값을 자연스럽게 옮길 수 없다
		//-명시적 형변환(강제 형변환)
		long c = 10L;
		//int d = c; //error 에러떴다.
		int d = (int) c;
		System.out.println(d);
		
		// 위 코드의 결론은 int < long (이걸로 크기 비교 가능)
		int v1 =12;
		double v2 = v1; //자동 변환
		System.out.println(v2);
		
		double v3 = 12.345; // 이게 12뒤에 소수점 없어도 변환안된다 double이기때문에
		int v4 = (int) v3; // 강제변환
		System.out.println(v4); //여기서 알 수 있다. int보다 double이 더 크다
		
	}
}
