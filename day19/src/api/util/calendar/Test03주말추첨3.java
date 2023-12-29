package api.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test03주말추첨3 {
	public static void main(String[] args) {
		//반복문 처리
		Random r = new Random();

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2024);
		c.set(Calendar.MONTH, 0);//1월이지만 0으로 설정(0~11)

		while(true) {
			//날짜 설정
			int day = r.nextInt(365);
			c.set(Calendar.DATE, 1+day);

			int week = c.get(Calendar.DAY_OF_WEEK);
			if(week == 1 || week == 7) break;
		}

		//시간 출력
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("y년 M월 d일 E요일");
		System.out.println(fmt.format(d));
	}
}