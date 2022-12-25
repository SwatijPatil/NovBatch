package demo2;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("addition of two numbers "); 
		System.out.println("First number is ");
		int a=sc.nextInt();
		System.out.println("Second  number is ");
        int b	=	sc.nextInt();
         int sum=a+b;
         System.out.println("Sum of two numbers "+ sum);
         sc.close();

	}

}
