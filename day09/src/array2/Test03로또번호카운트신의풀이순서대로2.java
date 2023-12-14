package array2;

import java.util.Random;

public class Test03로또번호카운트신의풀이순서대로2 {
	public static void main(String[] args) {

		//로또가 아니라 주사위를 10번 던진다고 가정
		//- 주사위 내역은 저장의 대상이 아님

		Random r = new Random();

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;

//		for(int i=1; i <= 10; i++) {
		for(int i=0; i < 10; i++) {
			int number = r.nextInt(6) + 1;
			System.out.println("number = " + number);

			if(number == 1) {
				count1++;
			}
			else if(number == 2) {
				count2++;
			}
			else if(number == 3) {
				count3++;
			}
			else if(number == 4) {
				count4++;
			}
			else if(number == 5) {
				count5++;
			}
			else {
				count6++;
			}
		}
		System.out.println("1  나온 횟수 = " + count1);
		System.out.println("2  나온 횟수 = " + count2);
		System.out.println("3  나온 횟수 = " + count3);
		System.out.println("4  나온 횟수 = " + count4);
		System.out.println("5  나온 횟수 = " + count5);
		System.out.println("6  나온 횟수 = " + count6);

	}
}