package data4;

import java.time.LocalDate;

public class Test02성인인증 {
	public static void main(String[] args) {
		
		//사용자의 생년월일 8자리를 변수에 저장한 뒤 이 사람이 성인인지 판정하여 
		//출력하도록 구현하는 프로그램을 만드세요

		//예시 생년월일 : 20020507

		//성인은 한국 나이로 20세 이상일 경우를 말합니다
		//(연도만으로 나이를 계산합니다)
		
		int nowage = 20230101;
		int bornage = 20020507;
		
		int nowyear = nowage / 10000; 
		int bornyear = bornage / 10000;
		
		int diffrence = nowyear-bornyear +1;
		int adult = 20;
		
		boolean age = diffrence >= adult;
		System.out.println(age);
		
		
		LocalDate currentDate = LocalDate.now();
		
		
	}
}
