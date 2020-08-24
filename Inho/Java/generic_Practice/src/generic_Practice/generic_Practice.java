package generic_Practice;



class Apple {
	public String toString() {
		return "I am an apple. ";
	}
}

class Orange {
	public String toString() {
		return "I am an orange.";
	}
}

class Box <T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class generic_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		System.out.println(aBox.get());
		System.out.println(oBox.get());
	}

}
