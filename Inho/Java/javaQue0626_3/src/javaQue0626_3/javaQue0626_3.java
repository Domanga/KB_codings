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

		System.out.print("���ڿ��� �Է��Ͻÿ�. : ");
		code = scan.nextLine();

		code = code.toLowerCase();

		int i = 0;
		char ch = code.charAt(i);

		while (i < code.length()) {
			ch = code.charAt(i++);
			switch (ch) {
			case 'a':
				ans += '��';
				break;
			case 'b':
				ans += '��';
				break;
			case 'c':
				ans += '��';
				break;
			case 'd':
				ans += '��';
				break;
			case 'e':
				ans += '��';
				break;
			case 'f':
				ans += '��';
				break;
			case 'g':
				ans += '��';
				break;
			case 'h':
				ans += '��';
				break;
			case 'i':
				ans += '��';
				break;
			case 'j':
				ans += '��';
				break;
			case 'k':
				ans += '��';
				break;
			case 'l':
				ans += '��';
				break;
			case 'm':
				ans += '��';
				break;
			case 'n':
				ans += '��';
				break;
			case 'o':
				ans += '��';
				break;
			case 'p':
				ans += '��';
				break;
			case 'q':
				ans += '��';
				break;
			case 'r':
				ans += '��';
				break;
			case 's':
				ans += '��';
				break;
			case 't':
				ans += '��';
				break;
			case 'u':
				ans += '��';
				break;
			case 'v':
				ans += '��';
				break;
			case 'w':
				ans += '��';
				break;
			case 'x':
				ans += '��';
				break;
			}
		}
		System.out.println(ans);

		System.out.print("���ڿ��� �Է��ϼ��� : ");
		Scanner Scan1 = new Scanner(System.in);
		String text1 = Scan1.nextLine();
		char test[] = new char[] 
				{ '��', '��', '��', '��', '��', '��', '��', '��', 
				  '��', '��', '��', '��', '��', '��', '��', '��', 
				  '��', '��', '��', '��', '��', '��', '��', '��' };
		
		for(i=0;i<text1.length();i++) {
			System.out.print(test[text1.charAt(i) - 97]);
		}
		
	}

}
