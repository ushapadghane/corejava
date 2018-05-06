package corejava;

import java.time.LocalDateTime;
import java.util.Scanner; 



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
	
	
	}

