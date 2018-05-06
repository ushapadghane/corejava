package corejava;

public class Function extends NonStatic {

	static int t =4;//global variable
	int z =9; // non static variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		country();
		state();
		age();
		addition(8,9);
		massaddition(1,2,3,4);
	
	}
		public static void country() {
			
			
			System.out.println("I am from Mars");
		}

		
		public static void state() {
			
			System.out.println("I am from texas");
			System.out.println(t);
			//System.out.println(z);
		}
		
		public static void age()
		{
			
			int x = 9;
			System.out.println(x);
			
		}
		
		public static void addition(int a, int b) 
		{
			int add = a+b+t; //local variable
			System.out.println(add);
		}
		
		public static void massaddition(int a,int b, int c, int d)
		{
			int add = a+b+c+d;
			System.out.println(add);
		}
		
		private static void food() {
			System.out.println("I love fruits");
		}
	}


