package oop.method2;

public class Player {
	String name;
	String event;
	String season;
	int gold, silver, bronze;
	
	void data(String name, String event, String season, int gold, int silver, int bronze) {
		this.name = name;
		this.event = event;
		this.season = season;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}
	
	void information() {
		System.out.println("이름 : " + this.name);
		System.out.println("종목 : " + this.event);
		System.out.println("구분 : " + this.season);
		System.out.println("금 : " + this.gold);
		System.out.println("은 : " + this.silver);
		System.out.println("동 : " + this.bronze);
	}

}
