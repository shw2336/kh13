package opp.method4;

public class Menu {
	//행사중인 상품은 가격을 20% 할인해서 출력
	
	String name;
	String sort;
	int pay;
	String event;
	
	void data(String name, String sort, int pay, String event) {
		
		if(event == "행사중") {
			pay = pay/100*80;
		}
		this.name = name;
		this.sort = sort;
		this.pay = pay;
		this.event = event;
	}
	
	void information() {
		System.out.println("이름 : " + this.name);
		System.out.println("분류 : " + this.sort);
		System.out.println("가격 : " + this.pay);
		System.out.println("행사여부 : " + this.event);
	}
	
}
