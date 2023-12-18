package oop.method6;

public class Product {
	String name;
	String sort;
	int pay;
	boolean delivery;
	boolean event;

	void data(String name, String sort, int pay) {
		this.name = name;
		this.sort = sort;
		this.pay = pay;
		// this.delivery = false;
		// this.event = false;
	}

	void data(String name, String sort, int pay, boolean delivery, boolean event) {
		this.name = name;
		this.sort = sort;
		this.pay = pay;
		this.delivery = delivery;
		this.event = event;
	}

	void information() {
		System.out.println("<상품 정보>");
		if (this.event) {
			System.out.println("상품명 : " + this.name + "(행사중)");
		} else {
			System.out.println("상품명 : " + this.name);
		}
		System.out.println("상품 분류 : " + this.sort);
		if (this.event) {
			int discount = this.pay * 90/100;
			System.out.println("해당상품은 행사중인 상품임으로 " + this.pay + "원에서 " + "10% 할인되어서 " + discount + "원 입니다.");
		} else {
			System.out.println(this.pay + "원 입니다.");
		}
		if (this.delivery) {
			System.out.println("새벽배송 가능(이용시 배송비 2500원 추가)");
		} 
	}
}