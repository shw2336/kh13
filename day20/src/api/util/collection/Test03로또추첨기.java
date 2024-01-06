package api.util.collection;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Test03로또추첨기 {
	public static void main(String[] args) {
//		ArrayList를 만들어 이번 주 예상 로또 번호 6개를 추첨하여 저장한 뒤 출력
//		(단, Random클래스를 사용하고, 중복된 번호는 추첨할 수 없다)
		
//		주의사항
//		Generic type에는 class 형태만 작성할 수 있습니다. 
		
		TreeSet<Integer> a = new TreeSet<>();
		//ArrayList<Integer> a = new ArrayList<>();
		
		Random r = new Random();
		
		 while (a.size() < 6) {
	            int randomNumber = r.nextInt(45) + 1; // 
	            if (!a.contains(randomNumber)) {
	                a.add(randomNumber);
	            }
	            
	        }
		
		System.out.println("로또 추첨 번호 : " + a);

		
	}
}