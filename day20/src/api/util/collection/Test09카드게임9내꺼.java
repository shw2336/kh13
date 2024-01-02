package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test09카드게임9내꺼 {
	public static void main(String[] args) {
//		트럼프 카드에서 사용자가 입력한 장수 만큼의 카드를 랜덤으로 섞은 뒤 추첨하는 프로그램을 구현하려고 합니다. 
//		콘솔 환경이기 때문에 그래픽으로 구현하긴 어려우니 글자로 대체해서 보여주려고 합니다.
//		(ex : 하트3, 스페이드A)
//
//		카드는 총 52장이 있습니다.
//		52장은 4종류의 모양으로 구분됩니다(하트/스페이드/클로버/다이아)
//		각각의 모양에는 A,2,3,4,5,6,7,8,9,10,J,Q,K가 존재합니다.
//
//		카드 한 덱(52장)을 생성
//		카드덱을 셔플
//		사용자가 원하는 만큼 출력
		
		List<String> trumpcard = new ArrayList<>();
		List<String> number = new ArrayList<>();
		
		
		//trumpcard.add("하트, 스페이드, 클로버, 다이아");
		trumpcard.add("하트");
		trumpcard.add("스페이드");
		trumpcard.add("클로버");
		trumpcard.add("다이아");
		
		

			number.add("A");
			number.add("J");
			number.add("Q");
			number.add("K");
		
			

			for(int k=2; k<=10; k++) {
				
				//number.add();
			}

		
		Collections.shuffle(trumpcard);
		Collections.shuffle(number);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 만큼 카드를 뽑아주세요 : ");
		int pick = sc.nextInt();
		
		for(int i=0; i<pick; i++) {
			System.out.println(number.get(i) + trumpcard.get(i));			
		}
		
	}
}
