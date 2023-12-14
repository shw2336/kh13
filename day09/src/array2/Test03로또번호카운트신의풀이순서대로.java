package array2;

import java.util.Random;

public class Test03로또번호카운트신의풀이순서대로 {
	public static void main(String[] args) {

		//로또가 아니라 주사위를 10번 던진다고 가정
		//- 주사위 내역은 저장의 대상이 아님

		Random r = new Random();

//		for(int i=1; i <= 10; i++) {
		for(int i=0; i < 10; i++) {
			int number = r.nextInt(6) + 1;
			System.out.println("number = " + number);
		}

	}
}