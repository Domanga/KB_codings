package javaTest_0630;

import java.util.Scanner;

public class javaTest_0630_7 {

	public static void main(String[] args) {

		System.out.println("---------------2�� ����-----------------");
		
		Scanner s = new Scanner(System.in);

		System.out.print("������ �¾ �⵵�� �Է��ϼ���.: ");
		int year = s.nextInt();

		switch (year % 12) {
		case 0:
			System.out.println("�����̶� �Դϴ�.");
			break;
		case 1:
			System.out.println("�߶� �Դϴ�.");
			break;
		case 2:
			System.out.println("���� �Դϴ�.");
			break;
		case 3:
			System.out.println("������ �Դϴ�.");
			break;
		case 4:
			System.out.println("��� �Դϴ�.");
			break;
		case 5:
			System.out.println("�Ҷ� �Դϴ�.");
			break;
		case 6:
			System.out.println("ȣ���̶� �Դϴ�.");
			break;
		case 7:
			System.out.println("�䳢�� �Դϴ�.");
			break;
		case 8:
			System.out.println("��� �Դϴ�.");
			break;
		case 9:
			System.out.println("��� �Դϴ�.");
			break;
		case 10:
			System.out.println("���� �Դϴ�.");
			break;
		case 11:
			System.out.println("��� �Դϴ�.");
			break;
		default:
			System.out.println("����� �Է��Ѱ� �³�?");
			break;

		}
		s.close();
	}

}
