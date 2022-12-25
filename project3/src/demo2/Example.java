package demo2;

public class Example {
  public int addition(int a, int b) {
		int sum=a+b;
		System.out.println("addtition of two numbers 10 and 2 ="+ sum);
		return sum;
}
	public int substraction(int e, int f) {
		int sub_result=e-f;
		System.out.println("Substraction of two numbers new_addionresult and 2 is = "+sub_result);
		return sub_result;
		}
	public int multiplication(int g, int h) {
		int mul_result=g*h;
		System.out.println("Multiplication of the two numbers = "+ mul_result);
		return mul_result;
		}
	public static void main(String[] args) {
		Example exa=new Example();
		int addition_result=exa.addition(10, 2);
		int new_additionResult=exa.addition(addition_result, 2);
		int sub=exa.substraction(new_additionResult, 2);
		int mul =exa.multiplication(2, sub);
        int division= mul/2;
    System.out.println("Final result =" + division);
		}

}
