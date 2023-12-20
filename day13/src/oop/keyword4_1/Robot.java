package oop.keyword4_1;

//이 클래스는 별도의 멤버 필드를 가지지 않고 일회성 계산 메소드만 보관
public class Robot {

	//1. 제곱을 계산할 수 있는 메소드(square)
	public static double square(double number) {
		return number * number;
	}

	//2. 삼각형의 넓이를 구할 수 있는 메소드(triangle)
	public static double triangle(double width, double height) {
		return width * height / 2;
	}
	//3. 원의 넓이를 구할 수 있는 메소드 구현(circle)
	//= 반지름² x 원주율(3.14)
	public static double circle(double radius) {
		//return radius * radius * 3.14;
		return square(radius) * 3.14;
	}
	//4. 출생년도 4자리로 지하철 요금을 계산하는 메소드 구현(subway)
	public static int subway(int birth) {
		int age = 2023 - birth + 1;
		if(age < 8 || age >= 65) {
			return 0;
		}
		else if(age >= 20) {
			return 1400;
		}
		else if(age >= 14) {
			return 800;
		}
		else {
			return 500;
		}
	}

	//5. 연도를 알려주면 윤년인지 판정하는 메소드 구현(leap)
	public static boolean leap(int year) {
		boolean judge = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
		return judge;
//		if(judge) {
//			return true;
//		}
//		else {
//			return false;
//		}
	}

	//6. 키와 몸무게로 bmi를 계산하는 메소드 구현(bmi)
	public static double bmi(double height, double weight) {
		double m = height / 100;
		return weight / (m * m);
	}
}