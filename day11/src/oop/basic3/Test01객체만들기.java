package oop.basic3;

public class Test01객체만들기 {
	public static void main(String[] args) { //전화번호, 비밀번호는 String 
		//더하기 빼기 곱하기 나누기 안할거면 Int가 아니라 String
		//순위 클럽명 승리 무승부 패배
		Soccer a = new Soccer();
		Soccer b = new Soccer();
		Soccer c = new Soccer();
		Soccer d = new Soccer();
		
		a.rank = 1;
		a.name = "아스널";
		a.win = 12;
		a.draw = 3;
		a.lose = 2;
		
		b.rank = 2;
		b.name = "리버풀";
		b.win = 11;
		b.draw = 5;
		b.lose = 1;
		
		c.rank = 3;
		c.name = "애스턴 빌라";
		c.win = 12;
		c.draw = 2;
		c.lose = 3;
		
		d.rank = 4;
		d.name = "맨 시티";
		d.win = 10;
		d.draw = 4;
		d.lose = 3;
		
		
		System.out.println("순위 : " + a.rank);
		System.out.println("클럽명 : " + a.name);
		System.out.println("승리 : " + a.win);
		System.out.println("무승부 : " + a.draw);
		System.out.println("패배 : " + a.lose);
		System.out.println();
		
		System.out.println("순위 : " + b.rank);
		System.out.println("클럽명 : " + b.name);
		System.out.println("승리 : " + b.win);
		System.out.println("무승부 : " + b.draw);
		System.out.println("패배 : " + b.lose);
		System.out.println();
		
		System.out.println("순위 : " + c.rank);
		System.out.println("클럽명 : " + c.name);
		System.out.println("승리 : " + c.win);
		System.out.println("무승부 : " + c.draw);
		System.out.println("패배 : " + c.lose);
		System.out.println();
		
		System.out.println("순위 : " + d.rank);
		System.out.println("클럽명 : " + d.name);
		System.out.println("승리 : " + d.win);
		System.out.println("무승부 : " + d.draw);
		System.out.println("패배 : " + d.lose);
		
		System.out.println("\\"); 
	}

}
