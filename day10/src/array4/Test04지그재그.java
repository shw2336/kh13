package array4;

public class Test04지그재그 {
	public static void main(String[] args) {

		//배열 준비
		int[][] map = new int[5][5];

		//데이터 초기화

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
