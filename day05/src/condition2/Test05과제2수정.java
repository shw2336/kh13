package condition2;

import java.util.Scanner;

public class Test05과제2수정 {
	public static void main(String[] args) {

		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		int year = sc.nextInt();
		System.out.print("월 입력 : ");
		int month = sc.nextInt();

		//계산
		//int day = 28 or 29 or 30 or 31;
		int day;
		if(month == 2) {
			//윤년인지 아닌지 판정
			boolean leap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
			if(leap) {
				day = 29;
			}
			else {
				day = 28;
			}
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30;
		}
		else {
			day = 31;
		}
		
		//출력
		System.out.println(year+"년 "+month+"월은 "+day+"일까지 있습니다");
	}
}