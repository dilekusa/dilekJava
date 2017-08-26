package loops;

public class DiamondShape {
	/* 
	 		* 				1
	 		*** 			2
	 		*****			3
	 		******* 		4
	 		***** 			5
	 		*** 			6
	 		* 				7
	 */
	public static void main(String[] args) {
		
		int noOfColoumns=1;
		for(int i=1; i<=7; i++)
		{
			for(int j=1;j<=noOfColoumns;j++)				//for 1st column we need 1*;2nd column 3*; 3rd column 5* so we need j as noOfCol
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<4)
			{	
				noOfColoumns=noOfColoumns+2;
			}
			else
			{
			noOfColoumns=noOfColoumns-2;	
			}
		}
	}	
}
