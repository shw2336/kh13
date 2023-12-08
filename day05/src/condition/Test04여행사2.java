package condition;

import java.util.Scanner;

public class Test04여행사2 {
	public static void main(String[] args) {
		
		//KH여행사에서는 다음과 같은 슬로건을 걸고 영업을 하고 있습니다.
 		//어디든 무조건 1사람 1박에 10만원
		//여름 매출이 너무 저조해서 여름에 여행하는 사람은 추가로 20%할인 행사를 진행합니다.
		//사용자에게 인원수, 기간(일), 예정(월)을 입력받아서 예상 금액을 구하여 출력
		//(단, 여름은 6,7,8월입니다)
		
		Scanner sc = new Scanner(System.in);
		
		//할인과 관련된 데이터
		System.out.print("여행가는 달(1~12) 입력 : ");
		int month = sc.nextInt();
		
		//금액과 관련된 데이터
		System.out.print("인원 수 입력 : ");
		int people = sc.nextInt();
		System.out.print("여행 기간(일) 입력 : ");
		int day = sc.nextInt();
		int price = 100000;
		
		//boolean summer = 6<=month && month <=8; //이것보다 아래 있는게 더 정확하다.
		boolean summer = month == 6 || month == 7 || month == 8;
		
		if (summer) {
			int total = people * day * price; //원래금액
			int discount = total * 20 / 100; //할인금액
			int result = total - discount; //예상금액
			System.out.println("어머 여름에 여행가시네요?");
			System.out.println("예상 금액 = " + total + "원");
			System.out.println("할인 금액 = " + discount + "원");
			System.out.println("최종 금액 = " + result + "원");
		}
		else {
			int total =  people * day * price;
			System.out.println("아쉽지만 행사 대상은 아닙니다");
			System.out.println("예상 금액 = " + total + "원");
		}
	
		
	}

}
