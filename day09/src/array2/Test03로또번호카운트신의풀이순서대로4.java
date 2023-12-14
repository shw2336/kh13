package array2;

import java.util.Random;

public class Test03로또번호카운트신의풀이순서대로4 {
	public static void main(String[] args) {

		//로또가 아니라 주사위를 10번 던진다고 가정
		//- 주사위 내역은 저장의 대상이 아님

		Random r = new Random();

		int[] counts = new int[6];
		//counts	---->	[ 0 ][ 0 ][ 0 ][ 0 ][ 0 ][ 0 ]

//		for(int i=1; i <= 10; i++) {
		for(int i=0; i < 10; i++) {
			int number = r.nextInt(6) + 1;
			System.out.println("number = " + number);

			if(number == 1) {
				counts[0]++;
			}
			else if(number == 2) {
				counts[1]++;
			}
			else if(number == 3) {
				counts[2]++;
			}
			else if(number == 4) {
				counts[3]++;
			}
			else if(number == 5) {
				counts[4]++;
			}
			else {
				counts[5]++;
			}
		}

		for(int i=0; i < counts.length; i++) {
			System.out.println((i+1) + "  나온 횟수 = " + counts[i]);
		}

	}
}