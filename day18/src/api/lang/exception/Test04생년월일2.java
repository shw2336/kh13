package api.lang.exception;

import java.util.Scanner;

public class Test04생년월일2 {
	public static void main(String[] args) {

		try {
			//Plan A
			Scanner sc = new Scanner(System.in);
			System.out.print("생년월일 입력 : ");
			String input = sc.next();

			String yearStr = input.substring(0, 4);
			String monthStr = input.substring(5, 7);
			String dayStr = input.substring(8);

			int year = Integer.parseInt(yearStr);
			int month = Integer.parseInt(monthStr);
			int day = Integer.parseInt(dayStr);

			System.out.println("<출생일자>");
			System.out.println("출생년도 = " + year);
			System.out.println("출생월 = " + month);
			System.out.println("출생일 = " + day);
		}
		//catch(NumberFormatException e) {
		catch(Exception e) {
			System.err.println("입력 형식 오류");
		}

	}
}