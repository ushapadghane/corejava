package corejava;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("What is your name");
		String name = reader.next();
		System.out.println("your name is "+name);

		
		Scanner reader1 = new Scanner(System.in);
		System.out.println("What is your age");
		try {
		int age = reader1.nextInt();
		System.out.println("your age is "+age);
		}
		catch(Exception  e)
		{
			System.out.println("need to give numberical value");
		}

		finally {
			System.out.println("thanks for using this program");
		}
	}

}
