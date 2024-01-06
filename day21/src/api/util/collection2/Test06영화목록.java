package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test06영화목록 {
	public static void main(String[] args) {
		
		Set<String> mario = Set.of("서울의 봄","그대들은 어떻게 살 것인가", 
				"3일의 휴가", "괴물");
		
		Set<String> ruizy = Set.of("나폴레옹","사랑은 낙엽을 타고", 
				"서울의 봄", "괴물", "쏘우X");
		
		//합집합
		Set<String> allWatching = new TreeSet<>();
		allWatching.addAll(mario);
		allWatching.addAll(ruizy);
		System.out.println("모두 본 영화는 : " + allWatching);
		
		//교집합
		Set<String> together = new TreeSet<>();
		together.addAll(mario);
		together.retainAll(ruizy);
		System.out.println("둘다 본 영화 : " + together);
		
		//각각 차집합 한명만 본 영화 목록(합집합 - 교집합)
		Set<String> good = new TreeSet<>();
		good.addAll(allWatching);
		good.removeAll(together);

		System.out.println("한명만 본 영화 목록 : " + good);
		
		
		
		
		
		
		
		
	}

}
