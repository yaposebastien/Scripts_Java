//Import of different packages
/**
 * 
Purpose:

To demonstrate your ability to declare and manipulate an array. To create and use a menu to allow a user to select the operation to be performed. And, to detect an error and use exception handling techniques to resolve it. 

Specifications:

Declare an array to hold String values. Allow the user to determine the size of the array and to enter any number of tasks into the array. Tasks are always added to the end of the array. Display a numbered list of the tasks (numbering must start at 1). The list should display only those array elements that contain tasks – empty elements should be ignored. Using the number assigned to the task allow the user to modify its content or delete it from the array. When a task is deleted, you must move the tasks below it up so as not to have any empty element between tasks in the array. 

Exceptions must be thrown and caught when any of the following occur:

    The user attempts to add a task to a full list.
    The task number is outside the boundaries of the array.

 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.NumberFormatException;
public class MyToDoList {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
	
		int SizeArray = 0;
		char userChoice ;
		boolean isContinued = false;
		int counterTask = 0;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Lab Assignment:: My To-DoList ");
		System.out.println("How many elements do you want in your to do list ? :");
		SizeArray = Scan.nextInt();
		
		//Initialization of the array of To-DoList
		String[] toDoList = new String [SizeArray];
		//Calling the function to display the menu
		System.out.println("Your to-Do-List of " + SizeArray  + "  elements has been created \n");
		DisplayMenu();
	
		try {
			
				do
					{
						System.out.println("Enter your choice ");
					    userChoice = Scan.next().trim().charAt(0);
				if(userChoice !='A' && userChoice !='M' && userChoice !='D' && userChoice !='L' && userChoice !='Q') {
					throw new Exception ("Invalid answer for user choice! Please select A, M, D, L, Q ");
				}
				else {
					if(userChoice == 'A'){
						
						System.out.print("\f");
						System.out.println("Processing addition of a task to the To-Do-List .... ");
						if(counterTask  == (toDoList.length)){
							throw new Exception ("Sorry! Your To-Do-List is full ");
							
						}
						else
						{
						AddingTaskToMyList(toDoList,SizeArray,counterTask);
						PrintMyToDoList(toDoList,counterTask);
						counterTask ++;
						isContinued = true;
						}
						System.out.print("\f");
						PrintMyToDoList(toDoList,counterTask);
						DisplayMenu();
					}
					if(userChoice == 'M'){
						System.out.print("\f");
						System.out.println("Processing modification of a task to the To-Do-List ....");
						 PrintMyToDoList(toDoList,counterTask);
						 ModifyingExistingTask(toDoList);
						 isContinued = true;
					}
					if(userChoice == 'D'){
						
						System.out.print("\f");
						PrintMyToDoList(toDoList,counterTask);
						 System.out.println("Processing suppression of a task to the To-Do-List ....");
						 SuppressionElementOfToDoList(toDoList,counterTask);
						 PrintMyToDoList(toDoList,counterTask);
						 isContinued = true;
					}
					if(userChoice == 'L'){
						System.out.print("\f");
						System.out.println("Processing display of a task to the To-Do-List.... ");
						System.out.print("\n");
						System.out.println("Your current to-Do-List contains those following tasks :");
						PrintMyToDoList(toDoList,counterTask);
						DisplayMenu();
						isContinued = true;
						
					}
					if(userChoice == 'Q'){
						isContinued = false;
					}
				}
						
						
				}while(isContinued == true);
			
			
		} // End of the block try
			
			catch (NumberFormatException ex)
	          {
	              System.out.println("Number Format Exception " + ex.getMessage());              
	          } // End block NumberFormatException
	          catch (ArithmeticException ex)
	          {
	              System.out.println("Arithmetic Exception " + ex.getMessage());
	          } //End block ArithmeticException
	
	}
	//Method to add a task
	public static void AddingTaskToMyList(String[] arrayToFill, int size, int counter) {
		Scanner in = new Scanner(System.in);
		if(counter <= arrayToFill.length){
			System.out.println("Enter your new task :");
			arrayToFill[counter] = in.nextLine();
		}
		else {
			System.out.println("sorry! Your to-Do-List is full");
		}
	}
	//Printing the array of tasks
	public static void PrintMyToDoList(String[] arrayToPrint, int currentTask) {
		
		System.out.println("\n");
		if(currentTask < 0){
			System.out.println("List empty");
		}
		else{
			
		}
			for (int i = 0; i < currentTask; i++)
			{
				//Position = i + 1;
				System.out.println("Task " + (i+1) + " :" + arrayToPrint[i]);
			}
		}
	//The menu of the program
	public static void DisplayMenu() {	
			   System.out.println("List of different tasks.");
			   System.out.println("\t A---> Add a new task");
	    	   System.out.println("\t M---> Modify an existing task");
		       System.out.println("\t D---> Delete an existing task");
		       System.out.println("\t L---> List all the  existing tasks");
		       System.out.println("\t Q---> Quit the program");   
		}
	//Method to modify an existing task
	public static void ModifyingExistingTask(String arrayToModify[]) throws Exception {
		int realIndex = 0;
		int taskNumberToModify = 0;
		String newTask;
		Scanner in = new Scanner(System.in);
		System.out.println("Which index task  do you want to mofify ? ");
		taskNumberToModify= in.nextInt();
		realIndex = taskNumberToModify -1;
		if(realIndex < 0 && taskNumberToModify > arrayToModify.length){
			throw new Exception ("Invalid index number! Please enter a number between " + arrayToModify.length);
		}
		else {
			System.out.println("Please enter description on the new task :");
			 newTask = in.nextLine();
			System.out.println("Enter your new task :");
			arrayToModify[realIndex] = in.nextLine();

		}
		
	}
	//Method to delete an existing task
	public static void SuppressionElementOfToDoList(String arrayToModify[], int currentIndex ) {
		int realIndex = 0;
		int taskNumberToModify = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Which index task  do you want to delete ? ");
		taskNumberToModify= in.nextInt();
		int lengthArray = arrayToModify.length; 
		realIndex = taskNumberToModify -1;
		
		for(int i= realIndex; i < lengthArray ; i++ ){
			arrayToModify[i-1] = arrayToModify[i];
		}
		lengthArray = lengthArray -1;
		

	}
	

}
