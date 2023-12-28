package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02try구문 {
	public static void main(String[] args) {
		
		try {//Plan A
			Scanner sc = new Scanner(System.in);
			System.out.print("귤 개수 : ");
			int mandarin = sc.nextInt(); //예외 발생 예상위치
			System.out.print("인원 수 : ");
			int people = sc.nextInt(); //예외 발생 예상위치
			
			int dist = mandarin / people;  //예외 발생 예상위치
			int rest = mandarin % people;
			
			System.out.println("한 사람당 " + dist + "개 씩 줄 수 있습니다");
			System.out.println("다 주면 " + rest + "개 남네요");
			
		}
		
		catch(InputMismatchException e) {//Plan B - 잘못된 입력
			System.out.println("입력이 잘못되었습니다");
		}
		
		catch(ArithmeticException e) {//Plan B - 나누기 에러
			System.out.println("인원수는 0일 수 없습니다");
		}
	
	}

}
