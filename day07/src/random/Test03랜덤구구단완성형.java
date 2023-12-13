package random;

import java.util.Random;
import java.util.Scanner;

public class Test03랜덤구구단완성형 {
	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int size = 10;
		int correctEasy = 0, correctDifficult = 0;//개수
		int score = 0;//점수

		for(int i=1; i <= size; i++) {
			int left = r.nextInt(18) + 2;//2부터 18개//2부터 19사이
			int right = r.nextInt(9) + 1;//1부터 9개//1부터 9사이

			System.out.print(left + " x " + right + " = " );
			int user = sc.nextInt();

			if(user == left * right) {//정답이라면

				//어려운 문제라면 - 12단 이상이면서 x2 이상
				if(left >= 12 && right >= 2) {
					//System.out.println("어려운 문제 클리어");
					correctDifficult++;
					score += 15;
				}
				//쉬운 문제라면 - 11단 이하이거나 x1인 경우
				else {
					//System.out.println("쉬운 문제 클리어");
					correctEasy++;
					score += 10;
				}
			}
		}
		System.out.println("게임 끝!");
		System.out.println("쉬운 문제 정답 개수 : " + correctEasy);
		System.out.println("어려운 문제 정답 개수 : " + correctDifficult);
		System.out.println("총 획득 점수 : " + score+"점");
	}
}