package array2;

import java.util.Scanner;

public class Test02위치찾기2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//배열 준비
		//data ---->	[ 0.0 ][ 0.0 ][ 0.0 ][ 0.0 ][ 0.0 ]
		double[] data = new double[5];

		//입력
		//for(int i=0; i <= 4; i++) {
		for(int i=0; i < data.length; i++) {
			System.out.print("입력 : ");
			data[i] = sc.nextDouble();
		}

		//최대값 위치 구하기
		int max = 0;//맨앞이 제일 클것이라고 예상
		//for(int i=1; i <= 4; i++) {//1번부터 4번까지 조회하여
		for(int i=1; i < data.length; i++) {//1번부터 마지막까지 조회하여
			if(data[max] < data[i]) {//현재 값이 내가 아는 최대값보다 더 크다면
				max = i;//내가 아는 최대값의 위치를 수정
			}
		}
		//System.out.println("최대값 위치 : " + max);

		//최소값 위치 구하기
		int min = 0;//맨앞이 제일 작을것이라고 예상
		//for(int i=1; i <= 4; i++) {//1번부터 4번까지 조회하여
		for(int i=1; i < data.length; i++) {//1번부터 마지막까지 조회하여
			if(data[min] > data[i]) {//현재 값이 내가 아는 최소값보다 더 작다면
				min = i;//내가 아는 최소값의 위치를 수정
			}
		}
		//System.out.println("최소값 위치 : " + min);

		//합계 구하기
		double total = 0.0;
		//for(int i=0; i <= 4; i++) {
		for(int i=0; i < data.length; i++) {
			total += data[i];
		}
		total -= data[min];//제일작은거
		total -= data[max];//제일큰거

		//double avg = total / 3;
		double avg = total / (data.length-2);

		System.out.println("평균 = " + avg);

	}
}