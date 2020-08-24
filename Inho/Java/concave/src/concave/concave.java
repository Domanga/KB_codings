package concave;

import java.util.Scanner;

class location {
	private int posx;
	private int posy;

	location() {

	}

	void setPos(int x, int y) {
		posx = x;
		posy = y;
	}

	int getPosX() {
		return posx;
	}

	int getPosY() {
		return posy;
	}
}

public class concave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		location[] a = new location[10];
		int z[] = new int[10];
		int c[] = new int[10];
		for (int i = 0; i < 10; i++) {

			z[i] = s.nextInt();
			c[i] = s.nextInt();
			a[i].setPos(z[i], c[i]);
		}
		while (true) {

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (i == 0 && j == 0) {
						System.out.print("¦£");
					} else if (i == a[i].getPosX() && j == a[i].getPosY()) {
						System.out.print("¡Ü");
					} else if (i == 0 && j == 9) {
						System.out.print("¦¤");
					} else if (i == 9 && j == 0) {
						System.out.print("¦¦");
					} else if (i == 9 && j == 9) {
						System.out.print("¦¥");
					} else if (j == 0) {
						System.out.print("¦§");
					} else if (j == 9) {
						System.out.print("¦©");
					} else if (i == 0) {
						System.out.print("¦¨");
					} else if (i == 9) {
						System.out.print("¦ª");
					} else {
						System.out.print("¦«");
					}
				}
				System.out.println();
			}
		}
	}

}
