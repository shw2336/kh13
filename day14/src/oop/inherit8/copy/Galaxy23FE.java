package oop.inherit8.copy;

public class Galaxy23FE extends Galaxy {

	public Galaxy23FE(String number, String color) {
		super(number, color);
	}

	@Override
	public void samsungPay() {
		System.out.println("갤럭시23FE의 삼성페이 기능 실행");
	}

	@Override
	public void call() {
		System.out.println("갤럭시23FE의 통화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시23FE의 문자 기능 실행");
	}

	//추가 기능 구현
	public void bixby() {
		System.out.println("갤럭시23FE의 음성 인식 기능 실행");
	}

}