package oop.constructor3;

import java.util.Scanner;

public class Test01객체생성 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID를 입력하세요 : ");
		String a1 = sc.next();
		System.out.print("직업을 입력하세요 : ");
		String a2 = sc.next();
		
		Character a = new Character(a1, a2);

				a.information();
	}
}
