package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test08사다리게임 {
	public static void main(String[] args) {

		//이름과 항목을 따로 저장한 뒤 연결하여 출력
		List<String> names = new ArrayList<>();
		List<String> items = new ArrayList<>();

		names.add("피카츄");
		names.add("라이츄");
		names.add("파이리");

		items.add("밥사기");
		items.add("술사기");
		items.add("얻어먹기");

		System.out.println(names.get(0) + " → " + items.get(0));
		System.out.println(names.get(1) + " → " + items.get(1));
		System.out.println(names.get(2) + " → " + items.get(2));

	}
}