package corejava;

public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String Rainbow [] = new String [7];
		
		Rainbow[0] = "red";
		Rainbow[1] = "orange";
		Rainbow[2] = "yellow";
		Rainbow[3] = "green";
		Rainbow[4] = "violet";
		Rainbow[5] = "indigo";
		Rainbow[6] = "blue";
		
		//System.out.println(Rainbow[0]);
		
		//System.out.println(Rainbow[3]);

		
		System.out.println(Rainbow[0]);
		System.out.println(Rainbow[3]);
		
		//length is count
		
		for(int x=0;x<Rainbow.length;x++)
		{
			System.out.println(Rainbow[x]);
		}
		
	}

}
