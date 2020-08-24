package overidingtest;

class Cake {
	
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheezeCake extends Cake {
	
	public void yummy() {
		super.yummy();
		System.out.println("Yummy Cheeze Cake");
	}
}

class ChocolateCake extends CheezeCake {
	
	public void yummy() {
		super.yummy();
		System.out.println("Yummy Chocolate Cake");
	}
}
public class overridingtest {
	public static void main(String args[]) {
		Cake c1 = new Cake();
		Cake c2 = new CheezeCake();
		Cake c3 = new ChocolateCake();
		
		CheezeCake c4 = new ChocolateCake();
		ChocolateCake c5 = new ChocolateCake();
		
		c1.yummy();
		System.out.println();
		c2.yummy();
		System.out.println();
		c3.yummy();
		System.out.println();
		c4.yummy();
		System.out.println();
		c5.yummy();
		System.out.println();
		
		int array[] = new int[20];
		for(int i=0;i<20;i++) {
			array[i] = i*i;
		}
		for(int item : array) {
			System.out.println(item);
		}
	}
}
