package try_Catch;

import java.util.Scanner;

public class try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("���� 2���� �Է��ϼ���. : ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("a / b = " + a/b);
			return;
		}
		catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		finally {
			System.out.println("finally syntax");
			
		}
		System.out.println("���α׷� ����");
	}
}
