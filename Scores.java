import java.util.Scanner;

	public class Scores {

		public static void main ( String [] args ) {
		Scanner it = new Scanner ( System.in );

		System.out.print ( " Enter a score: " );
		int score1 = it.nextInt();
		
		System.out.print ( " Enter a score: " );
		int score2 = it.nextInt();

		System.out.print ( " Enter a score: " );
		int score3 = it.nextInt();

		System.out.print ( " Enter a score: " );
		int score4 = it.nextInt();

		System.out.print ( " Enter a score: " );
		int score5 = it.nextInt();

		System.out.print ( " Enter a score: " );
		int score6 = it.nextInt();

		System.out.print ( " Enter a score: " );
		int score7 = it.nextInt();

		System.out.print ( " Enter a score: " );
		int score8 = it.nextInt();

		System.out.print ( " Enter a score: " );
		int score9 = it.nextInt();

		System.out.print ( " Enter a score: " );
		int score10 = it.nextInt();

		int sum = ( score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10 );
		 
		int average = sum / 10;

		System.out.println ( " Total number of the score entered " );
		System.out.printf ( " %d\n ", sum );

		
		System.out.println ( " Average = the number of score entered / the amount of score " );
		System.out.printf ( " %d\n ", average );

	}
}




