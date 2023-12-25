package study.oopmulti.copy2;

public class Test01다중상속문제 {
	public static void main(String[] args) {
		//생성 가능한 모든 객체의 기능 테스트
		Drone a = new Drone();
		a.on();
		a.fly();
		a.move();
		a.off();

		Airplane b = new Airplane();
		b.fly();
		b.move();
		b.reservation();

		Train c = new Train();
		c.move();
		c.reservation();

		Bus d = new Bus();
		d.move();

		Kickboard e = new Kickboard();
		e.on();
		e.move();
		e.off();
		
		Exampleairplane f = new Exampleairplane();
		f.fly();
		f.move();
		f.reservation();
		
		Exampledrone g = new Exampledrone();
		g.on();
		g.fly();
		g.move();
		g.off();
		
	}
}