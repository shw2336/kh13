package oop.inherit6_1내꺼;

public class Mp3파일 extends File {
	public Mp3파일(String name, int size) {
		super(name, size);

	}
	public void duration() {
		System.out.println("재생 시간");
	}
	public void forward() {
		System.out.println("빨리감기");
	}

	public void rewind() {
		System.out.println("되감기");
	}


}
