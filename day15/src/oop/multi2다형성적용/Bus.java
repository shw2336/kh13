package oop.multi2다형성적용;

public class Bus implements Transportation {
	@Override
	public void move() {
		System.out.println("버스가 이동합니다");
	}
}