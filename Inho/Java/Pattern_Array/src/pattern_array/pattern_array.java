package pattern_array;

import java.util.Scanner;

public class pattern_array {

	public static void main(String[] args) {
		/*
		 * String defaultnum = "1"; String nextnum = ""; String nownum = ""; int
		 * outputline = 20; int no = 1;
		 * 
		 * System.out.println(defaultnum);
		 * 
		 * for (int i = 0; i < outputline; i++) { nextnum = ""; nownum = "";
		 * 
		 * for (int j = 0; j < defaultnum.length(); j++) { nownum =
		 * defaultnum.substring(j, j + 1); if (j + 1 < defaultnum.length() &&
		 * nownum.equals(defaultnum.substring(j + 1, j + 2))) { while (j + 1 <
		 * defaultnum.length() && nownum.equals(defaultnum.substring(j + 1, j + 2))) {
		 * j++; no++; } nextnum = nextnum + nownum + no; } else nextnum = nextnum +
		 * nownum + "1"; no = 1; } defaultnum = nextnum; System.out.println(nextnum); }
		 */

		String start = "1";
		Scanner s = new Scanner(System.in);
		int nth = s.nextInt();
		s.close();
		for (int i = 0; i < nth; i++) {
			System.out.println((i + 1) + "��° : " + start);
			String end = ""; 									// ����
			char number = start.charAt(0); 						// ������ ã�ƾ� �ϴ� ����
			int count = 0;
			for (int j = 0; j < start.length(); j++) {
				if (number != start.charAt(j)) {
					end = end + number + count;
					number = start.charAt(j);
					count = 1;
				} else {
					count++;
				}
			}
			end = end + number + count;
			start = end;
		}
	}
}
