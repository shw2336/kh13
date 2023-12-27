package api.lang.string2;

import java.util.Scanner;

public class Test07이메일검사 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String write = sc.nextLine();
		
		String regex = "^[a-z0-9][_\\-a-z0-9]{4,19}(@[a-z]{3,20})\\.(co\\.kr|com|net|org|dev)$";
		
		if(write.matches(regex)) {
			System.out.println("올바른 이메일 주소입니다");
		}
		else {
			System.out.println("이메일 형식이 맞지 않습니다");
		}
		
	}
}
