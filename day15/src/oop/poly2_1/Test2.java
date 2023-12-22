package oop.poly2_1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("노트북을 먼저 선택하세요");
		System.out.println("1.맥북   2.갤럭시북");
		int choice = sc.nextInt();
		Notebook fuction;
		if (choice == 1) {
			MacBook answer = new MacBook();
			System.out.println("테스트할 기능을 선택하세요");
			System.out.println("1.전원  2.동영상재생 3.타이핑");
			int function = sc.nextInt();
			if (function == 1) {
				answer.power();
			} else if (function == 2) {
				answer.video();
			} else {
				answer.typing();
			}
		} else if (choice == 2) {
			GalaxyBook answer = new GalaxyBook();
			System.out.println("테스트할 기능을 선택하세요");
			System.out.println("1.전원  2.동영상재생 3.타이핑");
			int function = sc.nextInt();
			if (function == 1) {
				answer.power();
			} else if (function == 2) {
				answer.video();
			} else {
				answer.typing();
			}
		}

	}

}
