package data;

public class Test03영화관 {
	public static void main(String[] args) {
		
		int adult = 12000;
		int teenager = 8500;
		int adultPopulation = 2;
		int teenagerPopulation = 2;
		
		int adultTotal = adult * adultPopulation;
		int teenagerTotal = teenager * teenagerPopulation;
		int total = adultTotal + teenagerTotal;
		
		System.out.println(adultTotal);
		System.out.println(teenagerTotal);
		System.out.println(total);
	}
}
