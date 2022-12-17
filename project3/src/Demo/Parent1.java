package Demo;
public class Parent1 {
	public Parent1() {
		this(1,2 ,3);
		System.out.println("Default");
	}
	public Parent1(int a) {
		this(1,2,3,4);
		System.out.println("one ");
	}
	public Parent1(int a, int b) {
		this();
		System.out.println("two");
	}
	public Parent1(int a, int b, int c) {
		this(1);
		System.out.println("three");
	}
	public Parent1(int a, int b, int c, int d) {
		System.out.println("four");
	}
	public static void main(String[] args) {
		Parent1 p=new Parent1(1, 2);
		
		
		
	}

}
