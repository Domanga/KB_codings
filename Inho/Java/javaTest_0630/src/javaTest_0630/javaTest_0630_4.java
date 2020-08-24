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

		System.out.println("---------------4번 문제-----------------");

		Scanner s = new Scanner(System.in);

		int number;

		System.out.print("정수를 입력하세요. : ");
		number = s.nextInt();

		System.out.println(String.format("1 ~ %d까지 3의 배수를 제외한 합은  = %d", number, conditional_Sum(number)));
		s.close();
	}

}
