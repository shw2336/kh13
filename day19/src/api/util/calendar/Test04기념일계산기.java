package api.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test04기념일계산기 {
	public static void main(String[] args) {

		//오늘부터 계산한 1주년을 구하여 출력
		Calendar c = Calendar.getInstance();

		//[1] set() 과 get()으로 풀기
		int day = c.get(Calendar.DATE);
		c.set(Calendar.DATE, day + 100);

		//날짜 출력
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("y년 M월 d일 E요일");
		System.out.println(fmt.format(d));
	}
}