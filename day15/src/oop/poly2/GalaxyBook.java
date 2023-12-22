package oop.poly2;

public class GalaxyBook extends Notebook {

	@Override
	public void power() {
		System.out.println("갤럭시북으로 전원을 킵니다");
		
	}

	@Override
	public void video() {
		System.out.println("갤럭시북으로 동영상을 재생합니다");
		
	}

	@Override
	public void typing() {
		System.out.println("갤럭시북으로 타이핑을 시작합니다");
		
	}

}
