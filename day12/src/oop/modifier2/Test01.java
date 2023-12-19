package oop.modifier2;

public class Test01 {
	public static void main(String[] args) {
		
		Lesson a = new Lesson();
		Lesson b = new Lesson();
		Lesson c = new Lesson();
		
		a.data("자바 마스터과정", 90, 1000000, "온라인");
		b.data("파이썬 기초", 60, 600000, "온라인");
		c.data("웹 개발자 단기완성", 120, 1200000, "오프라인");
		
		
		a.information();
		System.out.println();
		b.information();
		System.out.println();
		c.information();

	}
}