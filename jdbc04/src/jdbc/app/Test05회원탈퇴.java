package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;

public class Test05회원탈퇴 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MemberDao dao = new MemberDao();
		System.out.print("아이디 : ");
		boolean resultid = dao.delete(sc.nextLine());
		System.out.print("비밀번호 : ");
		boolean resultpw = dao.delete(sc.nextLine());
		
		if(resultid && resultpw) {
			System.out.println("삭제완료");
		}
		else {
			System.out.println("존재하지 않는 회원임");
		}
	}

}
