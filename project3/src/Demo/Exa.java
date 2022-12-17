package Demo;

public class Exa {
	
	
	public Exa() {
	this(1,2 ,3);
		System.out.println("Default parent constructor");
	}
public Exa(int a) {
	this(2,3);
	System.out.println("Parent one parameterrised constructor");

		
	}
public Exa(int a, int b) {
	this(1,2,3,4);
	
	System.out.println("Parent two parameterrised constructor");
}
public Exa(int a, int b, int c) {
	System.out.println("Parent three parameterrised constructor");
	
}
public Exa(int a, int b, int c, int d) {
	this();
	System.out.println("Parent four parameterised constructor ");
}

public static void main(String[]args) {
	Exa p=new Exa(1);
}

	}


