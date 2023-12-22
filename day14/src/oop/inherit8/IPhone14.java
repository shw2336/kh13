package oop.inherit8;

public class IPhone14 extends IPhone {

	public IPhone14(String number, String color) {
		super(number, color);
	}

	@Override
	public void siri() {
		System.out.println("아이폰 14의 음성인식 기능 실행");
	}

	@Override
	public void call() {
		System.out.println("아이폰 14의 통화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("아이폰 14의 문자 기능 실행");
	}

	//추가 기능 구현
	public void itunes() {
		System.out.println("아이폰 14의 아이튠즈 기능 실행");
	}

}