package oop.inherit3;

public class Test01 {
	public static void main(String[] args) {
		Chrome p1 = new Chrome();
		p1.setUrl("https://www.google.com");
		p1.refresh();
		p1.move();
		p1.develop();
		p1.chromeStore();
		System.out.println();
		
		Edge p2 = new Edge();
		p2.setUrl("https://www.microsoft.com");
		p2.refresh();
		p2.move();
		p2.fullScreen();
		System.out.println();
		
		Whale p3 = new Whale();
		p3.setUrl("https://www.sosoft.com");
		p3.refresh();
		p3.move();
		p3.papago();
		p3.naverSearch();
		System.out.println();
		
		
	}

}
