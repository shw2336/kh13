package condition2;

import java.util.Scanner;

public class Test05과제1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요 :");
		int time = sc.nextInt();
		
		//moment = 10;
		//second = 60;
		//minute = time / 60;
		//hour = time / 60 / 60;
		//day = time / 60 / 60 / 12;
		
		int times;
		if( time < 10 ) {
			System.out.println("방금 전");
		}
		else if (time < 60) {
			System.out.println(time + "초 전");
		}
		else if (time < 60 * 60) {
			times = time / 60;
		System.out.println(times + "분 전");
		}
		else if (time < 60 * 60 * 12) {
			times = time / 60 / 60;
			System.out.println(times + "시간 전");
		}
		else {
			times = time / 60 / 60 / 12;
			System.out.println(times + "일 전");
		}
	}
}
