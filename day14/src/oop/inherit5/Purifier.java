package oop.inherit5;

//정수기 클래스
public class Purifier {
	//필드
	private String company;
	private int price;
	//setter&getter
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0) return;
		this.price = price;
	}
	//생성자
	//- (참고) protected의 "우리" 라는 개념에는 "패키지 + 상속그룹"이 포함
	protected Purifier(String company, int price) {
		this.setCompany(company);
		this.setPrice(price);
	}
	//메소드
	public void normal() {
		System.out.println("정수 1잔 추출");
	}
}