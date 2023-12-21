package oop.inherit6;

public class Hwp파일 extends File {
	public Hwp파일(String name, int size) {
		super(name, size);

	}
	public void pagesize() {
		System.out.println("페이지 수");
	}
	public void preview() {
		System.out.println("미리보기");
	}


}
