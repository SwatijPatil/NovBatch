package ploymorphism;

public class SubClass extends SuperClass{
	
	public void whatsapp() {
		System.out.println("Status upload  5mb file ");
	}
	
	public static void main(String[]args) {
		
		SubClass sub=new SubClass();
		sub.whatsapp();
		
	}

}
