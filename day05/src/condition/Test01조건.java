package condition;

public class Test01조건 {
	public static void main(String[] args) {
		//홀수 짝수 판정 프로그램
		//- 주어진 값이 홀수라면 "홀수입니다" 출력
		//- 주어진 값이 짝수라면 "짝수입니다" 출력
		
		// 입력
		int number = 122;
		
		//계산
		boolean odd = number % 2 != 0;
		boolean even = number % 2 == 0;
		// 출력
		if(odd == true) {
			System.out.println("홀수입니다");
		}
		
		if(even == true) {
			System.out.println("짝수입니다");
		}
	}
}
