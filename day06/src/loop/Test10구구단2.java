package loop;

import java.util.Scanner;

public class Test10구구단2 {
	public static void main(String[] args) {

		System.out.println("입력하세요");
Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		// for(int i =9; i>0; i--) { }
		for(int i=9; i>0; i--) {
			System.out.println(number + "X" + i + "=");
			int right = sc.nextInt();
			int real = number * i;
			if(real == right) {
				 System.out.println("정답입니다");
			}
			else{
				 System.out.println("오답입니다");
			}
			
		}
		 System.out.println("끝");
	
	}
}
