package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08사다리게임7 {
	public static void main(String[] args) {

//		네이버에서 사다리게임을 검색하여 나오는 프로그램을 인원수를 3명으로 고정 하고 푸세요
//		(단, 애니메이션 부분은 제외합니다)
//
//		다 푸신 분들은 인원수를 실제 프로그램과 동일하게 구현해보세요

		Scanner sc = new Scanner(System.in);
		List<String> name = new ArrayList<>();
		List<String> result = new ArrayList<>();
		
		System.out.println("인원 수를 입력하세요");
		int people = sc.nextInt();
		
		System.out.println(people + "명의 이름을 입력하세요");
		for (int i = 0; i < people; i++) {
			name.add(sc.next());
		}
		System.out.println(people + "개의 결과를 입력하세요");
		for (int i = 0; i < people; i++) {
			result.add(sc.next());
		}

		Collections.shuffle(result);

		System.out.println("사다리 게임 결과");
		for (int i = 0; i < people; i++) {
			System.out.println(name.get(i) + " : " + result.get(i));

		}
	}
}
