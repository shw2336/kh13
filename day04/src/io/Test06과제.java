package io;

import java.util.Scanner;

public class Test06과제 {
	public static void main(String[] args) {
		//KH분식점의 메뉴판은 다음과 같습니다.

		//사용자에게 떡볶이, 튀김, 순대 개수를 입력받아 결제금액을 출력
		//(단, 현재 행사중이라서 10% 할인된 가격으로 판매합니다)
		//떡볶이 3000원 ddeokboki
		// 튀김 500원 fried
		// 순대 2000원 sundae
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("떡볶이 개수를 입력해주세요 : ");
		int ddeokboki = sc.nextInt();
		System.out.print("튀김 개수를 입력해주세요 : ");
		int fried = sc.nextInt();
		System.out.print("순대 개수를 입력해주세요 : ");
		int sundae = sc.nextInt();
		

		int ddeokbokipay = ddeokboki * 3000;
		int friedpay = fried * 500;
		int sundaepay = sundae * 2000;
		
		int all = ddeokbokipay + friedpay + sundaepay;
		int pay = all - all/10;
		System.out.println();
		System.out.println("총 가격 " + all + "원에서 " + all/10 + "원 할인되어서 " + "결제할 금액은 " + pay + "원 입니다.");
		
	}
}
