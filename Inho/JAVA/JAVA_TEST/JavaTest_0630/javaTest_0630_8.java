package javaTest_0630;

class Student_1 {
	private String name;
	private int stuNum;
	private String gender;

	Student_1(String name, int num, String gender) {
		this.name = name;
		this.stuNum = num;
		this.gender = gender;
	}

	public void modify_info(String name, int num, String gender) {
		this.name = name;
		this.stuNum = num;
		this.gender = gender;
	}

	public String GetName() {
		return this.name;
	}

	public int GetNum() {
		return this.stuNum;
	}

	public String GetGender() {
		return this.gender;
	}

	public String toString() {
		return "�̸� : " + this.name + ", �й� : " + this.stuNum + ", ���� : " + this.gender;
	}
}

public class javaTest_0630_8 {

	public static void main(String args[]) {
		
		System.out.println("---------------3�� ����-----------------");
		
		Student_1 stu1 = new Student_1("�̵���", 2009038033, "��");
		Student_1 stu2 = new Student_1("������", 2007012034, "��");

		Student_1 arr[] = new Student_1[2];
		arr[0] = stu1;
		arr[1] = stu2;

		System.out.println("---------------���� ��---------------");
		for(Student_1 item : arr) {
			System.out.println(item);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].GetName().equals("�̵���")) {
				arr[i].modify_info("�̵���", 2019038033, "��");
			}
		}
		
		System.out.println("---------------���� ��---------------");
		for(Student_1 item : arr) {
			System.out.println(item);
		}
	}
	
}
