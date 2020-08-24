package test;

import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String year;
		int YEAR;
		int search;
		Scanner scan = new Scanner(System.in);

		System.out.print("년도를 입력하세요 : ");
		year = scan.nextLine();
		YEAR = Integer.parseInt(year);

		while (YEAR != 0) {

			search = YEAR % 12;

			switch (search) {
			case 0:
				System.out.println(YEAR + "년도는 원숭이 띠 입니다.");
				break;
			case 1:
				System.out.println(YEAR + "년도는 닭 띠 입니다.");
				break;
			case 2:
				System.out.println(YEAR + "년도는 개 띠 입니다.");
				break;
			case 3:
				System.out.println(YEAR + "년도는 돼지 띠 입니다.");
				break;
			case 4:
				System.out.println(YEAR + "년도는 쥐 띠 입니다.");
				break;
			case 5:
				System.out.println(YEAR + "년도는 소 띠 입니다.");
				break;
			case 6:
				System.out.println(YEAR + "년도는 호랑이 띠 입니다.");
				break;
			case 7:
				System.out.println(YEAR + "년도는 토끼 띠 입니다.");
				break;
			case 8:
				System.out.println(YEAR + "년도는 용 띠 입니다.");
				break;
			case 9:
				System.out.println(YEAR + "년도는 뱀 띠 입니다.");
				break;
			case 10:
				System.out.println(YEAR + "년도는 말 띠 입니다.");
				break;
			case 11:
				System.out.println(YEAR + "년도는 양 띠 입니다.");
				break;
			}

			System.out.print("년도를 입력하세요 : ");
			year = scan.nextLine();
			YEAR = Integer.parseInt(year);

		}
	}

}
