	import java.util.Scanner;
	public class Acceleration {

		public static void main ( String [] args ) {
		Scanner input = new Scanner ( System.in );

		System.out.print ( " Enter first integer: " );
		double v0 = input.nextDouble();

		System.out.print ( " Enter second integer: " );
		double v1 = input.nextDouble();

		System.out.print ( " Enter third integer: " );
		double t = input.nextDouble ();

		double substraction = ( v1 - v0 );

		double division = ( substraction / t );

		System.out.print ( " The average acceleration is " );

		System.out.printf( " division %.2f " , division );

		}
	}