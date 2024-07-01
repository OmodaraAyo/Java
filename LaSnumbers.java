import java.util.Scanner;

	public class LaSnumbers {
		public static void main ( String [] args ) {
		Scanner it = new Scanner ( System.in );
		
		int smallest = 0;
		int largest = 1;
		int value = 0;
		int smallestTotal = 0;
		int largestTotal = 0;
		
		System.out.printf ("%s\n"," Smallest to largest in ascending order and represent smallest numbers with 0 and largest numbers with 1" );
			System.out.println ( " smallest = all numbers below and eqaul to 100 " );
			System.out.println ( " largest = all numbers above 100 " );
			System.out.println ( " Type the end-of-file indicator to terminate input" );
			System.out.println ( " On UNIX/Linux/macOS type <Ctrl> d then press Enter" );
			System.out.println ( " On Windows type <Ctrl> z then press Enter" );
			
			while (it.hasNext()) {
				System.out.print ( " Enter a number: " );
				value = it.nextInt();
				
			if ( value <= 100 ) {
					
					smallest++;
					smallestTotal = smallest;
			}
			else
				if ( value > 100 ) {
				
						largest++;
						largestTotal = largest;
			}
			else {
				
				System.out.println ( " Error! input only 0 and 1 numbers " );
			}
		}
		
				System.out.printf ( " The number of smallest numbers %d and the total number of smallest numbers is %d\n ", smallest, smallestTotal);
				System.out.printf ( " \nThe number of largest numbers %d and the total number of largest numbers is %d\n ", largest, largestTotal );
	}
}
				
				