package api.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test04기념일계산기4 {
	public static void main(String[] args) {
		//입력한 날짜부터 100일 간격으로 출력
		String input = "2023-12-29";
		int year = Integer.parseInt(input.substring(0, 4));
		int month = Integer.parseInt(input.substring(5, 7));
		int day = Integer.parseInt(input.substring(8));

		Calendar c = Calendar.getInstance();

		for(int i=100; i <= 2 * 365; i += 100) {
			c.set(year, month-1, day + i);

			//날짜 출력
			Date d = c.getTime();
			SimpleDateFormat fmt = new SimpleDateFormat("y년 M월 d일 E요일");
			System.out.println(i+"일 뒤 : " +fmt.format(d));
		}

	}
}