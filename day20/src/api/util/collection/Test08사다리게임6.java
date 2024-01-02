package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08사다리게임6 {
	public static void main(String[] args) {

		//인원수 입력 처리
		Scanner sc = new Scanner(System.in);

		System.out.print("인원수 설정 : ");
		int count = sc.nextInt();
		sc.nextLine();//다음 입력에 영향을 주는 잔여 엔터 정리

		List<String> names = new ArrayList<>();
		List<String> items = new ArrayList<>();

		System.out.println("이름을 "+count+"개 입력하세요");
		for(int i=0; i < count; i++) {
			names.add(sc.nextLine());
		}

		System.out.println("당첨항목을 "+count+"개 입력하세요");
		for(int i=0; i < count; i++) {
			items.add(sc.nextLine());
		}

		Collections.shuffle(items);//항목 섞기

		System.out.println("<추첨 결과>");
		for(int i=0; i < count; i++) {
			System.out.println(names.get(i) + " → " + items.get(i));
		}

	}
}