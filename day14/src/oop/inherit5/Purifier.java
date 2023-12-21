package oop.inherit5;

public class Purifier {
	private String company;
	private int price;
	
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
		if(price<0) return;
		this.price = price;
	}
	
	public final void normal() {
		System.out.println("정수 1잔");
	}


	public void information() {
		System.out.print("업체 : " + this.getCompany() + "가격 : " + this.getPrice());
	}
	
}
