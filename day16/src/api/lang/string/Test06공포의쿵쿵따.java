package api.lang.string;
import java.util.Scanner;

public class Test06공포의쿵쿵따 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 제시어 설정
        String currentWord = "바나나";

        // 게임 시작 메시지
        System.out.println(currentWord + "! 쿵쿵따!");

        while (true) {
            // 사용자에게 단어 입력 받기
            System.out.print("(" + currentWord.charAt(currentWord.length() - 1) + ")");
            String userInput = sc.next();

            // 입력한 단어가 3글자이고, 제시어와 이어지는지 확인
            if (userInput.length() == 3 && userInput.charAt(0) == currentWord.charAt(currentWord.length() - 1)) {
                // 정상 입력인 경우
                currentWord = userInput;
                System.out.println(currentWord + "! 쿵쿵따!");
            } else {
                // 오류가 있는 경우
                System.out.println("땡! 게임오버!");
                break;
            }
        }

        // 게임 종료

    }
	}


