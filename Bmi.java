import java.util.Scanner;

	public class Bmi {

		public static void main ( String [] args ) { 
		Scanner it = new Scanner ( System.in );

		System.out.print ( " Enter weight In Pounds : " );
		double weightInPounds = it.nextDouble();

		System.out.print ( " Enter height in Inches: ");
		double heightInInches = it.nextDouble();

		int number = 703;

		double value2 =  weightInPounds * number;

		double value3 = heightInInches * heightInInches;

		double bodyMassIndex = value2 / value3;

		System.out.printf ( " The Body Mass Index is %.2f\n ", bodyMassIndex );


		System.out.println ( " \n To convert weight in pound to kilograms multiply by 0.45392 " );
		System.out.print ( " Enter weight In Kilograms: " );
		double weightInKilograms = it.nextDouble();

		System.out.println ( " \n To convert height in inches to meter multiply by 0.0254 " );
		System.out.print ( " Enter height in meters: " );
		double heightInMeters = it.nextDouble();
	
		double value4 = weightInKilograms;
		
		double value5 = heightInMeters * heightInMeters;

		double bmi = value4 / value5; 

		System.out.printf ( " The Body Mass Index is %.2f\n ", bmi );


	   }
	}







		