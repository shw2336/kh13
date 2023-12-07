package io;

import java.util.Scanner;

public class Test04평균계산기 {
	public static void main(String[] args) {
		
		//사용자에게 다음 정보를 입력받아서 총점과 평균을 구하여 출력

		//국어 점수(korean)
		//영어 점수(english)
		//수학 점수(math)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int korean = sc.nextInt();
		System.out.print("영어 점수 : ");
		int english = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		int total = korean + english + math;
		double average = total / 3.0;  // total 왼쪽에 (double) 적어주고 3.0을 3으로 둬도 실행 됨
		
		System.out.println("국어 점수는 " + korean + "점이고, 영어 점수는 " + english + "점이고,"
				+ " 수학점수는 " + math + "점입니다.");
		System.out.println("따라서 총점은 " + total + "점이고, 평균은 " + average + "점입니다");
	}
}
