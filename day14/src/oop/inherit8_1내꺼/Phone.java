package oop.inherit8_1내꺼;

public abstract class Phone {
	private String number;
	private String color;
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	public void information() {
		System.out.println("전화번호 : " +this.number);
		System.out.println("색상 : " + this.color);
	}
	

	
	public abstract void call();
	public abstract void sms();
	public abstract void sspay();
	}
	


