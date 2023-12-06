package data2;

public class Test05PC방계산기 {
	public static void main(String[] args) {
		
		//KH PC방은 다음과 같이 운영하고 있습니다.
		//요금은 1시간당 1000원
		//분단위로 요금 부과
		//단, 10원단위까지만 돈을 받는다

//예를 들어서 4분동안 게임을 했다면
		//66.6666원이 실제 요금이 되지만 60원만 받습니다.
//고객이 12시 20분부터 15시 30분까지 게임을 했을 때 
		//예상 요금을 구하여 출력하세요.
	
		double pricePerhour = 1000;
		double minutePrice = pricePerhour / 60.0;
		//double minutePrice = pricePerhour / 60d;  // 이건 60에 .0을 안하고 d
		//double minutePrice = (double) pricePerhour / 60;  // 이건 변수에double
		// 위에 두개 모두 쓸 수 있다 대박
		
		int starthour = 12 , startminute = 20;
		int endinghour = 15 ,endingminute = 30;
		
		int startall = starthour * 60 + startminute;
		int endingall = endinghour * 60 + endingminute;
		
		int totalTime = endingall - startall;
		int finalpay =(int) (minutePrice * totalTime);
		
		finalpay = finalpay / 10 * 10;
		
		System.out.println(minutePrice);
		System.out.println(totalTime);
		System.out.println(finalpay);
	
	}

}
