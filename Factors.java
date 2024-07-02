import java.util.Scanner;
	public class Factors {
		public static void main ( String [] args ) {
		Scanner input = new Scanner ( System.in );
	
		System.out.print ( "Enter a number: " );
		int number = input.nextInt();

	
	int sumOfFactors =0;

		for ( int counter = 2; counter <= number; counter+=1 ) {

			if ( number % counter == 0 ) {
			
				sumOfFactors++;

			}
		}
			System.out.printf ( "Total of Factors of %d are %d", number, sumOfFactors++ );
	}
}
				