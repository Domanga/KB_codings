package javaTest_0630;

import java.util.Arrays;
import java.util.Scanner;

public class javaTest_0630_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------------5�� ����-----------------");
		
		char alpha[] = new char[26];
		int count[] = new int[26];
		Arrays.fill(count, 0);
		
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = (char) (i + 97);
		}

		Scanner s = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���.: ");
		String word = s.nextLine();

		for (int i = 0; i < alpha.length; i++) {
			for (int j = 0; j < word.length(); j++) {
				if (alpha[i] == word.charAt(j)) {
					count[i]++;
				}
			}
		}

		for (int i = 0; i < alpha.length; i++) {
			if (count[i] != 0) {
				System.out.println(String.format("'%c'�� %d���� �Դϴ�.", alpha[i], count[i]));
			}
		}
		s.close();
	}

}
