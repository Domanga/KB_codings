package javaQue0626_1;

import java.util.Arrays;
import java.util.Scanner;

class alphabet {
	private char[] conts = new char[26];
	private int[] count = new int[26];

	public alphabet() {

	}

	public void Setconts(alphabet s) {
		for (int i = 0; i < conts.length; i++) {
			s.conts[i] = (char) (i + 97);
		}
		this.conts = s.conts;
	}

	public void Setcounts(alphabet s, String word) {
		for (int i = 0; i < conts.length; i++) {
			for (int j = 0; j < word.length(); j++) {
				if (s.conts[i] == word.charAt(j)) {
					s.count[i]++;
				}
			}
		}
		this.count = s.count;
	}

	public void printalpha(alphabet s) {
		for (int i = 0; i < s.conts.length; i++) {
			if (s.count[i] != 0) {
				System.out.println(String.format("%c �� %d �����Դϴ�.", s.conts[i], s.count[i]));
			}
		}
	}

}

public class javaQue0626_1 {

	public static void main(String args[]) {

		String word = "";
		String N;
		int[] alpha = new int[26];
		//Arrays.fill(alpha, -1);		
		Scanner ss = new Scanner(System.in);
		N = ss.nextLine();
		
		
		
		for (int i = 0; i < N.length(); i++) {
			int index = N.charAt(i) - 97;
			alpha[index]++;

		}

		for (int i = 0; i < 26; i++) {
			if (alpha[i] != 0) {
				System.out.println((char)(i+97)+""+alpha[i] + " " + i);
			}
		}
		
//		System.out.print("���ڿ��� �Է��Ͻÿ�. : ");
//		Scanner scan = new Scanner(System.in);
//		word = scan.nextLine();
//
//		// char[] conts = new char[26];
//		// int[] count = new int[26];
//
//		alphabet a = new alphabet();
//
//		a.Setconts(a);
//		a.Setcounts(a, word);
//
//		a.printalpha(a);

		/*
		 * char[] conts = new char[26]; int[] count = new int[26];
		 * 
		 * for (int i = 0; i < conts.length; i++) { conts[i] = (char) (i + 97); }
		 * 
		 * for (int i = 0; i < conts.length; i++) { for (int j = 0; j < word.length();
		 * j++) {
		 * 
		 * if (conts[i] == word.charAt(j)) { count[i]++; } } }
		 * 
		 * for (int i = 0; i < conts.length; i++) { if (count[i] != 0) {
		 * System.out.println(String.format("%c �� %d �����Դϴ�.", conts[i], count[i]));
		 * System.out.println(conts[i] + "�� " + count[i] + " ���� �Դϴ�."); } }
		 */

	}
}
