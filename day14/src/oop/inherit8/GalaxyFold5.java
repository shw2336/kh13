package oop.inherit8;

public class GalaxyFold5 extends Galaxy {

	public GalaxyFold5(String number, String color) {
		super(number, color);
	}

	@Override//annotation(어노테이션 or 애노테이션), 하단 구문의 역할을 지정
	public void samsungPay() {
		System.out.println("갤럭시 Fold 5의 삼성페이 기능 실행");
	}

	@Override
	public void call() {
		System.out.println("갤럭시 Fold 5의 통화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시 Fold 5의 문자 기능 실행");
	}

	//추가 기능 구현
	public void iris() {
		System.out.println("갤럭시 Fold 5의 홍채인식 기능 실행");
	}
}