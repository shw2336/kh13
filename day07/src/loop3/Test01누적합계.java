package loop3;

public class Test01누적합계 {
	public static void main(String[] args) {
		
//		1부터 10까지 더해보세요
		
//		int total = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
//		System.out.println(total);
		int total = 0;
		for(int i=1; i<=100; i++) {
			total += i;
		}
		System.out.println("total = " + total);
	}
}