package array4;

public class Test03이차원배열초기화 {
	public static void main(String[] args) {
		
		//배열 생성
		int[][] dataset = new int[5/*줄*/][5/*칸*/];
		
		//데이터 초기화 - 값기준
		
		int x = 0 , y = 0;
		for(int i=1; i<=25; i++) {
			dataset[x][y] = i;
			
			y++;//오른쪽으로 이동
			if(y==5) {
				//다음줄 첫번째칸으로 위치를 변경
				y = 0;
				x++;
			}
		}
		//배열 출력
		for(int i=0; i<dataset.length; i++) {
			for(int k=0; k<dataset[i].length; k++) {
				System.out.print(dataset[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		//데이터 초기화 - 위치 기준
//		int number = 1;
//		for(int i=0; i<dataset.length; i++) {//줄
//			for(int k=0; k<dataset[i].length; k++) {//칸
//				dataset[i][k] = number;
//				number++;
//			}
//		}

	}
}