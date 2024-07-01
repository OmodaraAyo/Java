import java.util.Scanner;

	public class Countries {

		public static void main ( String [] args ) {
		Scanner input = new Scanner ( System.in );

		System.out.println ( " Enter the first country: " );
		String country1 = input.nextLine();

		System.out.println ( " Enter the second country: " );
		String country2 = input.nextLine();

		System.out.println ( " Enter the third country: " );
		String country3 = input.nextLine();


		String country4 = country3;

		String country5 = country1;

		String country6 = country2;
		

		System.out.print ( " The countries in descending order are " );

		System.out.printf ( " %s ", country4 );
		System.out.printf ( " %s ", country5 );
		System.out.printf ( " %s ", country6 );

	}
}