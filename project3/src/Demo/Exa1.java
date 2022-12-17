package Demo;

public class Exa1 {
	
	public Exa1() {
		this(1, 2);
		System.out.println("Default");
	}
	public Exa1(int a) {
		this(4, 1, 2, 3);
		System.out.println("ont");
	}
	public Exa1(int a, int b) {
		System.out.println("two");
	}
	public Exa1(int a, int b, int c) {
		this(1);
		System.out.println("three");
	}
	public Exa1(int a, int b, int c,int d) {
		this(1, 2, 3, 4, 5);
		System.out.println("four");
	}
	public Exa1(int aa, int b, int c, int d, int e) {
		this();
		System.out.println("five");
	}
public static void main(String[] args) {
	Exa1 exa=new Exa1(1, 2,3);
		

	}

}
