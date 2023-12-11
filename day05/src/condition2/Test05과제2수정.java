package condition2;

import java.util.Scanner;

public class Test05과제2수정 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요 :");
		int time = sc.nextInt();
		
		
		// 초 입력하면 시간에 따라 다른 단위로 출력 방금 전 , ?초 전, ?분 전, ?시간 전, ?일 전
		// time < 10 = 방금전
		// time < 60 = ?초 전	
		// time < (60 * 60) = ?분 전
		// time < (60 * 60 * 24) = ?시간 전	
		// else = ?일 전
		
		int minute = time / 60;
		int hour = time / 60 / 60;
		int day = time / 60 / 60 / 24;
		
		String write;
		if( time < 10 ) {
		write = "방금 전";
		}
		else if (time < 60) {
		write = time + "초 전";
		}
		else if (time < 60 * 60) {
			write = minute + "분 전";
		}
		else if (time < 60 * 60 * 24) {
			write = hour  + "시간 전";
		}
		else {
			write = day + "일 전";
		}
		System.out.print(write + "에 작성된 글입니다");
	}
}