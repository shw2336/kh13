package data;

public class Test07주차장 {
	public static void main(String[] agrs) {
		
		int lefthour = 17;
		int comehour = 11;
		int leftminute = 25;
		int comeminute = 50;
		
		int pricePeriod = 10;
		int pricePerTime = 1500;
		//조하조하
		
		int cometotal = comehour*60 + comeminute;
		int lefttotal = lefthour*60 + leftminute;
		
		int totalTime = lefttotal - cometotal;
		//System.out.println(totalTime);
		int total = totalTime / pricePeriod * pricePerTime;
		//System.out.println(total);
		System.out.println(total);
	}
}
