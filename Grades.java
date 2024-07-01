import java.util.Scanner;

	public class Grades {

		public static void main ( String [] args ) {
		Scanner it = new Scanner ( System.in );

		System.out.print ( " Enter Grade value: " );
		int grade = it.nextInt();

		System.out.printf ( " Your grade is: " );


		if ( grade <= 100 && grade >= 80  ) {

			System.out.println ( " A " );
		}

		if (  grade < 80 && grade >= 70  ) {

			System.out.println ( " B " );
		}

		if ( grade < 69 && grade >= 50  ) {

			System.out.println ( " C " );
		}

		if ( grade < 50 ) {

			System.out.println ( " D " );
		}

	}
}



