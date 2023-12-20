package oop.keyword4;

import java.util.Scanner;

public class Test01여러문제풀이 {
	public static void main(String[] args) {
		System.out.println("제곱(정사각형 넓이) : " + Robot.square(11));
		System.out.println("삼각형의 넓이 : " + Robot.triangle(5, 7));
		System.out.println("원의 넓이 : " + Robot.circle(5));
		System.out.print("출생년도 4자리를 적어주세요 : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println(Robot.subway(age));
		System.out.print("연도 4자리를 적어주세요 : ");
		int year = sc.nextInt();
		System.out.println(Robot.leap(year));
		
	}

}
