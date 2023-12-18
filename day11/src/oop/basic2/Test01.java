package oop.basic2;

public class Test01 {
	public static void main(String[] args) {
		
		Mypet a = new Mypet();
		a.name = "뽀로로";
		a.grade = 1;
		a.score = 70;
		
		System.out.print("이름 : " + a.name + ", ");
		System.out.print("학년 : " + a.grade + ", ");
		System.out.print("점수 : " + a.score);
		System.out.println();
		
		Mypet b = new Mypet();
		b.name = "크롱";
		b.grade = 1;
		b.score = 55;
		
		System.out.print("이름 : " + b.name + ", ");
		System.out.print("학년 : " + b.grade + ", ");
		System.out.print("점수 : " +b.score);
		System.out.println();
		
		Mypet c = new Mypet();
		c.name = "포비";
		c.grade = 2;
		c.score = 80;
		
		System.out.print("이름 : " + c.name + ", ");
		System.out.print("학년 : " + c.grade + ", ");
		System.out.print("점수 : " +c.score);
		System.out.println();
		
		Mypet d = new Mypet();
		d.name = "해리";
		d.grade = 2;
		d.score = 75;
		
		System.out.print("이름 : " + d.name + ", ");
		System.out.print("학년 : " + d.grade + ", ");
		System.out.print("점수 : " +d.score);
	}

}
