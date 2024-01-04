package api.time.copy2.copy;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Test02기간구하기 {
	public static void main(String[] args) {
//		사용자에게 YYYY-MM-DD 형태로 두 개의 날짜를 입력받아서 두 날짜의 차이를 구하여 화면에 출력
//
//		요구사항
//		반드시 먼저 입력한 날짜가 나중에 입력한 날짜보다 이전이어야 합니다
//		그렇지 않을 경우 차이를 계산할 수 없습니다 메세지를 출력
//		차이는 ?년 ?개월 ?일 형태로 출력해주세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("YYYY-MM-DD 형태로 입력하세요");
		String firstInput = sc.nextLine();
		String secondInput = sc.nextLine();
		try {
            int firstNumber = Integer.parseInt(firstInput);
            int secondNumber = Integer.parseInt(secondInput);
         
            if(secondNumber > firstNumber) {
            	System.out.println("차이를 계산할 수 없습니다");
            }
            LocalDate firstDate = LocalDate.parse(firstInput);
            LocalDate secondDate = LocalDate.parse(secondInput);
            Period period = Period.between(firstDate, secondDate);
            System.out.println(period.getYears() + "년 " + period.getMonths() + "월 " + period.getDays() + "일");
           
        }
		catch (Exception e) {
            System.err.println("오류 발생");
		
		
		
		
		
		
	}
	}
}
	

