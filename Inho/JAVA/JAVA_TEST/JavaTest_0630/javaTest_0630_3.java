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
		return "�̸� : " + this.name + ", �й� : " + this.stuNum + ", ���� : " + this.gender;
	}
}

public class javaTest_0630_3 {

	public static void main(String args[]) {

		System.out.println("---------------3�� ����-----------------");

		Student stu = new Student("�̵���", 2009038033, "��");

		System.out.println(stu.GetInfo());
	}
}
