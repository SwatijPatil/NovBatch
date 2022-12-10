package demo2;

public class Constructor {
public Constructor() {
	this(2, 3, 4);
	System.out.println("this is default constructor");
}
public Constructor(int a) {
	this();
	System.out.println("this is one parameterised constructor");
}
public Constructor(int a, int b) {
	this(3);
	System.out.println("this is two parameterised constructor");

}
public Constructor(int a , int b, int c) {
	System.out.println("this is three parameterised constructor");
}
public Constructor(int a, int b, int c, int d) {
this(2, 3);
	System.out.println("this is four parameterised constructor");
}
	public static void main(String[] args) {
		Constructor cn = new Constructor(1,2,3,4);

	}

}
