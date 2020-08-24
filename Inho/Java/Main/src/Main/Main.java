package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 1;
		for (int i = 0; i < 3; i++) {
			int a = s.nextInt();
			sum *= a;
		}

		String text = String.valueOf(sum);
		char num[] = new char[10];
		int count[] = new int[10];
		for (int i = 0; i < 10; i++) {
			num[i] = Character.forDigit(i, 10);
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < text.length(); j++) {
				if (text.charAt(j) == num[i]) {
					count[i]++;
				}
			}
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
		

	}

}
