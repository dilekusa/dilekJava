package loops;

public class DiamondNumDil {
	/*
	 * 1 212 32123 212 1
	 */
	public static void main(String[] args) {

		int start = 0;
		int noOfColoumns = 1;
		for (int i = 1; i <= 5; i++) {
			if (i < 3) {
				start = i;
			} else {
				start = 5 - i;
			}
			for (int j = 1; j <= noOfColoumns; j++) {
				if (i > j) {
					System.out.print(" ");
				} else if (j < 3) {
					System.out.print("");
				} else {
					System.out.print(j - i);
				}
			}
			System.out.println(i);
			noOfColoumns = noOfColoumns + 2;

		}

	}
}
