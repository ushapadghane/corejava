package corejava;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int bmi = 24;
		
	
			
			if(bmi >30)
			{
				System.out.println("It is obese ");
			}
			else 
			{
							if (bmi > 25 )
							{
								System.out.println("It is overweight ");
							}
							else
							{
								if (bmi > 18 )
								{
									System.out.println("It is healthy ");
								}
								else
								{
									System.out.println("It is underweight ");
								}
							}
			}
	}

}
	

