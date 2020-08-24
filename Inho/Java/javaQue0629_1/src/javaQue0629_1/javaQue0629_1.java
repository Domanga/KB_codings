package javaQue0629_1;

class student {
	private String name;
	private int stuNum;
	private String gender;
	
	public student() {
		this.name = "없음";
		this.stuNum = 0;
		this.gender = "없음";
	}
	
	public student(String name, int num, String gender) {
		this.name = name;
		this.stuNum = num;
		this.gender = gender;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	public void SetNum(int Num) {
		this.stuNum = Num;
	}
	public void Setgender(String gender) {
		this.gender = gender;
	}

	public String GetName() {
		return this.name;
	}
	public int GetNum() {
		return this.stuNum;
	}
	public String Getgender() {
		return this.gender;
	}
	
	public void modified_info(String name, int Num, String gender) {
		this.name = name;
		this.stuNum = Num;
		this.gender = gender;
	}
	
	public String toString() {
		return "이름 : "+ name + ", 학번 : " + stuNum + ", 성별 : " + gender;
	}
}

public class javaQue0629_1 {

	public static void main(String[] args) {
		student[] stu = new student[4];
		
		stu[0] = new student();
		stu[0].SetName("이동준");
		stu[0].SetNum(2009038033);
		stu[0].Setgender("남");
				
		stu[1] = new student();
		stu[1].SetName("이제영");
		stu[1].SetNum(2007012034);
		stu[1].Setgender("여");
		
		stu[2] = new student();
		stu[2].SetName("신동민");
		stu[2].SetNum(2017045011);
		stu[2].Setgender("남");
		
		stu[3] = new student("고한솔", 2013042015, "남");
		
		for(int i=0;i<stu.length;i++) {
			System.out.println(String.format("이름 = %s, 학번 = %d, 성별 : %s",stu[i].GetName(), stu[i].GetNum(), stu[i].Getgender()));
		}
		
		System.out.println("----------------수정-----------------");

		for(int i=0;i<stu.length;i++) {
			if(stu[i].GetName().equals("이동준")) {
				stu[i].modified_info("이동준", 2019038033, "남");
			}
		}
		
		for(int i=0;i<stu.length;i++) {
			System.out.println(String.format("이름 = %s, 학번 = %d, 성별 : %s",stu[i].GetName(), stu[i].GetNum(), stu[i].Getgender()));
		}
		
		System.out.println("--------------For Each--------------");
		
		for(student item: stu){
			System.out.println(String.format("이름 = %s, 학번 = %d, 성별 : %s",item.GetName(), item.GetNum(), item.Getgender()));
		}
		
		System.out.println("-------------toString()-------------");
		
		for(student item: stu){
			System.out.println(item);
		}
	}

}
