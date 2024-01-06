package api.util.collection2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test03팔로우3 {
	public static void main(String[] args) {

//		Set<String> storage = new TreeSet<>();//팔로우 목록 출력이 필요할 경우
		Set<String> storage = new HashSet<>();//팔로우 여부 확인만 할 경우

//		storage.add("testuser1");
//		storage.add("testuser2");
//		storage.add("testuser3");

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("사용자ID : ");
			String id = sc.nextLine();
			if(id.equals("종료")) {
				break;
			}

			if(storage.contains(id)) {//저장소에 아이디가 있으면 = 팔로우 한 상태면
				//System.out.println("이미 팔로우한 사용자입니다");
				storage.remove(id);
				System.out.println(id+"님을 팔로우 해제하였습니다");
			}
			else {//저장소에 아이디가 없으면 = 팔로우 하지 않았으면
				//System.out.println("팔로우한 적 없는 사용자입니다");
				storage.add(id);
				System.out.println(id+"님을 팔로우 설정하였습니다");
			}
		}

		sc.close();

		System.out.println("내가 팔로우한 사용자 수 : " + storage.size());

	}
}