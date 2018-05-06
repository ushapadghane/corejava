package corejava;

import java.time.LocalDateTime;
import java.util.Scanner;

import Programs.MathOperation; 



public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("Hi Siri, what date and time is it?");
		int questions ;	
	
	
	questions = reader.nextInt();

	

	//System.out.println("Hi Siri, Does it going to rain?");
	//int rain;
	//rain = reader.nextInt();	
	switch(questions)
	{
	case 1 :
		System.out.println(LocalDateTime.now());
	
		break;
	case 2 :
		System.out.println("The time is not available");
		break;
		
		
		
			
	
	}
		
	}
	public static void Date()
	{
		System.out.println("Today's date is "+LocalDateTime.now());
		
	}	
	
	public static void calculator()
	{
		 MathOperation MyMath = new MathOperation();
		 Scanner inputOp = new Scanner(System.in);
		 String operationType ;
		 
		 System.out.println("Enter your operation:");

		 operationType = inputOp.nextLine();

	int x =7;
	int y = 7;
	// operationType = "add";
	 if(operationType.equalsIgnoreCase("add"))
	 {
		 System.out.println(MyMath.add(x,y));
	 }
	 
	 else if(operationType.equalsIgnoreCase("sub"))
	 {
		 System.out.println(MyMath.sub(x,y));
	 }
	 else if(operationType.equalsIgnoreCase("mul"))
	 {
		 System.out.println(MyMath.mul(x,y));
	 }
	 else if(operationType.equalsIgnoreCase("div"))
	 {
		 System.out.println(MyMath.div(x,y));
	 }
	 else {
		 System.out.println("Not sure what you want to do");
	 }
	}

