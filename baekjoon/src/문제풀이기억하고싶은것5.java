import java.util.Scanner;

public class 문제풀이기억하고싶은것5 {
	public static void main(String[] args) {
		
		String username = "d";
		
		int a = 5;
		int b = 10;
		int result = (a > b) ? a : b; // a가 b보다 크면 result에 a를 할당, 그렇지 않으면 b를 할당
		
		String text = "Hello, World!";
		String message = (text.length() > 10) ? "Long message" : "Short message"; // 문자열 길이가 10보다 크면 "Long message", 그렇지 않으면 "Short message"

		int number = 7;
		String parity = (number % 2 == 0) ? "Even" : "Odd"; // 숫자가 짝수이면 "Even", 홀수이면 "Odd"

		String name = (username != null) ? username : "Guest"; // username이 null이 아니면 username, 그렇지 않으면 "Guest"

		int x = 5;
		int y = 10;
		int resulty = (x > y) ? calculateSum(x, y) : calculateProduct(x, y); // x가 y보다 크면 합을 계산하고, 그렇지 않으면 곱을 계산


	}

	private static int calculateProduct(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int calculateSum(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
}