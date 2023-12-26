package api.lang.string;

import java.util.Scanner;

public class Test06공포의쿵쿵따2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 제시어 설정
		String word = "바나나";

		// 게임 시작 메시지
		System.out.println(word + "! 쿵쿵따!");

		while (true) {
			// 사용자에게 단어 입력 받기
			System.out.print("입력 : ");
			String write = sc.next();

			// 입력한 단어가 3글자이고, 제시어와 이어지는지 확인
			if (write.length() == 3 && write.charAt(0) == word.charAt(word.length() - 1)) {
				// 정상 입력인 경우
				word = write;
				System.out.println(word + "! 쿵쿵따!");
			} else {
				// 오류가 있는 경우
				System.out.println("땡! 게임오버!");
				break;
			}
		}

		// 게임 종료

	}
}
