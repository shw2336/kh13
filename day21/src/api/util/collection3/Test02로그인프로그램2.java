package api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02로그인프로그램2 {
	public static void main(String[] args) {

		//저장소 생성
		//Map<String, String> datalist = new TreeMap<>();//key 순서로 정렬
		Map<String, String> datalist = new HashMap<>();

		//데이터 등록
		datalist.put("khadmin", "admin1234");
		datalist.put("khstudent", "student1234");
		datalist.put("khteacher", "teacher1234");
		datalist.put("khmanager", "manager1234");

		//사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		sc.close();

		//판정
		boolean idOk = datalist.containsKey(id);
		String dbPassword = datalist.get(id);
		//(주의) 있을 지 없을 지 불확실하다면 null을 무엇보다 먼저 검사해야함
		boolean passOk = dbPassword != null && dbPassword.equals(password);
		boolean isOk = idOk && passOk;
		if(isOk) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 정보가 일치하지 않습니다");
		}

	}
}