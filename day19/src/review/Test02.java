package review;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Test02 {
	public static void main(String[] args) {
		// 날짜 간 차이 계산
		LocalDate startDate = LocalDate.of(2022, 1, 1);
		LocalDate endDate = LocalDate.of(2022, 12, 31);
		Period period = Period.between(startDate, endDate);
		System.out.println("날짜 간 차이: " + period.getMonths() + " 개월 " + period.getDays() + " 일");

		// 시간 간 차이 계산
		LocalTime startTime = LocalTime.of(10, 0);
		LocalTime endTime = LocalTime.of(12, 30);
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("시간 간 차이: " + duration.toHours() + " 시간 " + duration.toMinutes() % 60 + " 분");
	}

}
