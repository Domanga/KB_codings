package javaTest_0630;

import java.util.Scanner;

public class javaTest_0630_7 {

	public static void main(String[] args) {

		System.out.println("---------------2번 문제-----------------");
		
		Scanner s = new Scanner(System.in);

		System.out.print("본인이 태어난 년도를 입력하세요.: ");
		int year = s.nextInt();

		switch (year % 12) {
		case 0:
			System.out.println("원숭이띠 입니다.");
			break;
		case 1:
			System.out.println("닭띠 입니다.");
			break;
		case 2:
			System.out.println("개띠 입니다.");
			break;
		case 3:
			System.out.println("돼지띠 입니다.");
			break;
		case 4:
			System.out.println("쥐띠 입니다.");
			break;
		case 5:
			System.out.println("소띠 입니다.");
			break;
		case 6:
			System.out.println("호랑이띠 입니다.");
			break;
		case 7:
			System.out.println("토끼띠 입니다.");
			break;
		case 8:
			System.out.println("용띠 입니다.");
			break;
		case 9:
			System.out.println("뱀띠 입니다.");
			break;
		case 10:
			System.out.println("말띠 입니다.");
			break;
		case 11:
			System.out.println("양띠 입니다.");
			break;
		default:
			System.out.println("제대로 입력한거 맞냐?");
			break;

		}
		s.close();
	}

}
