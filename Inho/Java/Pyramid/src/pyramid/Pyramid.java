package pyramid;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner s = new Scanner(System.in);

		try {

			size = s.nextInt();

			for (int i = 0; i < size; i++) {
				for (int j = size - i; j > 0; j--) {
					System.out.print(" ");
				}
				for (int k = size - i; k <= size + i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("잘못 입력했다. 확인해라.");
		}

	}

}
