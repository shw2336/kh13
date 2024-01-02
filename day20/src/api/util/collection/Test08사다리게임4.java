package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08사다리게임4 {
	public static void main(String[] args) {

		//반복문 변경
		Scanner sc = new Scanner(System.in);

		List<String> names = new ArrayList<>();
		List<String> items = new ArrayList<>();

		System.out.println("이름을 3개 입력하세요");
		for(int i=0; i < 3; i++) {
			names.add(sc.nextLine());
		}

		System.out.println("당첨항목을 3개 입력하세요");
		for(int i=0; i < 3; i++) {
			items.add(sc.nextLine());
		}

		Collections.shuffle(items);//항목 섞기

		for(int i=0; i < 3; i++) {
			System.out.println(names.get(i) + " → " + items.get(i));
		}

	}
}