package condition2;

import java.util.Scanner;

public class Test03여행사프로모션2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("여행갈 월 입력 : ");
		int month = sc.nextInt();
		System.out.print("인원수 입력 : ");
		int people = sc.nextInt();
		System.out.print("기간(일) 입력 : ");
		int day = sc.nextInt();
		int price = 100000;
		
		int rate;
		if(month == 3 || month == 4 || month == 5) {
			rate = 20;
		}
		else if(month == 6 || month == 7 || month == 8) {
			rate = 10;
		}
		else if(month == 9 || month == 10 || month == 11) {
			rate = 30;
		}
		else {
			rate = 5;
		}
	
		int total = people * day * price;
		int discount = total * rate / 100;
		int result = total - discount;
		
		System.out.println("총금액 : " + total + "원");
		System.out.println("할인율 : " + rate + "%");
		System.out.println("할인금액 : " + discount + "원");
		System.out.println("최종금액 : " + result + "원");
	}
	}
