//Import of Class Scanner to allow user input
import java.util.Scanner;
public class lowScore {
	public static void main(String[] args ){
		
		//Declaration of different variable of program
		
		String StudentName;
		int testScoreOne;
		int testScoreTwo;
		int testScoreThree;
		int testScoreFour;
		int testScoreFive;
		int lowScore = 0;
		double averageScore = 0.0;
		double score = 0.0;
		char letterGrade;
		
		
		Scanner in = new Scanner(System.in); //Create new instance of Class Scanner in this program
		
		System.out.println("Please enter student's name");
		StudentName = in.nextLine();
		
		System.out.println("Please enter student's five test score");
		testScoreOne = in.nextInt();
		testScoreTwo = in.nextInt();
		testScoreThree = in.nextInt();
		testScoreFour = in.nextInt();
		testScoreFive = in.nextInt();
		averageScore = testScoreOne + testScoreTwo + testScoreThree + testScoreFour + testScoreFive;
		
		lowScore = testScoreOne;
		
		if(testScoreTwo < lowScore)
			lowScore = testScoreTwo;
		if(testScoreThree < lowScore)
			lowScore = testScoreThree;
		if (testScoreFour < lowScore)
			lowScore =testScoreFour;
		if (testScoreFive < lowScore)
			lowScore = testScoreFive;
		
			averageScore = averageScore -lowScore;
		
		System.out.println("The low test score is : " + lowScore);
		System.out.println("The average is : " + averageScore);
		score = averageScore / 4;
		System.out.println("the student's score is : " + score);
		
		if(score >= 90)
			letterGrade = 'A';
		else if (score >= 80)
			letterGrade = 'B';
		else if (score >= 70)
			letterGrade = 'C';
		else if (score >= 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';
		
		System.out.println("The student grade is : " +letterGrade);
		
		
		
			
			
	}
	
	}
