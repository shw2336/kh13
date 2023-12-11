package loop;

public class Test05필터링3 {
	public static void main(String[] args) {
		//다음 숫자를 화면에 출력해보세요
		//- '1' 부터 '20'  사이의 홀수
		//- '1' 부터 '50' 사이의 3의 배수
		for(int i=1 ; i<=19; i=i+2) {
			System.out.print(i+ "\t");
		}
		System.out.println();
		for(int i=3 ; i<=48; i=i + 3) {
			System.out.print(i+ "\t");
		}
	}
}