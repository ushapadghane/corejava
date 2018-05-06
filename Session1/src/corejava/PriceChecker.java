package corejava;

import java.util.Scanner;

public class PriceChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("What is the product you are looking for?");
		int productnumber ;
		productnumber = reader.nextInt();
		switch (productnumber) {
		case 1 :
			System.out.println("The price of Cetaphil Lotion is $20 and it is very gentle");
			break;
		case 2:
			System.out.println("The price of Lubriderm Lotion is $15 and it is little watery");
			break;
		case 3:
			System.out.println("The price of Dove Body Wash is $18 and it is very gentle");
			break;
		case 4:
			System.out.println("The price of Dove Shampoo is $12 and it is really good");
			break;
		default:
			System.out.println("The product is not avaiable");
			break;

		}
		
		
	}

}
