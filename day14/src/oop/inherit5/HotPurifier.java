package oop.inherit5;

public class HotPurifier extends Purifier {

	public HotPurifier(String company, int price) {
		super(company, price);
	}

	public void hot() {
		System.out.println("온수 1잔 추출");
	}

}