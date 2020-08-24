package javaTest_0630;

import java.util.Scanner;

public class javaTest_0630_9 {

	public static void main(String[] args) {

		System.out.println("---------------4번 문제-----------------");
		
		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력하세요.: ");
		String word = s.nextLine();

		char[] puzzle = { 'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 
				          'ㅂ', 'ㅅ', 'ㅇ', 'ㅈ', 'ㅊ', 
				          'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ', 'ㅏ', 
				          'ㅑ', 'ㅓ', 'ㅕ', 'ㅗ', 'ㅛ', 
				          'ㅜ', 'ㅠ', 'ㅡ', 'ㅣ' };
		
		word = word.toLowerCase();
		
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'y' || word.charAt(i) == 'z') {
				continue;
			}
			System.out.print(puzzle[word.charAt(i) - 97]);
		}
		s.close();
	}
	
}
