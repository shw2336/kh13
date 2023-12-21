package oop.inherit6;

public class Ppt파일 extends File {
	public Ppt파일(String name, int size) {
		super(name, size);

	}
	public void pagesize() {
		System.out.println("페이지 수");
	}
	public void slideShow() {
		System.out.println("슬라이드쇼");
	}


}
