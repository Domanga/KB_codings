package javaTest_0630;

public class javaTest_0630_2 {

	public static void main(String[] args) {

		System.out.println("---------------2¹ø ¹®Á¦-----------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 5 - (i + 1); j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 5 - i; j <= 5 + i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
