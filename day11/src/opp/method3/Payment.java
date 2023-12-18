package opp.method3;

public class Payment {
	//통신사, 상품명, 월정액, 데이터(GB), 통화(분), 문자(건)
	String agency;
	String name;
	int paymonth, gb, call, text;
	
	void data(String agency, String name, int paymonth, int gb, int call, int text) {
		this.agency = agency;
		this.name = name;
		this.paymonth = paymonth;
		this.gb = gb;
		this.call = call;
		this.text = text;
	}
	
	void information() {
		System.out.println("통신사 : " + this.agency);
		System.out.println("상품명 : " + this.name);
		System.out.println("월정액 : " + this.paymonth);
		System.out.println("데이터(GB) : " + this.gb);
		System.out.println("통화(분) : " + this.call);
		System.out.println("문자(건) : " + this.text);
	}
}
