package test;

import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String year;
		int YEAR;
		int search;
		Scanner scan = new Scanner(System.in);

		System.out.print("�⵵�� �Է��ϼ��� : ");
		year = scan.nextLine();
		YEAR = Integer.parseInt(year);

		while (YEAR != 0) {

			search = YEAR % 12;

			switch (search) {
			case 0:
				System.out.println(YEAR + "�⵵�� ������ �� �Դϴ�.");
				break;
			case 1:
				System.out.println(YEAR + "�⵵�� �� �� �Դϴ�.");
				break;
			case 2:
				System.out.println(YEAR + "�⵵�� �� �� �Դϴ�.");
				break;
			case 3:
				System.out.println(YEAR + "�⵵�� ���� �� �Դϴ�.");
				break;
			case 4:
				System.out.println(YEAR + "�⵵�� �� �� �Դϴ�.");
				break;
			case 5:
				System.out.println(YEAR + "�⵵�� �� �� �Դϴ�.");
				break;
			case 6:
				System.out.println(YEAR + "�⵵�� ȣ���� �� �Դϴ�.");
				break;
			case 7:
				System.out.println(YEAR + "�⵵�� �䳢 �� �Դϴ�.");
				break;
			case 8:
				System.out.println(YEAR + "�⵵�� �� �� �Դϴ�.");
				break;
			case 9:
				System.out.println(YEAR + "�⵵�� �� �� �Դϴ�.");
				break;
			case 10:
				System.out.println(YEAR + "�⵵�� �� �� �Դϴ�.");
				break;
			case 11:
				System.out.println(YEAR + "�⵵�� �� �� �Դϴ�.");
				break;
			}

			System.out.print("�⵵�� �Է��ϼ��� : ");
			year = scan.nextLine();
			YEAR = Integer.parseInt(year);

		}
	}

}
