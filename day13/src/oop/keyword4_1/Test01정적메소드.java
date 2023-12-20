package oop.keyword4_1;

public class Test01정적메소드 {
	public static void main(String[] args) {
		//Robot r = new Robot();
		System.out.println("11의 제곱 = " + Robot.square(11));
		System.out.println("폭5, 높이7인 삼각형 넓이 = " + Robot.triangle(5, 7));
		System.out.println("반지름 5인 원의 넓이 = " + Robot.circle(5));
		System.out.println("1999년생 지하철 요금 = " + Robot.subway(1999));
		System.out.println("2000년은 윤년인가요? " + Robot.leap(2000));
		System.out.println("180/80의 BMI = " + Robot.bmi(180, 80));
	}
}