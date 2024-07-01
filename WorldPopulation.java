import java.util.Scanner;

	public class WorldPopulation {

		public static void main ( String [] args ) { 
		Scanner input = new Scanner ( System.in);

	System.out.print ( " Enter current year population: " );
	long current = input.nextLong();

	System.out.print ( " Enter annual world population: " );
	long annual = input.nextLong();

	long subtraction = current - annual;

	long division = subtraction / annual;

	long multiplication = ( division * 100 );

	for ( int Multiplication =1; multiplication <5; multiplication++, current *= annual ) {	

			System.out.printf ( " %d = %d\n ", multiplication, current );
		}

	    }
	}