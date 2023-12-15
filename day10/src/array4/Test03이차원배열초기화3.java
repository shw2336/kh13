package array4;

public class Test03이차원배열초기화3 {
	public static void main(String[] args) {

//		5x5 배열을 만들고 숫자를 다음과 같이 지그재그로 배치하고 출력하세요
//
//		1    2    3    4    5
//		10    9    8    7    6
//		11    12    13    14    15
//		20    19    18    17    16
//		21    22    23    24    25
		int[][] dataset = new int[5][5];

		int number = 1;
		for (int i = 0; i < dataset.length; i++) {
			for (int k = 0; k < dataset[i].length; k++) {
				dataset[i][k] = number;
				number++;
			}
			if(i == 1 || i ==3) {
				for (int j = 0; j < dataset.length; j++) {
					for (int m = 0; m < dataset[m].length; m++) {
						int backup = dataset[m][j + 1];
						dataset[m][j + 1] = dataset[m][j];
						dataset[m][j] = backup;
					}
				}
			}
		}
		

	
		for (int i = 0; i < dataset.length; i++) {
			for (int k = 0; k < dataset[i].length; k++) {
				System.out.print(dataset[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}

//		//배열 생성
//		int[][] dataset = new int[5/*줄*/][5/*칸*/];
//		
//		//데이터 초기화 - 위치 기준
//		int number = 1;
//		for(int i=0; i<dataset.length; i++) {//줄
//			for(int k=0; k<dataset[i].length; k++) {//칸
//				dataset[i][k] = number;
//				number++;
//			}
//		}
//
//		//배열 출력
//		for(int i=0; i<dataset.length; i++) {
//			for(int k=0; k<dataset[i].length; k++) {
//				System.out.print(dataset[i][k]);
//				System.out.print("\t");
//			}
//			System.out.println();
//		}
	}
}