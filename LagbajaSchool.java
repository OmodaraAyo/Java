import java.util.Scanner;
public class LagbajaSchool {

	public static void main (String... args){
	Scanner input = new Scanner(System.in);

	System.out.print ("How many student do you have: ");
	int studentNumber = input.nextInt();

	System.out.print ("How many subject do they offer: ");
	int subjectNumber = input.nextInt();

	int student;
	double subject;
	double totalSubjectScore = 0;
	double averageOfTotalScore = 0;
	double totalAverageOfTotalScore = 0;
  
	for (int studentCounter = 1; studentCounter <= studentNumber; studentCounter++) {
		System.out.println ("\nStudent: "+studentCounter);
	for (int subjectCounter = 1; subjectCounter <= subjectNumber; subjectCounter++) {

		System.out.print ("Enter student subject score: ");
		subject = input.nextDouble();
	
		if ( subject >0 && subject <= 100 ) {

			totalSubjectScore += subject;
			averageOfTotalScore = totalSubjectScore / subjectNumber;
			totalAverageOfTotalScore = totalSubjectScore / studentNumber;
				
		}

	   }
		System.out.printf ("Total score = %.2f\n", totalSubjectScore );
	 	System.out.printf ("Average = %.2f\n", averageOfTotalScore );
		
	}

		System.out.print ("\nSubject Summary\n" );
	for (int subjectSummary = 1; subjectSummary <= subjectNumber; subjectSummary++){
	
		System.out.println ("\nSubject "+subjectSummary);
	for (int subjectSummary2 = 1; subjectSummary2 == 1; subjectSummary2++){

		System.out.printf ("Highest Scoring Student is: Student  scoring ");
		System.out.printf ("\nLowest Scoring Student is: Student  scoring ");
		System.out.printf ("\nTotal Score is: ");
		System.out.printf ("\nAverage Score is: ");
		System.out.printf ("\nNumber of Passes:");
		System.out.printf ("\nNumber of Fails:\n");
	}
	}
	
		System.out.printf ("\nThe hardest subject is Subject with  failures");
		System.out.printf ("\nThe easiest subject is Subject with passes ");
		System.out.printf ("\nThe overall Highest score is scored by Student 2 in subject scoring");
		System.out.printf ("\nThe overall Lowest score is scored by Student 1 in subject  scoring");
		System.out.print ("\n\nClass Summary");
		System.out.printf ("\nBest Graduating Student is: Student  scoring  ");
		System.out.printf ("\nWorst Graduating Student is: Student  scoring  ");
		System.out.println ("\nClass Total score is: " +totalSubjectScore );
		System.out.println ("Class Average score is: " +totalAverageOfTotalScore );
}
}