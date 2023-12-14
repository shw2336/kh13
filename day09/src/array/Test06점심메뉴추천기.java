package array;

import java.util.Random;
import java.util.Scanner;

public class Test06점심메뉴추천기 {
	public static void main(String[] args) {
//		사용자에게 5가지 점심메뉴를 입력받아 배열에 저장한 뒤
//		무작위로 한개를 골라 출력하도록 프로그램을 구현하세요
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("드시고 싶은 메뉴를 5가지 입력해주세요");
		String[] write = new String[5];
		for(int i=0; i<write.length; i++) {
			write[i] = sc.next();
		}
		for(int i=0; i<write.length; i++) {
			System.out.print(write[i] + "  ");
		}
		System.out.println(" 중에 오늘의 점심메뉴는!?");
		
		int pick = r.nextInt(5);
		System.out.println(write[pick] + " 입니다!");
		}
}