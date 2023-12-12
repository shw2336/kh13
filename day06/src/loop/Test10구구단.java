package loop;

import java.util.Scanner;

public class Test10구구단 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);	
System.out.print("단을 입력하세요 : ");
		int number = sc.nextInt();
		
		for(int i = 1; i <=9; i++) {
			System.out.print(number + "X" + i + " = ");
			
			int correct = number * i;
			int wirte = sc.nextInt();
			
			if(correct == wirte) {
				System.out.println("정답!");
			}
			else {
				System.out.println("땡!");
			}
		}
		System.out.println("게임 끝!");
	}
}