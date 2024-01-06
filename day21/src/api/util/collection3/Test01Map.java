package api.util.collection3;

import java.util.HashMap;
import java.util.Map;

public class Test01Map {
	public static void main(String[] args) {
		//Map<K, V>
		//- 두 개의 데이터를 세트로 저장하는 저장소
		//- K(key)는 중복이 불가능 //아이디는 중복이 불가능 요런느낌
		//- V(value)는 중복이 가능 //비밀번호는 중복이 가능 요런느낌
		//- HashMap, TreeMap
		//- 한개를 매우 빠르게 불러오는 것이 목적(개별관리)
		
		Map<String, Integer> people = new HashMap<>();
		
		//데이터 추가
//		people.add("유재석, 50") //add()는 데이터 1개만 추가하는 명령
		people.put("유재석", 51); //key-value 세트 추가 명령
		people.put("박명수", 52);
		people.put("정준하", 52);
		people.put("유재석", 50); //같은 key에 해당하는 value를 덮어쓰기
		people.put("김종국", 47);
		
		//데이터 검색
		System.out.println(people.containsKey("유재석")); //true
		System.out.println(people.containsKey("지석진")); //false
		System.out.println(people.containsValue(50)); //true
		System.out.println(people.containsValue(55)); //false
		
		//데이터 삭제
//		people.remove("박명수", 52);
		people.remove("박명수");
		
		//데이터 추출 - .get()
		System.out.println(people.get("유재석")); //50
		System.out.println(people.get("노홍철")); //null
		
		//개수 확인
		System.out.println("개수 = " + people.size());
		
		//출력
		System.out.println(people);
	}

}
