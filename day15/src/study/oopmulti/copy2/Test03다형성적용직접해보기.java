package study.oopmulti.copy2;

public class Test03다형성적용직접해보기 {
	public static void main(String[] args) {
		
		int random = 1;
		
		Transportation t;
		
		if(random == 0) {
			t = new Kickboard(); //업캐스팅
		}
		else {
			t = new Train(); //업캐스팅
		}
		
		t.move();
		
	}

}
