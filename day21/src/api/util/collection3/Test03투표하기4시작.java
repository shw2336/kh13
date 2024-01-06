package api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03투표하기4시작 {
	public static void main(String[] args) {

		//저장소 생성
		Map<String, Integer> votes = new HashMap<>();

		//더미 데이터 추가
		votes.put("피카츄", 25);
		votes.put("라이츄", 17);

		//사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("투표할 대상 이름 : ");
		String input = sc.nextLine();
		sc.close();

		//판정
		if(votes.containsKey(input)) {//투표 이력이 있으면
			System.out.println("투표 기록이 있는 이름");
		}
		else {//투표 이력이 없다면
			System.out.println("투표 기록이 없는 이름");
		}

	}
}