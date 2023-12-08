package condition;

import java.util.Scanner;

public class Test03과속카메라 {
	public static void main(String[] args) {
		//camera condition
		
		//KH전자에서 개발한 과속단속 카메라는 다음 규칙에 따라 벌금을 계산하도록 만들어져 있습니다.

		//50km를 초과하여 달리는 차량을 단속
		//벌금은 시작이 30000원
		//제한속도인 50km보다 10km 빨라질 때마다 벌금은 10000원씩 증가

		//자동차 속도를 입력받아 예상되는 벌금을 출력하세요
		//(벌금이 없으면 0원이라고 출력하면 됩니다)
		 // 자동차 속도 = a // 추가 벌금 = b // c = 총 벌금 
		
		Scanner sc = new Scanner(System.in);
		
		int speed = sc.nextInt();
		int pay = 10000;
		int allpay = 30000 + pay;
		boolean now = speed < 50 ; 
		
		//51~59 
		//60~69
		//70~79
		//80~89
		// (51-50)%10 1% 0
		// (61-50)%10 11% 1
	//	int 60 / 10 = 6     , 70 / 10 7
		//boolean e = a>= 60
		double gs = (speed-50) % 10.0;

		if (now) {
			System.out.println("0원입니다");
		}
		else {
			double result = speed + (pay * gs);
			System.out.println( result +  "입니다");
		}
		
		 //60km 미만은 30000원으로 고정
			//61km부터 10키로 단위로 10000원씩 증가
			
		
	}

}
