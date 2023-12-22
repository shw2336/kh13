package oop.inherit8.copy;

public abstract class Phone {
	//필드
	private String number;
	private String color;

	//getter&setter


	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//생성자

	
	
	

	public Phone(String number, String color) {
		this.setNumber(number);
		this.setColor(color);
		
	}

	

	//메소드(+추상메소드)
	public final void show() {
		System.out.println("<휴대전화 정보>");
		System.out.println("전화번호 : " + this.number);
		System.out.println("색상 : " + this.color);
	}
	public abstract void call();
	public abstract void sms();
}