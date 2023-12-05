package data;

public class Test07주차장 {
	public static void main(String[] agrs) {
		
		int pricePerTenMinutes = 1500;
		int lefthour = 17;
		int comehour = 11;
		int leftminute = 25;
		int comeminute = 50;
		
		int cometotal = comehour*60 + comeminute;
		int lefttotal = lefthour*60 + leftminute;
		
		int totalTime = lefttotal - cometotal;
		//System.out.println(totalTime);
		int total = totalTime / 10 * pricePerTenMinutes;
		//System.out.println(total);
		System.out.println(total);
	}
}
