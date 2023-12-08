package condition2;

public class Test02지하철요금4 {
	public static void main(String[] args) {
		
		int age = 25;
		
		if(age >= 65 || age < 8) { //어르신 또는 영유아
			System.out.println("요금 : 0원");	
		}
		else if(age >= 20) {
			System.out.println("요금 : 1400원");
		}
		else if(age >= 14) {
			System.out.println("요금 : 800원");
		}
		else {
			System.out.println("요금 : 500원");
		}
	}
}