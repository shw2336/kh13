package loop3;

import java.util.Scanner;

public class Test06모래성게임2컨티뉴넣어보기 {
	public static void main(String[] args) {
		//최초에 100이라는 숫자를 정해두고 사용자에게 1~9 사이의 숫자를 입력받아 0을 만드는 사람이 패배하도록 모래성 게임을 구현하세요

		//남은 숫자 : 100
		//가져갈 숫자(1~9) 입력 : 5

		//남은 숫자 : 95
		//가져갈 숫자(1~9) 입력 : 9

		//남은 숫자 : 86
		//가져갈 숫자(1~9) 입력 : ?

		//...

		//남은 숫자 : 1
		//가져갈 숫자(1~9) 입력 : 1

		//당신은 패배했습니다

		Scanner sc = new Scanner(System.in);
		int start = 100;
		int remain = 0;
		while(true) {
			
			System.out.print("남은 숫자 : " + start);
			System.out.println();
			System.out.print("가져갈 숫자(1~9) 입력 : ");
			int num = sc.nextInt();
			
			if(!(num>=1 && num <=9)) {
				System.out.println();
				System.out.println("다시 입력하세요!");
				System.out.println();
				continue;
			}
			
			if(num>=1) {
				start -= num;
			}
			if(start <= 0) {
				System.out.println("패배하셨습니다");
				break;		
		}
	}
}
}