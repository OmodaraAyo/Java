import java.util.Scanner;

	public class PositiveAndPrimeNumbers {

		public static void main ( String [] args ) {
		Scanner input = new Scanner ( System.in );

		System.out.print ( "Enter a positive integer: " );
		int number = input.nextInt();

		if ( number > 0 ) {
			
			System.out.printf ("%d is a positive integer\n", number );
			System.out.print ("Enter a number or -1 to end program: " );
			int number2 = input.nextInt();

			while ( number2 != -1 ) {
			
				if ( number2 == 2 || number2 == 3 ) {
			
					System.out.printf ("%d is a prime number\n", number2);
				}
				else
					if ( number2 == 1 ) {
						System.out.printf ("%d is not a prime number\n", number2);
				}
				else 
					if ( number2 % 2 != 0 && number2 % 3 != 0  && number2> 0 ) {

						System.out.printf ("%d is a prime number\n", number2 );
				}

				else {
					System.out.printf ("%d is not a prime number\n", number2 );
				}

		
				System.out.print ("Enter a number: ");
				number2 = input.nextInt();

			}
			if ( number2 == -1 ) {
				System.out.print ( "App closed" );

			}

	} 



		else 
			if ( number < 0 ) {

				System.out.printf ("%d is not a positive integer", number);
			}

	}

}