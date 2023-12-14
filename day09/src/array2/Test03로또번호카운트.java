package array2;

import java.util.Random;

public class Test03로또번호카운트 {
	public static void main(String[] args) {
//		KH로또연구소에서는 가장 많이 나오는 로또번호가 몇번인지 알고 싶어서 시뮬레이션을 진행하려고 합니다
//		로또번호를 1000번정도 추첨해서 각각 나온 횟수를 저장하려고 합니다.
//		1.번호별로 나온 횟수를 출력
//		2.가장 많이 나온 번호를 출력(동점이면 아무거나)
//		
//		주사위를 1000번 던져서 나온 횟수 저장 / 번호별로 나온 횟수 출력 / 가장 많이 나온 번호를 출력
		Random r = new Random();
		int[] counts = new int[1000]; 
		
		int dice1 = 0;
		for(int i=0; i<1000; i++) {
			int numbers = r.nextInt(6) + 1;
			counts[i] = numbers;
			if(numbers == 1) {
				dice1++;
				System.out.println("주사위 1 = " + dice1);
			}
		}
		//System.out.println(numbers);
		
		System.out.println(counts[1]);
	//	for(int i=0; i<1000; i++) {
		//	counts[i] = int numbers}
			
			
		}
	}
