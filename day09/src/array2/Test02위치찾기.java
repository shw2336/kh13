package array2;

import java.util.Scanner;

public class Test02위치찾기 {
	public static void main(String[] args) {
//		사용자에게 5개의 실수를 입력받아 평균을 구하려고 합니다. 

//		좀 더 의미있는 데이터를 만들기 위해서 가장 작은 값과 가장 큰 값을 뺀 나머지 데이터로 평균을 구하는 프로그램을 구현하세요.
//		최소나 최대값이 2개이상이라면 둘 중 아무거나 한 개를 정해서 하시면 됩니다.
		Scanner sc = new Scanner(System.in);
		
		double[] numbers = new double[5];
		
		for(int i=0; i<5; i++) {
			numbers[i] = sc.nextDouble();
		}
		
		int max = 0;
		int min = 0;
		double total = 0;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[max] < numbers[i]) {
				max = i;
			}
			if(numbers[max] > numbers[i]) {
				min = i;
			}
			total +=numbers[i];
		}
		System.out.println("최대값 : " + (double)numbers[max]);
		System.out.println("최솟값 : " + (double)numbers[min]);
		System.out.println("최대값과 최솟값을 뺀 나머지 숫자들의 총합은 = " + (double)(total - numbers[max] + numbers[min]) );
		System.out.println("평균은 : " + (double)(total - numbers[max] + numbers[min])/(numbers.length-2));
	}
}