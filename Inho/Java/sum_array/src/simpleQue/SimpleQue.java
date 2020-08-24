package simpleQue;

import java.util.Scanner;

class Swap {
	public int x,y;
	
	public static void swap(Swap obj) {
		int temp;
		temp = obj.x;
		obj.x = obj.y;
		obj.y = temp;
	}
}

public class SimpleQue {

	static void print_Sum(int index) {
		int sum = 0;

		for (int i = 1; i <= index; i++) {
			if (i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1���� " + index + "���� 3�� ����� ������ �� ���� : " + sum);
	}

	static void timeCal(int time) {
		int min, sec;

		min = time / 60;
		sec = time % 60;

		System.out.println(time + " �ʴ� " + min + "�� " + sec + "�� �Դϴ�.");
	}

	static void swap(int[] x) {
		int temp;

		temp = x[0];
		x[0] = x[1];
		x[1] = temp;
	}

	public static void main(String[] args) {

		System.out.print("������ ���� ������ �Է��ϼ��� : ");
		Scanner a = new Scanner(System.in);
		int index = a.nextInt();
		print_Sum(index);

		System.out.print("�ʸ� �Է��ϼ��� : ");
		Scanner b = new Scanner(System.in);
		int sec = b.nextInt();
		timeCal(sec);

		int[] arr = new int[2];
		System.out.print("�� ���� �Է��ϼ��� : ");
		Scanner c = new Scanner(System.in);
		arr[0] = c.nextInt();
		Scanner d = new Scanner(System.in);
		arr[1] = d.nextInt();

		System.out.println("�Է¹��� �� �� x = " + arr[0] + "  y = " + arr[1]);
		swap(arr);
		System.out.println("Swap�� �� �� x = " + arr[0] + "  y = " + arr[1]);
		
		Swap test = new Swap();
		test.x = 3;
		test.y = 5;
		System.out.println(test.x + " " + test.y);
		test.swap(test);
		System.out.println(test.x + " " + test.y);
		a.close();
		b.close();
		c.close();
		d.close();
	}

}
