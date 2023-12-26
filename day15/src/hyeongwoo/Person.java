package hyeongwoo;

public class Person {

	private String name;
	private int age;
	private String job;

	public Person() {
		this.job = "무직";
	}

	public Person(String name, int age, String job) {
		setName(name);
		setAge(age);
		setJob(job);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.equals("")) {
		    return;
		}
			this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 1) {
			this.age = age;
		} else
			return;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getTest() {

		if (age <= 7) {
			return "유아";
		} else if (age <= 13) {
			return "어린이";
		} else if (age <= 19) {
			return "청소년";
		} else {
			return "성인";
		}
	}
}
