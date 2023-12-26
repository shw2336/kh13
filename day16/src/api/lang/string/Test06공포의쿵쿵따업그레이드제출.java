package api.lang.string;

import java.util.Random;
import java.util.Scanner;

public class Test06공포의쿵쿵따업그레이드제출 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		String[] List = {"바나나", "기러기", "대나무", "무지개"};
		
		//랜덤으로 뽑아줘
		String word = List[r.nextInt(List.length)];
		
		int count = 0;
		
		//시작
		System.out.println(word + "! 쿵쿵따!");

		while (true) {
			//입력
			System.out.print("입력 : ");
			String write = sc.next();

			int koreanCount = 0;	
			
			for(int i=0; i<write.length(); i++) {
				char ch = write.charAt(i);
				if('가' <= ch && ch <= '힣') {
					koreanCount++;
				}
			}
			boolean isCorrectKorean = word.length() == koreanCount;
			
			// 한글 && 입력한 단어가 3글자 && 첫글자와 랜덤글자 마지막글자와 같은지
			boolean isRight = isCorrectKorean && write.length() == 3 && write.charAt(0) == word.charAt(word.length() - 1);
			
			if (isRight) {
				
				word = write; //입력한 글자 → 랜덤글자
				System.out.println(word + "! 쿵쿵따!");
				count++;
			} else {
				
				System.out.println("땡! 게임오버!");
				System.out.println("통과한 라운드 수 : " + count);
				break;
			}
		}

		// 종료

	}
}
