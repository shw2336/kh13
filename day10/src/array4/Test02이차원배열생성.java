package array4;

public class Test02이차원배열생성 {
	public static void main(String[] args) {
		
		double[][] height = new double[][] { {180.3, 165.2, 177.9, 158.2 }, 
			{168.5, 155.3, 172.1, 169.7 }, {158.5, 170.2, 182.5, 175.8 } };
		for(int k=0; k < height.length; k++) {
			for(int i=0; i < height[k].length; i++) {
				System.out.println(height[k][i]);
			}
		}
	}
}