package loop;

import java.util.Scanner;

public class Test09타이머3완성풀이 {
	public static void main(String[] args) {

		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("분 입력 : ");
		int minute = sc.nextInt();
		System.out.print("초 입력 : ");
		int second = sc.nextInt();

		//계산
		int time = minute * 60 + second;
		//System.out.println(time);

		System.out.println("알람을 실행합니다");
		for(int i=time; i >= 0; i--) {
			int m = i / 60, s = i % 60;
			System.out.println(m+"분 "+s+"초 후 알람이 울립니다");
		}
		System.out.println("띠링!");
	}
}