package oop.inherit6;

public class Test01파일생성 {
	public static void main(String[] args) {
		Mp4 f1 = new Mp4("객체지향.mp4", 3021243L);
		f1.setSpeed(1.2f);
		f1.forward();//MediaFile
		f1.rewind();//MediaFile
		f1.execute();//File
		f1.information();//File

		Mp3 f2 = new Mp3("강의녹음.mp3", 12002020L, 180);
		f2.forward();
		f2.rewind();
		f2.execute();
		f2.information();
	}
}