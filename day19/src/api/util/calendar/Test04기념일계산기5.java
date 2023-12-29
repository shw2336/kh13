package api.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test04기념일계산기5 {
	public static void main(String[] args) {
		//입력한 날짜부터 100일 간격으로 출력
		String input = "2023-12-29";
		int year = Integer.parseInt(input.substring(0, 4));
		int month = Integer.parseInt(input.substring(5, 7));
		int day = Integer.parseInt(input.substring(8));

		Calendar c = Calendar.getInstance();

		//구해야 하는 날짜(더해야 하는 날짜)를 미리 저장
		int[] numbers = new int[] {
			100, 200, 300, 365+1, 400, 500, 
			600, 700, 730+1, 800, 900, 1000
		};

		for(int i=0; i < numbers.length; i++) {
			c.set(year, month-1, day + numbers[i]);

			//날짜 출력
			Date d = c.getTime();
			SimpleDateFormat fmt = new SimpleDateFormat("y년 M월 d일 E요일");

			if(numbers[i] % 100 == 0) {
				System.out.println(numbers[i]+"일 뒤 : " +fmt.format(d));
			}
			else {
				System.out.println(numbers[i]/365+"주년 : " + fmt.format(d));
			}
		}

	}
}