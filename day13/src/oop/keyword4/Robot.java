package oop.keyword4;

import java.util.Scanner;

public class Robot {
	
	public static int square(int section) {
		return section * section;
	}
	public static double triangle(double width, double height) {
		return width * height /2d;
	}
	public static double circle(double radius) {
		return radius * radius * 3.14d;
	}
	public static int subway(int age) {
		int realage = 2023-age+1;
		if(realage >=20 && realage < 65) {
			System.out.println("성인 1400원입니다");
		}
		else if(realage >=14 && realage < 20) {
			System.out.println("청소년 800원입니다");
		}
		else if(realage >=8 && realage < 14) {
			System.out.println("어린이 500원입니다");
		}	
		else {
			System.out.println("0원 입니다");
		}
		return age;
	}
	public static int leap(int year) {

		boolean first = year % 4 == 0;
		boolean second = year % 100 != 0;
		boolean third = year % 400 == 0;
		boolean leapYear = third || (second && first);
		
		System.out.println();
		return year;
	}
}
