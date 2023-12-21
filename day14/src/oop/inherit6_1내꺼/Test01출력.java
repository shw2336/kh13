package oop.inherit6_1내꺼;

public class Test01출력 {
	public static void main(String[] args) {
			
		Mp4파일 a1 = new Mp4파일("신형우", 4646);

		a1.speed();
		a1.execute();
		a1.forward();
		a1.rewind();
		a1.information();
		System.out.println();
		
		Mp3파일 a2 = new Mp3파일("바보바보", 1518);

		a2.duration();
		a2.execute();
		a2.forward();
		a2.rewind();
		a2.information();
		System.out.println();
		
		Hwp파일 a3 = new Hwp파일("정지환", 1518);

		a3.pagesize();
		a3.execute();
		a3.preview();
		a3.information();
		System.out.println();
		
		Ppt파일 a4 = new Ppt파일("말발굽", 1598);

		a4.pagesize();	
		a4.execute();
		a4.slideShow();
		a4.information();
		System.out.println();
		
		
		
	}

}
