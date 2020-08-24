package javaTest_0630;

class Student {
	private String name;
	private int stuNum;
	private String gender;

	public Student(String name, int num, String gender) {
		this.name = name;
		this.stuNum = num;
		this.gender = gender;
	}

	public String GetInfo() {
		return "이름 : " + this.name + ", 학번 : " + this.stuNum + ", 성별 : " + this.gender;
	}
}

public class javaTest_0630_3 {

	public static void main(String args[]) {

		System.out.println("---------------3번 문제-----------------");

		Student stu = new Student("이동준", 2009038033, "남");

		System.out.println(stu.GetInfo());
	}
}
