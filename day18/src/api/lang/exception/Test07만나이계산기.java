package api.lang.exception;

import java.util.Scanner;

public class Test07만나이계산기 {
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			if(input.length() < 7) {
				throw new Exception("입력이 너무 짧습니다");
			}

			String yearStr = input.substring(0, 4);
			String monthStr = input.substring(5, 7);
			
			int nowyear = 2023;
			int nowmonth = 12;
			
			int year = Integer.parseInt(yearStr);
			if(year > nowyear) {
				throw new Exception("미래에서 태어났냐 닝겐");
			}
			if(year < 1900) {
				throw new Exception("뱀파이어가 아니라면 다시 입력하세요");
			}
			int month = Integer.parseInt(monthStr);
			if(month<1 || month >12) {
				throw new Exception("월은 1월부터 12월까지 있습니다");
			}
			
			int Korage = nowyear - year + 1;
			int worldage = nowyear - year;
			if(month > nowmonth) {
				worldage--;
			}
			System.out.println("한국나이는 : " + Korage + "입니다");
			System.out.println("만 나이는 : " +  worldage + "입니다");
			
		}
		
		catch (Exception e){
			if(e.getMessage() == null) {
				System.err.println("예외 발생");
			}
			else {
				System.err.println(e.getMessage());
			}
			
		}
		
		
		
				
	}

}
