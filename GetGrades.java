import java.util.Scanner;

	public class GetGrades {

		public static void main ( String [] args ) {
		Scanner it = new Scanner ( System.in );

		System.out.print ( " Enter Grade value: " );
		int grade = it.nextInt();

		System.out.printf ( " Your grade is: " );

		if ( grade >= 80 ) {

			System.out.println ( " A " );
		}
	else
		if ( grade  >= 70 ) {

			System.out.println ( " B " );
		}
	else 
		if ( grade  >= 50 ) {

			System.out.println ( " C " );
		}
	else 
		if ( grade < 50 ) {

			System.out.println ( " D " );
		}
	else  {

			System.out.println ( " No grade entered " );


	}
}
		}