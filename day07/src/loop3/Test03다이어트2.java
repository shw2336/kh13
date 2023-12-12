package loop3;

public class Test03다이어트2 {
	public static void main(String[] args) {
//		오늘부터 다이어트를 위해 줄넘기를 하려고 합니다.
//		첫날은 힘드니까 100개만 하고 다음날부터는 전날보다 10개씩 더 하려고 합니다.
//		30일동안 하게 되는 일자별 줄넘기 개수 출력
//		30일동안 하게 되는 총 줄넘기 개수 출력
		
		int begin = 100;
		int step = 10;
		
		for(int day=1; day<=30; day++) {
			int count = day * step + begin- 10; //첫날 100개니까 +90
			System.out.println(day + "일차 " + "?개");
		}

	}
}