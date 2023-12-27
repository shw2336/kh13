package api.lang.string;

import java.util.Scanner;

public class Test07욕설필터링 {
	public static void main(String[] args) {
//		사용자가 임의의 문자열을 입력했을 때 이 안에 포함된 욕설을 모두 마스킹 처리하세요
//
//		이번에는 사용자가 띄어쓰기가 있는 문자열을 입력해야 합니다.
//		욕설 샘플은 다음과 같습니다.
//		수박, 조카, 시베리아, 개나리, 신발끈, 
//		지옥, 주옥, 십장생, 십자수, 게불
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String[] group = {"수박", "조카", "시베리아", "개나리", "신발끈", 
				"지옥", "주옥", "십장생", "십자수", "게불"};
		
		
		System.out.println("욕설치환 = " + input.replace(group.toString(), "사랑해"));
		
		
		
	}

}
