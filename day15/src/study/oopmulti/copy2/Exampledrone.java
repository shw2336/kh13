package study.oopmulti.copy2;

public class Exampledrone implements Electronic, Transportation, Flyable{

	@Override
	public void fly() {
		System.out.println("예제드론이 비행합니다");
	}

	@Override
	public void move() {
		System.out.println("예제드론이 움직입니다");
	}

	@Override
	public void on() {
		System.out.println("예제드론이 전원을 킵니다");
	}

	@Override
	public void off() {
		System.out.println("예제드론이 전원을 끕니다");
	}

}
