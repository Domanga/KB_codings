package test;

import java.util.Scanner;

public class question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String months;
		int Months;
		Scanner scan = new Scanner(System.in);

		System.out.print("몇 월 인가요?");
		months = scan.nextLine();
		Months = Integer.parseInt(months);

		while (Months != 0 && Months < 13) {

			if (Months > 2 && Months < 6) {
				System.out.println(Months + "월은 봄 입니다.");
			} else if (Months > 5 && Months < 9) {
				System.out.println(Months + "월은 여름 입니다.");
			} else if (Months > 8 && Months < 12) {
				System.out.println(Months + "월은 가을 입니다.");
			} else if (Months > 11 || Months < 3) {
				System.out.println(Months + "월은 겨울 입니다.");
			} 
			System.out.print("몇 월 인가요?");
			months = scan.nextLine();
			Months = Integer.parseInt(months);
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
