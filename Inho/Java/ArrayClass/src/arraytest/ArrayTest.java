package arraytest;
import java.util.*;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] numberArray = new int[5];
		for(int i=0;i<5;i++) {
			numberArray[i] = i+1;
			System.out.print(numberArray[i]);
		}
		
		ArrayList<String> t = new ArrayList<String>();
		ArrayList<String> i = new ArrayList<String>();
		
		t.add("�ڹ�");
		t.add("Java");
		t.add("Good");
				
		i.add("����");
		i.add("avaJ");
		i.add("dooG");
		
		System.out.println(t.get(0));
		System.out.println(t.size());
		System.out.println(t.contains("java"));
		
		t.remove("�ڹ�");
		t.remove(0); // index���� , �� ���� -> (integer)0
		System.out.println(t.get(0));
		System.out.println(t.size());
	}

}
