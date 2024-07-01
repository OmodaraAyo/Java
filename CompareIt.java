import java.util.Scanner;

		public class  CompareIt {

		public static void main ( String [] args ) {
		Scanner at = new Scanner ( System.in );

		System.out.print ( " Enter integer number: " );
		int number = at.nextInt();

		int number1 = ( number * number );
		int number2 = 100;

		if ( number1 >= number2 )  {

			System.out.printf  ( " %d >= %d\n ", number1, number2 );

		}
		else{ 

			System.out.printf ( " \n number is less than 100 " );
		}

		if ( number1 == number2 ) {

			System.out.printf ( " \n %d == %d\n ", number1, number2 );

		}

		else {

			System.out.printf ( " \n number is not equal with 100 " );

		}

	      }

	}