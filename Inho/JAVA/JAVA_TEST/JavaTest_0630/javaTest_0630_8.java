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
		return "이름 : " + this.name + ", 학번 : " + this.stuNum + ", 성별 : " + this.gender;
	}
}

public class javaTest_0630_8 {

	public static void main(String args[]) {
		
		System.out.println("---------------3번 문제-----------------");
		
		Student_1 stu1 = new Student_1("이동준", 2009038033, "남");
		Student_1 stu2 = new Student_1("이제영", 2007012034, "여");

		Student_1 arr[] = new Student_1[2];
		arr[0] = stu1;
		arr[1] = stu2;

		System.out.println("---------------변경 전---------------");
		for(Student_1 item : arr) {
			System.out.println(item);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].GetName().equals("이동준")) {
				arr[i].modify_info("이동준", 2019038033, "남");
			}
		}
		
		System.out.println("---------------변경 후---------------");
		for(Student_1 item : arr) {
			System.out.println(item);
		}
	}
	
}
