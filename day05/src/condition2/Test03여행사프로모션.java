package condition2;

import java.util.Scanner;

public class Test03여행사프로모션 {
	public static void main(String[] args) {
		// KH 여행사에서 두 번째 프로모션을 진행합니다.
		// 무조건 1인당 1일 10만원이라는 기존의 슬로건은 유지하면서 계절별로 다양하게 추가 할인을 제공합니다.

		// 사용자에게 인원수, 여행기간(일), 예정(월)을 입력받아 예상 요금을 출력하세요
		// 봄 3 4 5 / 여름 6 7 8 / 가을 9 10 11 / 겨울 12 1 2
		Scanner sc = new Scanner(System.in);

		// 할인과 관련된 데이터
		System.out.print("여행가는 달(1~12) 입력 : ");
		int month = sc.nextInt();

		// 금액과 관련된 데이터
		System.out.print("인원 수 입력 : ");
		int people = sc.nextInt();
		System.out.print("여행 기간(일) 입력 : ");
		int day = sc.nextInt();
		int price = 100000;

		// boolean summer = 6<=month && month <=8; //이것보다 아래 있는게 더 정확하다.
		boolean summer = month == 6 || month == 7 || month == 8; // 여름 할인율 10%
		boolean spring = month == 3 || month == 4 || month == 5; // 봄 할인율 20%
		boolean fall = month == 9 || month == 10 || month == 11; // 가을 할인율 30%
		boolean winter = month == 12 || month == 1 || month == 2; // 겨울 할인율 5%

		int result;
		int discount;
		int total;
		if (spring) {
			total = people * day * price; // 원래금액
			discount = total * 20 / 100; // 할인금액
			result = total - discount; // 예상금액
		} 
		else if (summer) {
			total = people * day * price; // 원래금액
			discount = total * 10 / 100; // 할인금액
			result = total - discount; // 예상금액
		} 
			else if (fall) {
			total = people * day * price; // 원래금액
			discount = total * 30 / 100; // 할인금액
			result = total - discount; // 예상금액
		} 
			else {
			total = people * day * price; // 원래금액
		    discount = total * 5 / 100; // 할인금액
			result = total - discount; // 예상금액
		}	
				System.out.println("총 금액"+ total + "중에서 " + "할인금액은" + discount + "원이고" + "예상 금액은 " + result + "원");
		}
	}
