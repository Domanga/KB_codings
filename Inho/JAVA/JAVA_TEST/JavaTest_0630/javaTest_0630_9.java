package javaTest_0630;

import java.util.Scanner;

public class javaTest_0630_9 {

	public static void main(String[] args) {

		System.out.println("---------------4�� ����-----------------");
		
		Scanner s = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���.: ");
		String word = s.nextLine();

		char[] puzzle = { '��', '��', '��', '��', '��', 
				          '��', '��', '��', '��', '��', 
				          '��', '��', '��', '��', '��', 
				          '��', '��', '��', '��', '��', 
				          '��', '��', '��', '��' };
		
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
