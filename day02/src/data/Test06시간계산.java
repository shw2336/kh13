package data;

import javax.print.attribute.SetOfIntegerSyntax;

public class Test06시간계산 {
	public static void main(String[] args) {
		
		int yesterdayHour = 2 , yesterdayMinute = 45;
		int todayHour = 3 , todayMinute = 35;
				
		int yesterdayTotal = yesterdayHour*60 + yesterdayMinute;
		int todayTotal = todayHour*60 + todayMinute;
		
		int total = yesterdayTotal+todayTotal;
		//System.out.println(total);
		
		int hour = total / 60;
		int minute = total % 60;
		
		System.out.println(hour);
		System.out.println(minute);
		
	}

}
