package random;

import java.util.Random;
import java.util.Scanner;

public class Test03랜덤구구단콤보만들기 {
	public static void main(String[] args) {
		//10개의 랜덤 구구단 문제를 출제하는 프로그램을 구현하세요
		//2단 부터 19단 까지의 범위 내에서 출제
		//사용자에게 입력을 받아 정답, 오답 판정
		//사용자가 맞춘 문제 수를 카운트하여 출력
		//맞춘 문제 하나당 점수를 부여
		//쉬운 문제는 10점 (2~11단, x1)
		//어려운 문제는 15점 (나머지)
		//사용자가 획득한 점수를 누적합산하여 출력
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int counthard = 0;
		int counteasy = 0;
		for(int i=1; i<=10; i++) {
			int a = r.nextInt(18) + 2;
			int b = r.nextInt(19) + 1;
			int answer = a * b;
			System.out.print(a + " X " + b + "= " );
			int write = sc.nextInt();
			if(answer == write) {System.out.println("정답입니다!");
				count ++;
				if(a>11 || b > 11) {
					counthard ++;
				}
				else {
					counteasy ++;
				}
			}//
			else {
				System.out.println("오답입니다!");
			}
		}
		int hardscore = counthard * 15;
		int easyscore = counteasy * 10;
		int all = hardscore + easyscore;
		System.out.println("정답은 " + count + "개");
		System.out.println("오답은 " + (10 - count) + "개");
		System.out.println("쉬운 문제 " + counteasy + "개" + " 점수는 " + easyscore + "입니다");
		System.out.println("어려운 문제 " + counthard + "개" + " 점수는 " + hardscore + "입니다");
		System.out.println("총 점수는 " + all + "입니다");	
	}
}