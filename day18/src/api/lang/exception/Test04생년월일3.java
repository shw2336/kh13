package api.lang.exception;

import java.util.Scanner;

public class Test04생년월일3 {
	public static void main(String[] args) {

		try {
			//Plan A
			Scanner sc = new Scanner(System.in);
			System.out.print("생년월일 입력 : ");
			String input = sc.next();

			String[] parts = input.split("-");

			int year = Integer.parseInt(parts[0]);
			int month = Integer.parseInt(parts[1]);
			int day = Integer.parseInt(parts[2]);

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