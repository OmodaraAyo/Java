	import java.util.Scanner;

	public class InterestCalculation {

		public static void main ( String [] args ) {
		Scanner input = new Scanner ( System.in );

		System.out.print ( " Enter first integer: " );
		int balance = input.nextInt ();

		System.out.print ( " Enter second integer: " );
		double annualInterestRate = input.nextDouble ();
		
		double division = ( annualInterestRate / 1200 );

		double multiplication = balance * division;

		System.out.print ( " The interest is " );
		System.out.printf ( " Multiplication %.2f " , multiplication );
		
		}
	} 