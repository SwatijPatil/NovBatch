package demo2;

public class C1_3 extends P1_4{
	public C1_3() {
		this(1,2);
		System.out.println("Child");
	}
	public C1_3(int a) {
		this(1,2,3);
		System.out.println("Child 1");
	}
	public C1_3(int a, int b) {
		this(1);
		System.out.println("Child 2");
	}
	public C1_3(int a, int b, int c) {
		super(1,2);
		System.out.println("Child 3");
	}

	public static void main(String[] args) {
		C1_3 c=new C1_3();

	}

}
