package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test05강제예외처리 {
	public static void main(String[] args) {
		
		try {//Plan A
			Scanner sc = new Scanner(System.in);
			System.out.print("귤 개수 : ");
			int mandarin = sc.nextInt(); //예외 발생 예상위치
			if(mandarin < 0) {//귤 개수가 음수라면 문제가 된다(자바는 모르네?)
//				Exception ex = new Exception(); //객체를 만들어서!
//				throw ex; //귤 개수가 음수라면!? -- > 던져! 예외처리하자
				
				throw new Exception(); //이렇게 만드는게 더 좋아 변수처리 안하고 일회용으로 쓸때는!	
			}
			System.out.print("인원 수 : ");
			int people = sc.nextInt(); //예외 발생 예상위치
			if(people < 0) {//인원수가 음수라면 문제가 된다(자바는 모르네?)
				throw new Exception();
			}
			
			int dist = mandarin / people;  //예외 발생 예상위치
			int rest = mandarin % people;
			
			System.out.println("한 사람당 " + dist + "개 씩 줄 수 있습니다");
			System.out.println("다 주면 " + rest + "개 남네요");
			
		}
			catch(Exception e) {//Plan B  한개로 통합
			System.err.println("프로그램 오류 발생");
		}
	
	}

}
