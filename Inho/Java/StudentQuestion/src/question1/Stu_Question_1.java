package question1;

import java.util.ArrayList;
import java.util.Scanner;

class student {

	String name;
	int id;
	String gender;

	public student(String string, int i, String string2) {
		// TODO Auto-generated constructor stub

		name = string;
		id = i;
		gender = string2;
	}

}

public class Stu_Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList<student> myStu= new ArrayList<student>();
		ArrayList<student> myStu = new ArrayList<student>();
		Scanner scan = new Scanner(System.in);

		myStu.add(new student("이동준", 2009038033, "남"));
		myStu.add(new student("정찬성", 2007038011, "남"));
		myStu.add(new student("고한솔", 2015012011, "남"));
		myStu.add(new student("김동현", 2003011023, "남"));

		for (int i = 0; i < myStu.size(); i++) {
			System.out.println(myStu.get(i).name + myStu.get(i).id + myStu.get(i).gender);
		}
		System.out.println(myStu.get(1));

	}

}
