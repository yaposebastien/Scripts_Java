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
import java.util.Scanner;

class Main {
  static void makeChange(int amount) {
    // your code goes here.
    
    // Don't change the lines below.
    //System.out.println("Quarters: " + quarters);
    //System.out.println("Dimes: " + dimes);
    //System.out.println("Nickels: " + nickels);
    //System.out.println("Pennies: " + pennies);
    int quarters, dimes, nickels, pennies;
    amount=val;
    quarters=amount/25;
    amount=78-(25*quarters);
    dimes=amount/10;
    amount=amount-(10*dimes);
    nickels=amount/5;
    amount=amount-(5*nickels);
    pennies=amount/1;
    amount=amount-(1*pennies);
  }


  public static void main(String [] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter amount (1 to 99):");
    int val = in.nextInt();
    
    if (val >=1  && val <= 99) {
      
      makeChange(val);
      //amount=val;
    quarters=amount/25;
    amount=78-(25*quarters);
    dimes=amount/10;
    amount=amount-(10*dimes);
    nickels=amount/5;
    amount=amount-(5*nickels);
    pennies=amount/1;
    amount=amount-(1*pennies);
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + pennies);
    } else {
      System.out.println("Number out of range 1 to 99. You entered: " + val);
    }
    
  }
}
