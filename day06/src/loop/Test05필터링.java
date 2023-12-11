package loop;

public class Test05필터링 {
	public static void main(String[] args) {
		//다음 숫자를 화면에 출력해보세요
		//1.'1' 부터 '20'  사이의 홀수
		//2.'1' 부터 '50' 사이의 3의 배수
		for(int i=1 ; i<=20; i=i+2) {
			System.out.print(i+ "\t");
		}
		System.out.println();
		for(int j=3 ; j<=50; j=j + 3) {
			System.out.print(j+ "\t");
		}
	}
}