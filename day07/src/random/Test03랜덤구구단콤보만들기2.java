package random;

import java.util.Random;
import java.util.Scanner;

public class Test03랜덤구구단콤보만들기2 {
	public static void main(String[] args) {
		//콤보도 결국 카운트
		//- 정답을 맞추면 1 증가
		//- 틀리면 0

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int size = 10;
		int combo = 0;

		for(int i=1; i <= size; i++) {
			int left = r.nextInt(18) + 2;//2부터 18개//2부터 19사이
			int right = r.nextInt(9) + 1;//1부터 9개//1부터 9사이

			System.out.print(left + " x " + right + " = " );
			int user = sc.nextInt();

			if(user == left * right) {//정답이라면
				combo++;
				if(combo >= 2) {
					System.out.println(combo + " Combo!");
				}
			}
			else {//오답이라면
				combo = 0;
			}
		}


		System.out.println("게임 끝!");

	}
}