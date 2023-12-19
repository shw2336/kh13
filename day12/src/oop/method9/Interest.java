package oop.method9;

public class Interest {
	String name;
	double basic;
	double good;
	int monthMoney;
	int keepYear;

	void data(String name, double basic, double good, int monthMoney, int keepYear) {
		this.name = name;
		this.basic = basic;
		this.good = good;
		this.monthMoney = monthMoney;
		this.keepYear = keepYear;
	}
	
	int totalYearMoney() {
		return this.monthMoney * 12 * this.keepYear;
	}
	
//	double getExpectBasic() {
//		return this.oneYear() * (double)this.basic;
//	}
	double getExpect() {
		return this.totalYearMoney()/100d * (double)(this.basic+this.good);
	}
	int total() {
		return (int)this.getExpect() + (int)this.totalYearMoney();
	}
	boolean noTax() {
		return this.keepYear <= 3;
	}
	
	void information() {
		System.out.println("<적금 통장 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("기본이율 : " + this.basic);
		System.out.println("우대이율 : " + this.good);
		System.out.println("월부금 : " + this.monthMoney);
		System.out.println("예치기간 : " + this.keepYear);
		System.out.println("예상이자 : " + this.getExpect());
		System.out.println("1년간 예금해야할 돈  : " + this.monthMoney * 12);
		System.out.println("만기 예상 금액 : " + this.total());
		if(this.noTax()) {
			System.out.println("비과세 상품");
		}
		else {
			System.out.println("과세 상품");
		}
		
	}
	
}
