package loop2;

import java.util.Scanner;

public class Test03홀짝2 {
	public static void main(String[] args) {
		//사용자에게 10개의 시험점수를 입력받아서 
		//A등급과 B등급의 개수를 출력
		//A등급은 85점 이상 100점 이하
		//B등급은 70점 이상 85점 미만
		Scanner sc = new Scanner(System.in);

		int examcount = 10; //시험점수 개수
		int counta = 0; //A등급 개수
		int countb = 0; //B등급 개수
		int countc = 0; //나머지 등급 개수
		
		for(int i=1; i<=examcount; i++) {
			System.out.print("시험점수를 입력하세요 : ");
			int exam = sc.nextInt();
			if(exam >= 85) {
				counta++;
			}
			else if(exam >= 70) {
				countb++;
			}
			else {
				countc++;
			}
		}
		System.out.println("a등급은" + counta + " 개 입니다");
		System.out.println("b등급은" + countb + " 개 입니다");
		System.out.println("나머지 등급은" + countc + "개 입니다");
	}
}