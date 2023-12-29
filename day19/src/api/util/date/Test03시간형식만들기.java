package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03시간형식만들기 {
	public static void main(String[] args) {
		
//		2023년 7월 11일
//		오후 1시 5분
//		13:05:30
//		2023-07-11 화 13:05:30
		
		Date d = new Date();
		SimpleDateFormat fmt1 = new SimpleDateFormat("y년 M월 d일");
		SimpleDateFormat fmt2 = new SimpleDateFormat("a h시 m분");
		SimpleDateFormat fmt3 = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat fmt4 = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss ");
		
		
		System.out.println(fmt1.format(d));
		System.out.println(fmt2.format(d));
		System.out.println(fmt3.format(d));
		System.out.println(fmt4.format(d));
	
	}

}
