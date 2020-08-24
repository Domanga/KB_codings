package max_min;

import java.util.Scanner;

public class get_max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  Using Array
		int[] a = new int[5];
		int[] b = {0,0,0,0,0};
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			a[i] = scan.nextInt();
		}

		int min = a[0];
		int max = a[0];

		for (int i = 0; i < 5; i++) {
			if (min > a[i]) {
				min = a[i];
			}
			if (max < a[i]) {
				max = a[i];
			}
		}

		System.out.println("최대값은 = " + max + ", 최소값은 = " + min);
		*/
		
		Scanner s = new Scanner(System.in);
		
		int max, min;
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		
		for(int i=0;i<5;i++) {
			int compareValue = s.nextInt();
			if(min > compareValue) {
				min = compareValue;
			}
			if(max < compareValue) {
				max = compareValue;
			}
		}
		System.out.println(min + " " + max);
		System.out.println(String.format("%s%dHi", "hello", 5));
	}

}
