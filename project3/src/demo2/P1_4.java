package demo2;

public class P1_4 {
	public P1_4() {
		this(1,2,3,4);
		System.out.println("parent");
	}
public P1_4(int a) {
	System.out.println("Parent1");
		}
public P1_4(int a, int b) {
	this(1,2,3);
	System.out.println("Parent2");
		}
public P1_4(int a, int b, int c) {
	this();
	System.out.println("Parent3");
		}
public P1_4(int a, int b, int c, int d) {
	this(1);
	System.out.println("Parent4 test");
		}
}
