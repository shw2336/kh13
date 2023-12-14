package array2;

import java.util.Random;

public class Test03로또번호카운트신의풀이순서대로6 {
	public static void main(String[] args) {

		//로또가 아니라 주사위를 10번 던진다고 가정
		//- 주사위 내역은 저장의 대상이 아님

		Random r = new Random();

		int[] counts = new int[45];

//		for(int i=1; i <= 1000; i++) {
		for(int i=0; i < 1000; i++) {
			int number = r.nextInt(45) + 1;
			//System.out.println("number = " + number);

			//1이나오면 [0]증가, 2가나오면 [1]증가
			//number가 나오면 [number-1]증가
			counts[number-1]++;
		}

		for(int i=0; i < counts.length; i++) {
			System.out.println((i+1) + "  나온 횟수 = " + counts[i]);
		}

	}
}