package loops;

import java.util.Scanner;

// an int  variable  n that has already  been declared , 
//write some code that repeatedly reads a value  into n until 
//at last a number between  1 and 10 (inclusive) has been entered.

//ASSUME  the availability of a variable , stdin, that references  a Scanner object  associated with standard input.

public class DoWhile21000 {

	public static void main(String[] args) {
		
		Scanner stdin=new Scanner (System.in);
		System.out.println("enter number");

		int total=0;
		
		while(stdin.hasNext())
		{
			total=total+stdin.nextInt();
		}
				
	   System.out.println(total);
	}
}
 