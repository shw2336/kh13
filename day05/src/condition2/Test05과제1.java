package condition2;

public class Test05과제1 {
	public static void main(String[] args) {
		
		int moment = 10;
		int second = 60;
		int hour = second * second;
		int day = hour * hour * 12;

		
		int time = 500;
		
		int minute = time / 60;
				
		if( time < 10 ) {
			System.out.println(방금 전);
		}
		else if (10 <= time < 60) {
			System.out.println("time초 전");
		}
		else if (10 <= time < 60) {
			System.out.println("time초 전");
		}
		else if (60 <= time < 3600) {
			System.out.println("?분전");
		}
		else if (3600 <= time < 하루) {
			System.out.println("?시간전");
		}
		else {
			System.out.println("?일전");
		}
		
	}

}
