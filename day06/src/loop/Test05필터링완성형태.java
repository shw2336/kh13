package loop;

public class Test05필터링완성형태 {
	public static void main(String[] args) {
		//다음 숫자를 화면에 출력해보세요
		//- '1' 부터 '20'  사이의 홀수
		//- '1' 부터 '50' 사이의 3의 배수
		for(int i=1 ; i<=20; i=i+1) {
			if(i%2 == 1) {//홀수라면
				System.out.print(i+ "\t");	
			}
		}
		System.out.println();
		for(int i=1 ; i<=50; i=i+1) { //1부터 50까지 중에서
			if(i%3 == 0) { //3의 배수라면
				System.out.print(i+ "\t");		
			}
		}
	}
}