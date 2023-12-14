package array;

import java.util.Random;

public class Test07확률뽑기완성형 {
	public static void main(String[] args) {

		String[] items = new String[] {"금상자", "은상자", "철상자"};
		int gold = 10, silver = 20;

		Random r = new Random();
		int p = r.nextInt(100);//0부터 99까지
		System.out.println("p = " + p);

		int p2;
		if(p < gold) {
			p2 = 0;
		}
		else if(p < gold+silver) {
			p2 = 1;
		}
		else {
			p2 = 2;
		}
		System.out.println("p2 = " + p2);

		System.out.println("추첨 결과 = " + items[p2]);
	}
}