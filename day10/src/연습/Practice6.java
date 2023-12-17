package  연습;

public class Practice6 {
	public static void main(String[] args) {

		//배열 준비
		int[][] map = new int[5][5];

		//데이터 초기화 - 위치 기준
		int number = 1;
		for(int i=0; i < map.length; i++) {
			for(int k=0; k < map[i].length; k++) {
				if(i % 2 == 0) {//짝수 위치일 때(정방향)
					map[i][k] = number++;
				}
				else {//홀수 위치일 때(역방향)
					//map[i][4-k] = number++;
					map[i][map[i].length - 1 - k] = number++;
				}
			}
		}

		//배열 출력
		for(int i=0; i < map.length; i++) {
			for(int k=0; k < map[i].length; k++) {
				System.out.print(map[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}