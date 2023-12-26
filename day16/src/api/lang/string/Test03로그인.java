package api.lang.string;

import java.util.Scanner;

public class Test03로그인 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		String ID = sc.next();
		
		System.out.print("비밀번호를 입력하세요 : ");                    
		String Password = sc.next();
		
		String rightid = "khacademy";
		String rightpassword = "adminuser";
		
		if(ID.equalsIgnoreCase(rightid) && Password.equals(rightpassword)) {
			System.out.println("로그인 되었습니다");
		}
		else {
			System.out.println("입력한 정보가 잘못되었습니다");
		}
		
	}
}