package array4;

public class Test03이차원배열초기화신의풀이 {
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