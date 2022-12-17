package Demo;

public class Parent {
	public Parent() {
		System.out.println("Default parent constructor");
		}
	public Parent(int a) {
		this(1, 2);
		System.out.println("Parent One parameterised constructor");
		}
	public Parent(int a, int b) {
		this(1,2 ,3,4);
	    System.out.println("Parent two parameterised constructor");
		}
	public Parent(int a, int b, int c) {
		
		System.out.println("Parent three parameterised constructor");
	}
	public Parent(int a, int b, int c, int d) {
		this();
		System.out.println("Parent four parameterised constructor");
		
            }

}
