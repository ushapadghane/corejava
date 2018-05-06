package corejava;
//when you have an abstract method in any class, it becomes an abstract class
//abstract method mean you know your function, but dont know the action of that function

public abstract class Abstract {

	public static void color() {
		// TODO Auto-generated method stub
System.out .println("green is my favourite color");
	}
public static void food() {
	System.out.println("i like pie");
}
public static void addition(int a, int b) {
	int add = a+b;
	System.out.println(add);
}
	public abstract void dinner();
	public abstract void country();
	
}


