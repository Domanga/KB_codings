package test;

import java.util.Scanner;

public class question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String months;
		int Months;
		Scanner scan = new Scanner(System.in);

		System.out.print("�� �� �ΰ���?");
		months = scan.nextLine();
		Months = Integer.parseInt(months);

		while (Months != 0 && Months < 13) {

			if (Months > 2 && Months < 6) {
				System.out.println(Months + "���� �� �Դϴ�.");
			} else if (Months > 5 && Months < 9) {
				System.out.println(Months + "���� ���� �Դϴ�.");
			} else if (Months > 8 && Months < 12) {
				System.out.println(Months + "���� ���� �Դϴ�.");
			} else if (Months > 11 || Months < 3) {
				System.out.println(Months + "���� �ܿ� �Դϴ�.");
			} 
			System.out.print("�� �� �ΰ���?");
			months = scan.nextLine();
			Months = Integer.parseInt(months);
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

}
