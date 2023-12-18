package oop.method8;

public class Test {
	int grade;
	int group;
	String name;
	int language;
	int english;
	int math;
	int total;
	double average;

	void data(int grade, int group, String name, int language, int english, int math, int total, double average) {
		this.data(grade, group, name, language, english, math, total, average);
	}

	void information() {
		System.out.println("<학생 성적 정보>");
		System.out.println(this.grade + "학년 " + this.group + "반 " + this.name);
		int total = this.language + this.english + this.math;
		double average = (double) total / 3;
		System.out.println("국어 : " + this.language + "영어 : " + this.english + "수학 : " + this.math);
		System.out.println("총점 : " + total + "평균 : " + average);

		if (this.language < 40 || this.english < 40 || this.math < 40 || this.average < 60) {
			System.out.println("재평가 대상자입니다");
		} else {
			System.out.println("축하드립니다 통과입니다");
		}
		System.out.println();
	}
}