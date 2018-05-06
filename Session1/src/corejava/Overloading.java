package corejava;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numbers(6);
		numbers(5.6);
		addition(5,6);
		massaddition(5,6,7);
		massaddition(5,6,7,8);
	}

	
	public static void numbers (int a)
	{
		System.out.println(a);
	}
	
	public static void numbers (double a)
	{
		System.out.println(a);
	}
	public static void addition(int a, int b) 
	{
		int add = a+b; //local variable
		System.out.println(add);
	}
	
	public static void massaddition(int a,int b, int c)
	{
		int add = a+b+c;
		System.out.println(add);
	}
	public static void massaddition(int a,int b, int c, int d)
	{
		int multiply = a*b*c*d;
		System.out.println(multiply);
	}
	
}
