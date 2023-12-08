package condition2;

public class Test02지하철요금5 {
	public static void main(String[] args) {

		int age = 65;
		
		int price; //변수를 만드는것이다 근데 넣을거면 if랑 else 모든곳에 넣어야함 
		if(age >= 65 || age < 8) { //어르신 또는 영유아
			 price = 0; //여기도 price가 있고 모두 있어야함
		}
		else if(age >= 20) {
			 price = 1400;//여기도 price가 있고 모두 있어야함
		}
		else if(age >= 14) {
			 price = 800;//여기도 price가 있고 모두 있어야함
		}
		else {
			 price = 500;//여기도 price가 있고 모두 있어야함
		}
		
		int card = 500;
		int result = price + card;
		
		System.out.println("요금 : " + result + "원");
		System.out.println("카드보증금 : " + result + "원");
		System.out.println("결제 금액 : " + result + "원");
		
	}
}