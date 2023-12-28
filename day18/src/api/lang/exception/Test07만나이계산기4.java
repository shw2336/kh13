package api.lang.exception;

import java.util.Scanner;

public class Test07만나이계산기4 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("출생정보(YYYY-MM) 입력");
			String input = sc.next();

			//연월 추출
			int year = Integer.parseInt(input.substring(0, 4));
			int month = Integer.parseInt(input.substring(5));

			int currentYear = 2023;
			int currentMonth = 12;

			//한국나이 계산
			int koreanAge = 2023-year+1;

			//만나이 계산
			int current = currentYear * 12 + currentMonth;
			int birth = year * 12 + month;
			int gap = current - birth;
			int americanAge = gap / 12;//12개월당 1살

			//출력
			System.out.println("한국나이 = "+koreanAge+"살");
			System.out.println("만나이 = "+americanAge+"살");
		}
		catch(Exception e) {
			if(e.getMessage() == null) {
				System.err.println("프로그램에서 문제가 발생했습니다");
			}
			else {
				System.err.println("예외 발생 : " + e.getMessage());
			}
		}
	}
}