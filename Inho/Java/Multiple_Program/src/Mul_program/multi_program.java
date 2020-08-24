package Mul_program;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class multi_program {

	static void gugu() {
		
		for (int i = 2; i < 10; i++) {
			System.out.print(i + " 단 ->");
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
		System.out.println("현재 시간은 : " + time1);
	}

	static void Conway(int size) {
		
		String start = "1";

		for (int i = 0; i < size; i++) {

			String end = "";
			int count = 0;
			char number = start.charAt(0);
			System.out.println((i + 1) + "번째 행 : " + start);

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

		System.out.print("사용자명을 입력하세요 : ");
		String name = s.nextLine();
		System.out.println(String.format("반갑습니다. %s 님", name));
		
		while (true) {
			System.out.print("메뉴를 입력하세요 : ");
			String menu = s.nextLine();

			switch (menu) {
			case "구구단":
				gugu();
				break;
			case "현재시간":
				nowTimeprint();
				break;
			case "수열":
				System.out.print("몇 행을 출력하겠습니까? : ");
				Scanner s_size = new Scanner(System.in);
				int size = s_size.nextInt();
				Conway(size);
				break;
			case "종료":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("입력을 다시 확인하세요.");
				break;
			}
		}
		
	}
}
