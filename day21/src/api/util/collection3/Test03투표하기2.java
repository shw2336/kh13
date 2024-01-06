package api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03투표하기2 {
	public static void main(String[] args) {

//		사용자에게 이름을 입력받아 투표를 진행할 수 있도록 프로그램을 만드세요
//
//		사용자에게 반복적으로 이름을 입력받습니다
//		입력받은 이름이 처음 입력된 이름이라면 득표수를 1로 저장합니다
//		입력받은 이름이 이미 입력된 이름이라면 기존 득표수에 1을 더하여 저장합니다
//		투표가 완료되면 현재 투표된 이름의 득표수를 출력합니다
//		이름 입력 시 종료라는 글자가 입력되면 투표 프로그램을 종료하고 모든 값을 출력합니다
//
//		이름 입력 : (피카츄)
//		[피카츄] 현재 1표 획득!
//
//		이름 입력 : (라이츄)
//		[라이츄] 현재 1표 획득!
//
//		이름 입력 : (피카츄)
//		[피카츄] 현재 2표 획득!
//
//		이름 입력 : (피카츄)
//		[피카츄] 현재 3표 획득!
//
//		이름 입력 : (라이츄)
//		[라이츄] 현재 2표 획득!
//
//		이름 입력 : (종료)
//
//		프로그램을 종료합니다.
//
//		{피카츄=3, 라이츄=2}

		Map<String, Integer> voteCount = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("이름 입력 : ");
			String name = sc.nextLine();
			
			if (name.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			if (voteCount.containsKey(name)) {
                int currentCount = voteCount.get(name);
                voteCount.put(name, currentCount + 1);
            } else {
                voteCount.put(name, 1);
            }

            System.out.println("[" + name + "]" + " 현재 " + voteCount.get(name) + "표 획득!");
        }

        System.out.println("\n투표 결과:");
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

	}

}
