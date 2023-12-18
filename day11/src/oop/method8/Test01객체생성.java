package oop.method8;

public class Test01객체생성 {
	public static void main(String[] args) {
		Test a = new Test();
		Test b = new Test();
		Test c = new Test();
		Test d = new Test();
		
		a.data(1, 1, "마리오", 50, 60, 50, 160, 53.333);
		b.data(1, 1, "루이지", 60, 90, 50, 200, 66.666);
		c.data(1, 2, "쿠파", 70, 70, 80	, 220, 73.333);
		d.data(1, 2, "요시", 80, 85, 35, 200, 66.666);
		
		a.information();
		b.information();
		c.information();
		d.information();
	}
}