package javaTest_0630;

import java.util.Scanner;

public class javaTest_0630_4 {

	static int conditional_Sum(int num) {
		
		int sum = 0;
		
		for (int i = 0; i <= num; i++) {
			if (i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println("---------------4�� ����-----------------");

		Scanner s = new Scanner(System.in);

		int number;

		System.out.print("������ �Է��ϼ���. : ");
		number = s.nextInt();

		System.out.println(String.format("1 ~ %d���� 3�� ����� ������ ����  = %d", number, conditional_Sum(number)));
		s.close();
	}

}
