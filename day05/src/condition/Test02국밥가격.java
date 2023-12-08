package condition;

import java.util.Scanner;

public class Test02국밥가격 {
	public static void main(String[] args) {
		//KH국밥집에서는 국밥 한그릇을 7천원에 팔고 있습니다.
		//65세 이상 어르신에게는 30% 할인된 가격으로 판매합니다.

		//사용자에게 출생년도 8자리를 입력받아 한국나이 계산 후
		//주문할 수량을 입력받아 결제할 금액 출력
		
		Scanner sc = new Scanner(System.in);
		
		 int age = sc.nextInt();
		 int count = sc.nextInt();
		 
		 int one = 7000;
		 int onesale = 7000 / 100 * 70;
		 
		 int sistyfivemore = count * onesale;
		 int sistyfiveless = count * one;
				 
		 int b = age / 10000;
		 int sistyfive = 2023 - b + 1 ;
		 boolean c = 65 <= sistyfive;
		 
		 if(c)  {
				 System.out.println("어르신은 " + sistyfivemore + "만큼의 금액을 지불해야합니다" );
		 }
		 else {
			 	System.out.println("대상자가 아니므로" + sistyfiveless + "만큼의 금액을 지불해야합니다");
		 }
	}
}
