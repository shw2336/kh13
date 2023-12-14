package array;

import java.util.Random;
import java.util.Scanner;

public class Test06점심메뉴추천기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] menus = new String[5];
		for(int i=0; i < menus.length; i++) {
			System.out.print("항목 입력 : ");
			menus[i] = sc.next();
		}

		//랜덤은 위치하나만 추첨
		Random r = new Random();
		int position = r.nextInt(menus.length);
//		System.out.println("position = " + position);

		System.out.println("추첨 결과 : " + menus[position]);
	}
}