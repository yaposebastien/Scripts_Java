
import java.util.Scanner;


public class Student_BST_Demo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
			
		BinarySearchTree listOfStudents = new BinarySearchTree();
		
		
		listOfStudents.add(new Student(1,"Yapo JB", "CIS"));
		listOfStudents.add(new Student(2,"Asseu Rodrigue", "NET"));
		listOfStudents.add(new Student(3,"N'depo Paul", "EGR"));
		
		System.out.println("Begin of Demo Binary Search Tree of Srudents. \n");
		
		boolean done = false;
		int optionUser;
		Scanner saisie = new Scanner(System.in);
		
		
		
		try
		{
			{
				do
				{
					//Calling Method to display all Students
					displayAllStudents(listOfStudents);
					optionUser = menuList(saisie);
					saisie.nextLine();
					
						switch(optionUser) {
					
						case 1:
							System.out.println("Adding a new student to the Application ...");
							while(!addingNewStudent(saisie,listOfStudents)) {};
							break;
						
						case 2:
							System.out.println("Searching a student to the Application ...");
							while(!searchStudent(saisie,listOfStudents)) {};
							break;
							
						case 3:
							System.out.println("Modifying a student into the Application ...");
							break;
						
						case 4:
							System.out.println("Removing a student from the application ...");
							while(!removingStudent(saisie,listOfStudents)) {};
							break;
							
						case 5:
							System.out.println("Displaying list of students by major...");
							break;
							
						case 0:
							System.out.println("Quit the application ...");
							displayAllStudents(listOfStudents);
							System.exit(0);
							break;
						
						
						
					
					}//End of Loop Switch
					
				}while(!done);
			}
				
			}//End of Try
			catch(Exception e) {
				System.out.println("SYSTEM ERROR: " + e.getMessage());
			}
		}
	
		
			
			
		
		 /**
	     * This method displays the main program menu of activities.
	     * It allows only valid options to pass.
	     * 
	     * @param in- the Scanner object
	     * @return option - the activity option selected
	     */
		public static int menuList(Scanner Saisie) {
			int option = 0;
			do
					{
						;
						System.out.println("Please Make A Selection To Proceed :\n	"
											+"Press [1] To Add A Student\n	"
											+"Press [2] To Search A Student\n	"
											+"Press [3] To Modify A Student \n	"
											+"Press [4] To Remove A Student \n	"
											+"Press [5] To Display List Of Students By Major \n	"
											+"Press [0] To Quit The Application \n"				
											);
						 option = Saisie.nextInt();
			        } while (option < 0 || option > 5);
	        return option; 
		}//End Of MenuList

		/**
		 * 
		 * @param listOfStudents
		 */
		public static void displayAllStudents(BinarySearchTree listOfStudents) {
			
			listOfStudents.print();
			
		}
		/**
		 * Function to add a new student to the Binary Search tree
		 * @param saisie - Scanner saisie to avoid to declare it many time along the code
		 * @param listOfStudents - Binary Search Tree name
		 * @return
		 * @throws Exception
		 */
		
		public static boolean addingNewStudent(Scanner saisie, BinarySearchTree listOfStudents) throws Exception {
			
			//Creation of a new instance of Student to contain information through the scanner
			Student studentLambda = new Student();
		
			System.out.println("Enter the Student ID:");
			studentLambda.setStudentId(saisie.nextInt());
			
			System.out.println("Enter the Student name:");
			studentLambda.setStudentName(saisie.next());
			
			System.out.println("Enter the Student Major:");
			studentLambda.setStudentMajor(saisie.next().toUpperCase());
			
			listOfStudents.add(studentLambda);
					
			return true;
		}
		
		/**
		 * 
		 * @param saisie
		 * @param listOfStudents
		 * @return
		 * @throws Exception
		 */
		public static boolean searchStudent(Scanner saisie, BinarySearchTree listOfStudents ) throws  Exception {
			
			
			System.out.println("Enter the Student ID to search:");
			int idToSearch = saisie.nextInt();
			
			Student studentLambda = (Student) new  Student(idToSearch);
			
			if(listOfStudents.find(studentLambda))
				{
				System.out.println("Student with ID" + " " + idToSearch + " " + "was found.");
				System.out.println("Student ID: " + idToSearch);
				System.out.println("Student Name: " );
				System.out.println("Student Major: " + studentLambda.getStudentMajor());

				}
			if(!listOfStudents.find(studentLambda))
				
				System.out.println("Sorry! Student with ID " + " " + idToSearch + " " + "does not appear on Student List");
			return true;
		}

		public static boolean removingStudent(Scanner saisie, BinarySearchTree listOfStudents ) throws  Exception {
		
			System.out.println("Enter the Student ID to remove:");
			int idToRemove = saisie.nextInt();
			
			listOfStudents.remove((int)idToRemove);
			
			/*Student studentLambda = (Student) new  Student(idToRemove);
			
			if(listOfStudents.find(studentLambda))
				{ }*/
			return true;
		}
	}


