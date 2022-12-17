package demo2;

import Demo.Exa;

public class Child extends Exa {
	public Child() {
		this(1,2);
		System.out.println("Child default constructor");
	}
	
	public Child(int a) {
		this(1,2,3,4);
		System.out.println("Child one parameterised constructor");
	}
	public Child(int a, int b) {
		super(1);
		System.out.println("Child two parameterised constructor");
	}
	public Child(int a,int b, int c) {
		this(1);
		System.out.println("Child three  parameterised constructor");
	}
	public Child(int a, int b, int c, int d) {
		this();
		System.out.println("Child four parameterised constructor");
	}
   public static void main(String[] args) {
	   Child c= new Child(1,2,3);
	   
		

	}

}
