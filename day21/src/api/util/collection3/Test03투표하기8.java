package api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03투표하기8 {
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
			Integer count = votes.get(input);//득표수 추출(없으면 null)
			if(count == null) {
				count = 1;
			}
			else {
				count = count + 1;
			}
			votes.put(input, count);
			System.out.println("["+input+"] 투표 완료! 득표수 "+count);

		}

		sc.close();

		//출력
		System.out.println(votes);
	}
}