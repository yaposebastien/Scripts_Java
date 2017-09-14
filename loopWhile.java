import java.util.Scanner;


public class loopWhile {
	
	public static void main(String[] args) {
	
// Find sum and average
		Scanner in = new Scanner(System.in);
		
		double score = 0.0;
		double total = 0.0;
		int counter = 0;
		int perfectScore = 0;
		System.out.println("Please enter 5 test score");
		
		while(counter !=5) {
			score=in.nextDouble();
			total = total + score;
			counter++;
			
		}
		System.out.println("The total is " +total);
		System.out.println("The average is : " +(total/counter));
		
		//Count matches
		
		System.out.println("Enter 5 test scores");
		for(int i=0; i<5; i++){
			score = in.nextDouble();
			if(score == 100) {
				perfectScore++;
			}
		}
		System.out.println("The student entered " +perfectScore + " times 100");
		
		//Check for valid input
		boolean valid = false;
		double input = 0.0;
		while(!valid){
			System.out.println("Enter a number between 0 and 10");
			input = in.nextDouble();
			if(input >= 0 && input <= 10)
				valid = true;
		}
		//Find the max
		/*jjhsjhjs
		 * adklasdksak
		 */
		double max = 0.0;
		double min = 0.0;
		System.out.println("Enter 5 numbers");
		max = in.nextDouble();
		min = max;
		for(int i=0; i<4; i++) {
			input = in.nextDouble();
			if(input > max) {
				max = input;
			}
			if(input < min) {
				min = input;
			}
			
			}
		System.out.println("The greatest number is :" +max);
		System.out.println("The minimum number is :" +min);
}
	
}
