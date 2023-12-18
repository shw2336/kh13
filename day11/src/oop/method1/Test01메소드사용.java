package oop.method1;

public class Test01메소드사용 {
	public static void main(String[] args) {
		
		//객체 생성
		SoccerTeam a = new SoccerTeam();
		
		//초기화
		a.rank = 1;
		a.name ="아스널";
		a.win = 12;
		a.draw = 3;
		a.lose = 2;
			
		//출력
		System.out.println("순위 : " + a.rank);
		System.out.println("이름 : " + a.name);
		System.out.println(a.win + "승 " + a.draw + "무 " + a.lose + "패");
	}

}
