import java.util.Scanner;

	public class Counters { 

		public static void main ( String [] args ) {
		Scanner it = new Scanner ( System.in );

		

		int positive = 0;
		int negative = 0;
		int zero = 0;
		int number = 0;
		
 

		while ( number != -201 ) {

		if ( number > 0 ) {	

			positive++;

		}
		else 
			if ( number < 0 ) {

				negative++;
		}
		else 
			if  ( number == 0 ) {

				zero++;

		}

		else {

			System.out.println ( " No number entered " );
		}

		System.out.print ( " Enter a number or -201 to quit: " );
		number = it.nextInt();
		
		}

		
		System.out.printf ( " Total positive entered %d\n ", positive );
		System.out.printf ( " \n Total negative entered %d\n ", negative );
		System.out.printf  ( "\n Total zero entered %d\n ", zero );

	      }
	}
		


				