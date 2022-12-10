package demo2;

public class Example1 {
	public int multiplication(int a, int b) {
		int mul =a*b;
		System.out.println("multiplication result= "+ mul);
		return mul;
	}
	public int substraction(int mul, int d) {
		int sub= mul-d;
		System.out.println("substraction result "+ sub);
		return sub;
		}
	public int addition(int sub, int e) {
		int sum=sub+e;
		System.out.println("Addition result "+ sum);
	     return sum;
	}
	public static void main(String[] args) {
		Example1 exa=new Example1();
		int mult=exa.multiplication(10, 2);
		int sub_result=exa.substraction(mult, 2);
		int addition_result =exa.addition(sub_result, 2);
		int sub_newresult=exa.substraction(addition_result, 2);
		int division_result= sub_newresult/2;
		System.out.println("final result ="+ division_result);
		
		}
}
