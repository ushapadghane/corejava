package corejava;

import java.util.Scanner;

public class EuroToDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Euro Amount");
		double euro = reader.nextInt();
		double dollar = euro * 1.24;
		System.out.println("Dollar amount is $" +dollar);
		
		
		
	}

}
