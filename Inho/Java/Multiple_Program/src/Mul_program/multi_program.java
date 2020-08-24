package Mul_program;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class multi_program {

	static void gugu() {
		
		for (int i = 2; i < 10; i++) {
			System.out.print(i + " �� ->");
			for (int j = 1; j < 10; j++) {
				System.out.print(String.format("%3d *%2d =%3d", i, j, i * j));
			}
			System.out.println();
		}
	}

	static void nowTimeprint() {
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		Date time = new Date();
		String time1 = format1.format(time);
		System.out.println("���� �ð��� : " + time1);
	}

	static void Conway(int size) {
		
		String start = "1";

		for (int i = 0; i < size; i++) {

			String end = "";
			int count = 0;
			char number = start.charAt(0);
			System.out.println((i + 1) + "��° �� : " + start);

			for (int j = 0; j < start.length(); j++) {

				if (number != start.charAt(j)) {
					end = end + number + count;
					number = start.charAt(j);
					count = 1;
				} else {
					count++;
				}
			}
			end = end + number + count;
			start = end;
		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.print("����ڸ��� �Է��ϼ��� : ");
		String name = s.nextLine();
		System.out.println(String.format("�ݰ����ϴ�. %s ��", name));
		
		while (true) {
			System.out.print("�޴��� �Է��ϼ��� : ");
			String menu = s.nextLine();

			switch (menu) {
			case "������":
				gugu();
				break;
			case "����ð�":
				nowTimeprint();
				break;
			case "����":
				System.out.print("�� ���� ����ϰڽ��ϱ�? : ");
				Scanner s_size = new Scanner(System.in);
				int size = s_size.nextInt();
				Conway(size);
				break;
			case "����":
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
			default:
				System.out.println("�Է��� �ٽ� Ȯ���ϼ���.");
				break;
			}
		}
		
	}
}
