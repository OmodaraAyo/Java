import java.util.Scanner;


		public class Palindrome {

			public static void main ( String [] args ) {
			Scanner input = new Scanner ( System.in );

		System.out.print ( " Enter a three -digit integer: " );
		int number1 = input.nextInt();

		if ( number1/100 == 1 && number1%10 == 1 ) {

			System.out.print ( " is a palindrome " );
		}

		else {

			System.out.print ( " is not a palindrome " );

		}

	   }
	}




