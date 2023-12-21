package oop.inherit5;

//얼음정수기
public class IcePurifier extends Purifier {

	protected IcePurifier(String company, int price) {
		super(company, price);
	}

	public void cold() {
		System.out.println("냉수 1잔 추출");
	}
	public void ice() {
		System.out.println("얼음 추출");
	}

}