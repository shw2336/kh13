package oop.method4;

public class Test01메소드사용2 {
	public static void main(String[] args) {

		Menu2 a = new Menu2();
		Menu2 b = new Menu2();
		Menu2 c = new Menu2();
		Menu2 d = new Menu2();

		a.data("아메리카노", "음료", 2500, true);
		b.data("모카라떼", "음료", 3500, false);
		c.data("치즈케이크", "디저트", 5000, true);
		d.data("마카롱", "디저트", 3000, false);

		a.information();
		b.information();
		c.information();
		d.information();

	}
}