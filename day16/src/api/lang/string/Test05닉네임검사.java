package api.lang.string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test05닉네임검사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("닉네임을 입력하세요 : ");
		String nickname = sc.next();
		if(nickname.contains("운영자")) {
			System.out.println("잘못된 닉네임입니다");
			return;
		}
		
		if(nickname.length()>=2 && nickname.length() <=10) {
			System.out.println("올바른 닉네임입니다");
		}
		else {
			System.out.println("잘못된 닉네임입니다");
		}
	}
}
