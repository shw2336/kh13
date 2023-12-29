package api.util.scanner;

import java.util.Scanner;

public class Test01Scanner클래스2 {
	public static void main(String[] args) {
		//Scanner 클래스
		String song = "노는게 제일 좋아 친구들 모여라\n언제나 즐거워\n뽀롱뽀롱뽀롱뽀롱뽀로로";
		System.out.println(song);
		
		//.nextLine() 은 "한줄"을 읽는 명령 (\n 전까지)
		Scanner sc = new Scanner(song);
		while(sc.hasNextLine() /*==true 생략 // 읽을게 있다면 계속 하세요 */) {
//			if(sc.hasNext() == false) break; //더 읽을게 없다면 그만두세요(위 아래 같은말)
			System.out.println(sc.nextLine());			
		}
		sc.close(); //통료형 객체를 정리하는 메소드
	}
}