package api.lang.string2;

import java.util.Scanner;

public class Test02이름검사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성 입력 : ");
		String s = sc.nextLine();
		System.out.print("이름 입력 : ");
		String n = sc.nextLine();
		
		if(!s.matches("^[가-힣]{1,2}$") ||!n.matches("^[가-힣]{1,5}$")) {
			System.out.println("올바름 이름이 아닙니다");
		}
		else {
			System.out.println(s + n + "는(은) 올바른 이름입니다");
		}
	
	}

}
