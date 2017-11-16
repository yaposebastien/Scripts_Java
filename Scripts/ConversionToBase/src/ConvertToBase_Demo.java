import java.util.Scanner;
import java.util.Stack;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;
public class ConvertToBase_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		int numberToConvert = 0;
		int baseOfConversion = 0;
		Scanner Saisie = new  Scanner(System.in);
		Stack<Integer> stackOfConvertedNumbers = new Stack<Integer>();
		
		System.out.println("Beginnig of Convert to Base Program");
		boolean done = true;
		try
		{
			boolean isContinued = false;
			while(!isContinued)
				{
					
						System.out.println("Enter your number to convert :");
						numberToConvert = Saisie.nextInt();
						System.out.println("Enter your base :");
						baseOfConversion = Saisie.nextInt();
				
						if(numberToConvert > 0 && baseOfConversion > 0 || baseOfConversion <= 9)
							{
							if(baseOfConversion > 9)
							{System.out.println("Invalid input! The base " + baseOfConversion + " must be less than or equal to 9");}
							else {
								convertBase(stackOfConvertedNumbers,numberToConvert,baseOfConversion);
								printingStackOfConversion(stackOfConvertedNumbers,numberToConvert,baseOfConversion);
								
								System.out.println("\n");
								System.out.println("Do you want to continue ? (Y/N) ");
								String answer = Saisie.next();
								if(answer.equalsIgnoreCase("N"))
									{isContinued = true;}
							}
						
							
							}
						
			}
		}
		catch(NumberFormatException ex){
			
			System.out.println("Invalid input" + ex.getMessage());
		}
		catch(java.util.InputMismatchException ex) {
			System.out.println("Sorry! This is an invalid input.");
		}
		catch(java.lang.ArithmeticException ex) {
			System.out.println("Sorry! The base can be zero");
		}

	}
	
	/**
	 * Function using Recursion to evaluate the Conversion 
	 * @param stackOfConverted -Passing as a reference the name of the Stack
	 * @param number - Number to convert
	 * @param base -base to convert
	 */
	public static void convertBase(Stack<Integer> stackOfConverted, int number, int base) {
			
			if(number != 0 ) {
				
				int remain = number % base;
				stackOfConverted.push((Integer)remain);
				number = number / base;
				convertBase(stackOfConverted, number, base);
			}
			
		}
	public static void printingStackOfConversion(Stack<Integer> stackOfPrinted, int number, int base) {
		//Printing the content of the Stack
		//Using print instead of Sysout() helps print out the stack in single line
		
		System.out.println("Converting the number " + " " + number + " from base 10"
				+ " " + "to base " + " " + base + "...");
		while(!stackOfPrinted.empty()){

	
	System.out.print(stackOfPrinted.pop().toString());	

	}//End while of Printing the stack
	}
	}


