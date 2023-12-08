package condition2;

import java.util.Scanner;

public class Test02지하철요금3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		int deposit = 500;
		
		boolean sir = age >= 65;
		boolean adult = 20 <= age && age <65;
		boolean teenager = 14 <= age && age < 20;
		boolean children = 8 <= age && age < 14;
		boolean infant = 8 > age;
		
		int sirpay = 0;
		int adultpay = 1400;
		int teenagerpay = 800;
		int childrenpay = 500;
		int infantpay = 0;
		
		if (sir) {
			System.out.println(deposit + sirpay + "원 입니다.");
		}
		else if(adult) {
			System.out.println(deposit + adultpay + "원 입니다.");
		}
		else if(teenager) {
			System.out.println(deposit + teenagerpay + "원 입니다.");
		}
		else if(children) {
			System.out.println(deposit + childrenpay + "원 입니다.");
		}
		else {
			System.out.println(deposit + infantpay + "원 입니다.");
		}
	}
}
