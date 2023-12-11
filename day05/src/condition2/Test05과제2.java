package condition2;

import java.util.Scanner;

public class Test05과제2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		boolean conditions1 = year % 4 == 0; //윤년변수
		boolean conditions2 = year % 100 != 0;
		boolean conditions3 = year % 400 == 0;
		boolean leapYear = conditions3 || (conditions1 && conditions2);
		
		String date;
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||  month == 10 ||  month == 12) { 
			date = "31";
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {
			date = "30";
		}
		else if(month == 2 && leapYear) { 
			date = "29";
		}
		else {
			date = "28";
		}
		System.out.println(year + "년 " + month + "월 " + "마지막 날짜는 " + date + "일 입니다");
		}
	}