package javaQue0626_3;

import java.util.Scanner;

public class javaQue0626_3 {

	private String name;

	public void Setname(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		String code = "";
		String ans = "";

		Scanner scan = new Scanner(System.in);

		System.out.print("문자열을 입력하시오. : ");
		code = scan.nextLine();

		code = code.toLowerCase();

		int i = 0;
		char ch = code.charAt(i);

		while (i < code.length()) {
			ch = code.charAt(i++);
			switch (ch) {
			case 'a':
				ans += 'ㄱ';
				break;
			case 'b':
				ans += 'ㄴ';
				break;
			case 'c':
				ans += 'ㄷ';
				break;
			case 'd':
				ans += 'ㄹ';
				break;
			case 'e':
				ans += 'ㅁ';
				break;
			case 'f':
				ans += 'ㅂ';
				break;
			case 'g':
				ans += 'ㅅ';
				break;
			case 'h':
				ans += 'ㅇ';
				break;
			case 'i':
				ans += 'ㅈ';
				break;
			case 'j':
				ans += 'ㅊ';
				break;
			case 'k':
				ans += 'ㅋ';
				break;
			case 'l':
				ans += 'ㅌ';
				break;
			case 'm':
				ans += 'ㅍ';
				break;
			case 'n':
				ans += 'ㅎ';
				break;
			case 'o':
				ans += 'ㅏ';
				break;
			case 'p':
				ans += 'ㅑ';
				break;
			case 'q':
				ans += 'ㅓ';
				break;
			case 'r':
				ans += 'ㅕ';
				break;
			case 's':
				ans += 'ㅗ';
				break;
			case 't':
				ans += 'ㅛ';
				break;
			case 'u':
				ans += 'ㅜ';
				break;
			case 'v':
				ans += 'ㅠ';
				break;
			case 'w':
				ans += 'ㅡ';
				break;
			case 'x':
				ans += 'ㅣ';
				break;
			}
		}
		System.out.println(ans);

		System.out.print("문자열을 입력하세요 : ");
		Scanner Scan1 = new Scanner(System.in);
		String text1 = Scan1.nextLine();
		char test[] = new char[] 
				{ 'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅇ', 
				  'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ', 'ㅏ', 'ㅑ', 
				  'ㅓ', 'ㅕ', 'ㅗ', 'ㅛ', 'ㅜ', 'ㅠ', 'ㅡ', 'ㅣ' };
		
		for(i=0;i<text1.length();i++) {
			System.out.print(test[text1.charAt(i) - 97]);
		}
		
	}

}
