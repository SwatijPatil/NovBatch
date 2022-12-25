package ploymorphism;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		//print 1-10
		//int i=1;
		/*while(i<=10) {
			System.out.println(i);
			i++;
		}*/
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		while(a%2==0) {
		System.out.println(" number is even "+ a);
		break;
		}
		
		s.close();
	}
}
