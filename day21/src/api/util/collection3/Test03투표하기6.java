package api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03투표하기6 {
	public static void main(String[] args) {

		//저장소 생성
		Map<String, Integer> votes = new HashMap<>();

		//더미 데이터 추가
		//votes.put("피카츄", 25);
		//votes.put("라이츄", 17);

		Scanner sc = new Scanner(System.in);

		while(true) {
			//사용자 입력
			System.out.print("투표할 대상 이름 : ");
			String input = sc.nextLine();
			if(input.equals("종료")) {
				break;
			}

			//판정
			if(votes.containsKey(input)) {//투표 이력이 있으면
				//System.out.println("투표 기록이 있는 이름");
				int count = votes.get(input);//기존 득표수를 꺼내어
				votes.put(input, count+1);//+1 한 다음 재설정
				System.out.println("["+input+"] 투표 완료! 득표수 "+(count+1));
			}
			else {//투표 이력이 없다면
				//System.out.println("투표 기록이 없는 이름");
				votes.put(input, 1);//득표수 1로 저장
				System.out.println("["+input+"] 투표 완료! 득표수 "+1);
			}

		}

		sc.close();

		//출력
		System.out.println(votes);
	}
}