package condition2;

import java.util.Scanner;

public class Test05과제1수정 {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("초 입력하세요");
		int time = sc.nextInt();
		
		//계산
		String timeText;
		if(time < 10) {//10초가 되지 않았다면
			timeText = "방금 전";
		}
		else if(time < 60) {
			int second = time;
			timeText = second + "초 전";
		}
		else if(time < 60 * 60) {
			int minute = time / 60;
			timeText = minute+"분 전";
		}
		else if(time < 24 * 60 * 60) {
			int hour = time / 60 / 60;
			timeText = hour+"시간 전";
		}
		else {
			int day = time / 24 / 60 / 60;
			timeText = day+"일 전";
		}
		
		//출력
		System.out.println("작성시각 : " + timeText);
		
	}
}