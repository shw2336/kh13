package loop;

public class Test03반복변수활용 {
	public static void main(String[] args) {
		//(Q) Hello Java 1부터 Hello java 10 까지 출력하세요
		//for(1부터 ; 10이하 ; 10번 출력)
		for(int i=1 ; i <= 10 ; i=i+1) {
			//for 내에서는 반복에 사용한 변수 i를 쓸 수 있다
			System.out.println("Hello Java " + i);
		}
	}
}