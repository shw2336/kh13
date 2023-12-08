package condition2;

import java.util.Scanner;

public class Test02지하철요금 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		int deposit = 500;
		
		if (age>= 65) {
			System.out.println("무료입니다");
		}
		else if(age >= 20) {
			System.out.println("1400원입니다");
		}
		else if(age >= 14) {
			System.out.println("800원입니다");
		}
		else if(age >= 8) {
			System.out.println("500원입니다");
		}
		else {
			System.out.println("무료입니다");
		}
	}

}
