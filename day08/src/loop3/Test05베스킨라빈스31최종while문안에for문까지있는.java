package loop3;

import java.util.Scanner;

public class Test05베스킨라빈스31최종while문안에for문까지있는 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = 1;

		while(true) {
			System.out.println("현재 차례 : " + number);
			System.out.print("개수(1~3) 입력 : ");
			int user = sc.nextInt();

			//사용자가 선택한 숫자 개수에 따른 멘트 출력
			for(int i=0; i < user; i++) {
				System.out.print(number + i);
				System.out.print("\t");
			}
			System.out.println("선택");

			number += user;

			if(number > 31) {
				break;
			}
		}

		System.out.println("당신은 패배하였습니다");

	}
}