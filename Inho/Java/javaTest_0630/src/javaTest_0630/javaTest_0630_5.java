package javaTest_0630;

import java.util.Scanner;

public class javaTest_0630_5 {

	public static void main(String[] args) {

		System.out.println("---------------5�� ����-----------------");
		
		Scanner s = new Scanner(System.in);
		int months = 1;

		while (months < 13 && months != 0) {

			System.out.print("���� �� ���Դϱ�? : ");
			months = s.nextInt();

			switch (months) {
			case 3:
			case 4:
			case 5:
				System.out.println("�� �Դϴ�.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("���� �Դϴ�.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("���� �Դϴ�.");
				break;
			case 1:
			case 2:
			case 12:
				System.out.println("�ܿ� �Դϴ�.");
				break;
			default:
				System.out.println("�ٽ� Ȯ���ϼ���. ���α׷��� �����մϴ�.");
				break;
			}
		}
		s.close();
	}
}
