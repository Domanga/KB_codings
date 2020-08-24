package javaTest_0630;

public class javaTest_0630_1 {

	public static void main(String[] args) {
		
		System.out.println("---------------1¹ø ¹®Á¦-----------------");
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(String.format("%d * %d = %d", i, j, i * j));
			}
		}
	}
}