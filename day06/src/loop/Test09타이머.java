package loop;

import java.util.Scanner;

public class Test09타이머 {
	public static void main(String[] args) {
		//사용자에게 분과 초를 입력받아서 해당하는 시간만큼의 메세지를 출력하는 프로그램을 구현
		// 분 입력 : 1
		// 초 입력 : 30
		
		// 1분 30초 후 알람이 울립니다
		// 1분 30초 후 알람이 울립니다
		// 1분 30초 후 알람이 울립니다
		// ....
		// 0분 2초 후 알람이 울립니다
		// 0분 1초 후 알람이 울립니다
		// 0분 0초 후 알람이 울립니다
		// 띠링!
		Scanner sc = new Scanner(System.in);
		
		int minute = sc.nextInt();
		int second = sc.nextInt();
		
		int time = minute * 60 + second;

		for(int i = time; i>=0; i--) {
			
			if(i <= 90 && i > 0) {
				
				int minute1 = i / 60;
				int second1 = i % 60;
				
				System.out.println(  minute1 + "분" + second1 + "초");
			}
			else{
				System.out.println("띠링!");
			}
		}
	}
}