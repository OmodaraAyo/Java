 import java.util.Scanner;

	public class Arithmetic {

		public static void main ( String [] args ) { 
		Scanner at = new Scanner ( System.in );

		System.out.print ( " Enter first integer: " );
		int first = at.nextInt();

		System.out.print ( " Enter second integer: " );
		int second = at.nextInt();

		int third = first * first;
		int five = second * second;

		System.out.printf ( " Square of first integer is %d\n Square of second integer %d\n ", third, five );

		int addition = third + third;
		int addition2 = five + five;

		System.out.printf ( "Sum of the square of first integer is %d\n Sum of the square of second integer is %d\n ", addition, addition2 );

		int addUp = third + five;

		System.out.printf ( "Addition of sqaure of first and second integer is %d\n ", addUp );

		int subtraction = third - five;

		System.out.printf ( "The difference of their squares is %d ", subtraction );

	      }

	}

		