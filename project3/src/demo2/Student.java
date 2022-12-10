package demo2;

public class Student {
	int roll_no=1256;
	int age=12;
	public void display1() {
		System.out.println("Welcome to all of you ");
	}
	public void display2() {
		System.out.println("Automation is very easy");
		
	}

	public static void main(String[] args) {
		Student stu=new Student();
		stu.display1();
		stu.display2();
		System.out.println(stu.roll_no);
		System.out.println(stu.age);
		

	}

}
