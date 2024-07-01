import java.util.Scanner;

		public class DcaOfCircle {

			public static void main ( String [] args ) {
			Scanner me = new Scanner ( System.in );

			System.out.print ( " Radius of a circle: " );
			int radius = me.nextInt ();	

			float diameter = ( 2 * radius);

			double π = 3.14159;

			double circumference = ( 2 * π * radius );

			double value1 = ( radius * radius );

			double area = π * value1;
			
			System.out.println ( " \n diameter = 2 * radius " );
			System.out.printf ( " The diameter of the circle is %f %n\n", diameter );

			System.out.println ( " \n circumference = ( 2 * π * radius ) where π = 3.14159 " );
			System.out.printf ( " The circumference of the circle is %f \n ", circumference );

			System.out.println ( " \n Area = π * ( radius )^2 " );
			System.out.printf ( "The area of the circle is %f\n ", area );

		}
	}
		
			