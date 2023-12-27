package api.lang.string2;

import java.util.Scanner;

public class Test05날짜검사 {
	public static void main(String[] args) {
		
//		연도는 1900 부터 2099년 사이에서 설정 (1900~2099)
//		월은 1월부터 12월 사이에서 설정 (01~12)
//		일은 월에 따라 다르긴 하지만 우선 31일로 고정 (01~31)
//		형식은 YYYY-MM-DD 형태로 대시가 포함된다.
//
//		업그레이드
//		월에 따라 날짜가 다르게 설정되도록 구현(2월은 29일로 가정)
//		윤년인지 아닌지 프로그램에서 판정하여 정규표현식에 반영
		
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜를 입력하세요 : ");
		String birth = sc.nextLine();
		String regex = "^(19|20)[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$"; //"^(19|20)\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";
																			  //(0[1-9]|[12][0-9]|3[01])	// 19961025
		if(birth.matches(regex)) {
			String year = birth.substring(0, 4);
			String month = birth.substring(4, 6);
			String day = birth.substring(6, 8);
			System.out.println(year + "-" + month + "-" + day);
		}
		else {
			System.out.println("잘못된 형식입니다");
		}

	}

}
