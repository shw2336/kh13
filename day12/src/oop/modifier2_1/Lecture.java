package oop.modifier2_1;

//강의 클래스
public class Lecture {
	//멤버 필드(변수)
	private String title;
	private int time;
	private int price;
	private String type;
	
	//멤버 메소드
	//- 세터/게터 메소드
	void setTitle(String title) {
		this.title = title;
	}
	
//	시간은 0보다 크고 30의 배수일 경우만 설정한다
//	void setTime(int time) {
//		if(time > 0 && time % 30 == 0) {
//			this.time = time;
//		}
//	}
	
//	시간은 0 이하이거나 30의 배수가 아니라면 설정하지 않는다
	void setTime(int time) {
		if(time <= 0) {
			return;//그만해!
		}
		if(time % 30 != 0) {
			return;//그만해!
		}
		this.time = time;
	}
	
//	price가 0 이상일 경우 설정하세요 (화이트리스트 방식)
//	void setPrice(int price) {
//		if(price >= 0) {
//			this.price = price;
//		}
//	}
	
//	price가 0 미만이라면 설정하지 마세요 (블랙리스트 방식)
	void setPrice(int price) {
		if(price < 0) {
			return;
		}
		this.price = price;
	}
	
//	(주의) 	문자열과 객체 등은 비교연산을 쓰지 않는다
//				(비교연산은 원시형을 위한 연산)
//	(해결)	별도의 비교명령을 쓰거나 switch구문을 사용
	void setType(String type) {
//		if(type == "온라인" || type == "오프라인" || type == "혼합") {
//			this.type = type;
//		}
		switch(type) {
		case "온라인":
		case "오프라인":
		case "혼합":
			this.type = type;
		}
	}
	
	String getTitle() {
		return this.title;
	}
	int getTime() {
		return this.time;
	}
	int getPrice() {
		return this.price;
	}
	String getType() {
		return this.type;
	}
	//1시간당 수강료를 계산하는 메소드가 추가로 필요하다(가상의 getter)
	int getTimePrice() {
		return this.price / this.time;
	}
	
	//- 기타 메소드
	void data(String title, int time, int price, String type) {
		this.setTitle(title);
		this.setTime(time);
		this.setPrice(price);
		this.setType(type);
	}
	
	void information() {
		System.out.println("<과정 정보>");
		System.out.println("과정명 : " + this.getTitle());
		System.out.println("수강시간 : " + this.getTime());
		System.out.println("수강료 : " + this.getPrice()
								+"원 (1시간당 "+this.getTimePrice()+"원)");
		System.out.println("과정유형 : " + this.getType());
	}
}