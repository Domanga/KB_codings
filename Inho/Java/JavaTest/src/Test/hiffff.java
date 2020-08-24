package Test;

import java.util.Arrays;
import java.util.Scanner;

public class hiffff {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int arr[] = new int[9];
		int index = 0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println(arr[index]);
		System.out.println(index+1);
	}
}
