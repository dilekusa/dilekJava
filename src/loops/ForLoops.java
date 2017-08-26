//Task
//
//you should declare and initialized int variables  k and total 
// use a for loop  to compute the sum  of the squares 
//	of the first 50 counting numbers, and store  this value  in total. 
//	Thus your code should put 1*1 + 2*2 + 3*3 +... + 49*49 + 50*50 into total.
//	Use no variables  other than k and total.


package loops;

public class ForLoops {
	public static void main(String[] args) {
		int k;//1,2,3,4
		int total;
		
		total=0;
		for(k=1;k<=50; k++){
			total=total+k*k;    //total=0+1*1=1
			System.out.println(total+" "+"k:"+k);					//total=1+2*2=5>>(1*1+2*2)
						//total=5+3*3=14>>(1*1+2*2+3*3))
		}
	} 

}
