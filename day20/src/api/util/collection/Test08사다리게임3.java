package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08사다리게임3 {
	public static void main(String[] args) {

		//입력 추가
		Scanner sc = new Scanner(System.in);

		List<String> names = new ArrayList<>();
		List<String> items = new ArrayList<>();

		System.out.println("이름을 3개 입력하세요");
		names.add(sc.nextLine());
		names.add(sc.nextLine());
		names.add(sc.nextLine());

		System.out.println("당첨항목을 3개 입력하세요");
		items.add(sc.nextLine());
		items.add(sc.nextLine());
		items.add(sc.nextLine());

		Collections.shuffle(items);//항목 섞기

		System.out.println(names.get(0) + " → " + items.get(0));
		System.out.println(names.get(1) + " → " + items.get(1));
		System.out.println(names.get(2) + " → " + items.get(2));

	}
}