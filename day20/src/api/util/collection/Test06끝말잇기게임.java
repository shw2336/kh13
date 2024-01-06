package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06끝말잇기게임 {
	public static void main(String[] args) {

		//저장소 구현
		List<String> history = new ArrayList<>();

		//제시어 추가
		history.add("자바");

		//사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.nextLine();

		//판정
		if(history.contains(input)) {
			System.out.println("게임 오버!");
		}
		else {
			System.out.println("제시어 변경");
		}

	}
}