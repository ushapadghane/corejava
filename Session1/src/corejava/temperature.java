package corejava;

public class temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp = 70;
		
		switch (temp)
		{
		case 30:
			System.out.println("It is cold weather");
			break;
		case 60:
			System.out.println("It is pleasant weather ");
			break;
		case 70:
			System.out.println("It is hot weather");
			break;
		case 80:
			System.out.println("It is very hot weather");
			break;
			
		
		default:
			System.out.println("I do not know the temperature");
			
		}

	}

}
