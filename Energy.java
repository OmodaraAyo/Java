import java.util.Scanner;

	public class Energy {

		public static void main ( String [] args ) {
		Scanner input = new Scanner ( System.in );

		System.out.print ( " Enter amount of water in kilograms: " );
		double M = input.nextDouble();

		System.out.print ( " Enter final temperature: " );
		double fT = input.nextDouble();

		System.out.print ( " Enter initial temperature: " );
		double iT = input.nextDouble();

		double substraction = ( fT - iT );

		double multiplication = ( M * substraction * 4184 );

		System.out.print (" The energy needed is ");
		
		System.out.printf(" multiplication %.2f ", multiplication );

		}
	}

		

		