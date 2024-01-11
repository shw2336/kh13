package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test04비밀번호변경 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MemberDto dto = new MemberDto();
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		dto.setMemberId(a);
		dto.setMemberId(b);
		
		if(a.equals(dto.getMemberId())) {
			MemberDao dao = new MemberDao();
			boolean result = dao.update(dto);
			
			dto.setMemberNick(sc.nextLine());
			
			if(result) {
				System.out.println("정보변경");
			}
			else {
				System.out.println("존재 하지 않는 정보입니다");
			}
			
		}
		else {
			System.out.println("존재하지 않는 정보");
		}
		
		
	}

}
