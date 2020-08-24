package javaTest_0630;

import java.util.Scanner;

public class javaTest_0630_5 {

	public static void main(String[] args) {

		System.out.println("---------------5번 문제-----------------");
		
		Scanner s = new Scanner(System.in);
		int months = 1;

		while (months < 13 && months != 0) {

			System.out.print("현재 몇 월입니까? : ");
			months = s.nextInt();

			switch (months) {
			case 3:
			case 4:
			case 5:
				System.out.println("봄 입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름 입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("가을 입니다.");
				break;
			case 1:
			case 2:
			case 12:
				System.out.println("겨울 입니다.");
				break;
			default:
				System.out.println("다시 확인하세요. 프로그램을 종료합니다.");
				break;
			}
		}
		s.close();
	}
}
