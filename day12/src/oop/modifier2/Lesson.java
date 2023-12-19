package oop.modifier2;

public class Lesson {
	//멤버 필드(변수)
	private String title;
	private int time;
	private int pay;
	private String type;
	
	void setTitle(String title) {
		this.title = title;
	}
	void setTime(int time) {
		if(time%30 == 0) {
			this.time = time;
		}
	}
	void setPay(int pay) {
		if(pay>0) {
			this.pay = pay;	
		}
	}
	void setType(String type) {
		this.type = type;
	}
	
	
	String getTitle() {
		return this.title;
	}
	int getTime() {
		return this.time;
	}
	int getPay() {
		return this.pay;
	}
	String getType() {
		return this.type;
	}
	
	int getPayperhour() {
		return this.pay / this.time;
	}
	
	void data(String title, int time, int pay, String type) {
		this.setTitle(title);
		this.setTime(time);
		this.setPay(pay);
		this.setType(type);
	}
	
	void information() {
		System.out.println("학원 강의 요금표");
		System.out.println("강좌명 : " + this.title);
		System.out.println("강의시간 : " + this.time);
		System.out.println("수강료 : " + this.pay + "원");
		System.out.println("시간당 수강료 : " + this.getPayperhour() + "원");
		System.out.println("구분 : " + this.type);
	}
	
}
