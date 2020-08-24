package javaQue0626_2;

import java.util.Arrays;
import java.util.Scanner;

public class javaQue0626_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "";

		System.out.print("문자열을 입력하시오. : ");
		Scanner scan = new Scanner(System.in);
		word = scan.nextLine();

		char[] conts = new char[26];
		int[] count = new int[26];
		int[] index = new int[26];
		int[] alpha = new int[26];
		
		for (int i = 0; i < conts.length; i++) {
			conts[i] = (char) (i + 97);
		}

		for (int i = 0; i < conts.length; i++) {
			for (int j = 0; j < word.length(); j++) {

				if (conts[i] == word.charAt(j)) {
					index[i] = j;
					count[i]++;
					break;
				}
			}
		}

		for (int i = 0; i < conts.length; i++) {
			if (count[i] != 0) {
				System.out.println(String.format("%2c는 %2d번째에서 처음 등장합니다.", conts[i], (index[i] + 1)));
			}
		}

		System.out.print("문자열을 입력하시오. : ");
		Scanner scan1 = new Scanner(System.in);
		String text = scan1.nextLine();
		Arrays.fill(alpha, -1);
		for(int i=0;i<text.length();i++) {
			int index1 = text.charAt(i) - 97;
			if(alpha[index1] == -1) {
				alpha[index1] = i;
			}
		}

		for(int i=0;i<alpha.length;i++) {
			if(alpha[i] != -1) {
			System.out.println(conts[i] + " " +(alpha[i]+1));
			}
		}
	}

}
