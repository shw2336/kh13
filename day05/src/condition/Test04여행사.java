package condition;

import java.util.Scanner;

public class Test04여행사 {
	public static void main(String[] args) {
		
		//KH여행사에서는 다음과 같은 슬로건을 걸고 영업을 하고 있습니다.
 		//어디든 무조건 1사람 1박에 10만원
		//여름 매출이 너무 저조해서 여름에 여행하는 사람은 추가로 20%할인 행사를 진행합니다.
		//사용자에게 인원수, 기간(일), 예정(월)을 입력받아서 예상 금액을 구하여 출력
		//(단, 여름은 6,7,8월입니다)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇월입니까? : ");
		int month = sc.nextInt();

		int otherpay = 100000;
		int summerpay = otherpay / 100 * 80;
		
		// int sale = every - every / 100 * 20;
		System.out.print("인원이 몇명입니까? : ");
		int person = sc.nextInt();
		System.out.print("며칠간 여행하세요? : ");
		int period = sc.nextInt();
				
		boolean date = 6 <= month && month <= 8;
		
		if(date) {
			int total = (summerpay * person * period);
					System.out.println(total + "원 입니다.");
		}
		else {
			int total = (otherpay * person * period);
			System.out.println(total + "원 입니다.");
		}
				
				
	
		
		
		
		
	}

}
