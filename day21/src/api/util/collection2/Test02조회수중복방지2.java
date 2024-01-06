package api.util.collection2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test02조회수중복방지2 {
	public static void main(String[] args) {
//		유튜브에서는 크리에이터에게 조회수를 기반으로 한 수익을 제공합니다.
//		따라서 조회수가 의미 없이 마구잡이로 올라가는 것을 방지하려고 합니다.
//
//		사용자가 보고 싶은 영상 제목을 입력합니다
//		사용자가 입력한 영상 제목을 시청한 기록이 있을 경우 "조회수 증가 없이 영상만 재생합니다"를 출력합니다
//		사용자가 입력한 영상 제목을 시청한 기록이 없을 경우 "조회수 증가 후 영상을 재생합니다"를 출력합니다
//		사용자가 종료라는 글자를 입력하기 전까지 반복합니다
//		사용자가 종료라는 글자를 입력하면 여태까지 시청한 영상 개수를 출력하세요
		
		
		Scanner sc = new Scanner(System.in);
		
		Set<String> hs = new HashSet<>();
		
		
		
		while(true) {
			
			String input = sc.next();
			
			if(input.equals("종료")) {
				System.out.println(hs.size() + "개 시청");	break;
			}
			
			if(hs.contains(input)) {
				System.out.println("조회 수 증가 없이 영상만 재생합니다");
			}
			else {
				System.out.println("조회 수 증가 후 영상을 재생합니다");
				hs.add(input);
			}
			
		}

		
	}

}
