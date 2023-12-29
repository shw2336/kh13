package api.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test04기념일계산기3 {
	public static void main(String[] args) {

		//사용자가 입력한 날짜부터 100일 뒤를 구하여 출력
		String input = "2023-12-29";
		int year = Integer.parseInt(input.substring(0, 4));
		int month = Integer.parseInt(input.substring(5, 7));
		int day = Integer.parseInt(input.substring(8));

		Calendar c = Calendar.getInstance();
		//c.set(Calendar.YEAR, year);
		//c.set(Calendar.MONTH, month-1);//사용자 입력값에 -1 처리 해야함
		//c.set(Calendar.DATE, day + 100);
		c.set(year, month-1, day + 100);

		//날짜 출력
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("y년 M월 d일 E요일");
		System.out.println(fmt.format(d));
	}
}