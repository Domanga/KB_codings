package exception_and_bean;

public class Customer {
	private String name;
	private int age;
	private int grade;
	private String number;
	
//	public Customer(String name, int age, int grade, String number) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.grade = grade;
//		this.number = number;
//	}
	
	public Customer() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
}
