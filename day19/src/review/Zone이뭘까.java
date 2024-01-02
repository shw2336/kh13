package review;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zone이뭘까 {
	public static void main(String[] args) {
		// 특정 시간대 정보와 함께 날짜와 시간 생성
		ZoneId zoneId = ZoneId.of("Asia/Seoul");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
		System.out.println("특정 시간대의 날짜와 시간: " + zonedDateTime);

	}

}
