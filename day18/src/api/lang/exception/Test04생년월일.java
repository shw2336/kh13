package api.lang.exception;

import java.util.Scanner;

public class Test04생년월일 {
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("생년월일을 YYYY-MM-DD 형태로 입력하세요 : ");
			String write = sc.nextLine();
			
			
			int year = Integer.parseInt(write.substring(0, 4));
			int month = Integer.parseInt(write.substring(5, 7));
			int day = Integer.parseInt(write.substring(8, 10)); //또는 (8) 만 해도 됨 8뒤로 전부 라는 것과 같으니까
			
			System.out.println("출생 년도 : " + year);
			System.out.println("출생 월 : " + month);
			System.out.println("출생 일 : " + day);
		}
		catch(Exception e) {
			System.err.println("프로그램 오류 발생");
		}
	}

}
