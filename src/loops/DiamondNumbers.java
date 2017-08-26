package loops;

public class DiamondNumbers {
	/* 
		1 				1
		212 			2
		32123			3
		432123	 		4
		32123			5
		212 			6
		1 				7
*/
		public static void main(String[] args) {
		
		int noOfColoumns=1;
		int start=0;
		for(int i=1; i<=7; i++)
		{
			if(i<4)
			{
				start=i;
			}
			else
			{
				start=8-i;
			}
				for(int j=1;j<=noOfColoumns;j++)				//for 1st coloumn we need 1*;2nd column 3*; 3rd coloumn 5* so we need j as noOfCol
				{   
					
					int middleColoumn=noOfColoumns/2+1;
					System.out.print(+start);
					if(j<middleColoumn)
					{
						start--;
					}
						else
					{
					start++;	
					}
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

