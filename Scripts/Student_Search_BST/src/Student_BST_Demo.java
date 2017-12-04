
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
		int optionUser ;
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
							displayAllStudents(listOfStudents);
							pause();
							break;
						
						case 2:
							System.out.println("Searching a student to the Application ...");
							while(!searchStudent(saisie,listOfStudents)) {};
							displayAllStudents(listOfStudents);
							pause();
							break;
							
						case 3:
							System.out.println("Modifying a student into the Application ...");
							while(!modifyStudent(saisie,listOfStudents)) {};
							displayAllStudents(listOfStudents);
							pause();
							break;
						
						case 4:
							System.out.println("Removing a student from the application ...");
							while(!removeStudent(saisie,listOfStudents)) {};
							displayAllStudents(listOfStudents);
							pause();
							break;
							
						case 5:
							System.out.println("Displaying list of students by major...");
							while(!displayStudentsByMajor(saisie,listOfStudents)) {};
							displayAllStudents(listOfStudents);
							pause();
							break;
							
						case 6:
							displayAllStudents(listOfStudents);
							System.out.println("End of the application ...");
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
						
						System.out.println("\nPlease Make A Selection To Proceed :\n	"
											+"Press [1] To Add A Student\n	"
											+"Press [2] To Search A Student\n	"
											+"Press [3] To Modify A Student \n	"
											+"Press [4] To Remove A Student \n	"
											+"Press [5] To Display List Of Students By Major \n	"
											+"Press [6] To Quit The Application \n"				
											);
						 option = Saisie.nextInt();
			        } while (option < 0 || option > 6);
	        return option; 
		}//End Of MenuList

		/**
		 * 
		 * @param listOfStudents
		 */
		public static void displayAllStudents(BinarySearchTree listOfStudents) {
			
			if(listOfStudents.size() > 0)
			{
				System.out.println("\n Total Of Students: " +listOfStudents.size());
				listOfStudents.print();
				System.out.println("\n");	
			}
			
			
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
			String name = "";
			/**
			 * This block allows the user to enter a long String with space between
			 */
			while(saisie.hasNext()){
				name = saisie.nextLine();
				if(name.contains(" ")) {break;}
			}
			studentLambda.setStudentName(name);
		
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
			
			Student studentQuidam = (Student) listOfStudents.find(new Student(idToSearch));
			
			if(studentQuidam == null)
				{ System.out.println("The Student with ID:" + " " +idToSearch + " " + "was not found in the system.");}
			else
				{ System.out.println("\nStudent found information : " + " " + studentQuidam.toString());
					System.out.println("\n");
				}
					
			return true;
		}
		
		/**
		 * 
		 * @param saisie
		 * @param listOfStudents
		 * @return
		 * @throws Exception
		 */
		public static boolean modifyStudent(Scanner saisie, BinarySearchTree listOfStudents) throws Exception {
			
			System.out.println("Enter the Student ID to modify:");
			int idToModify = saisie.nextInt();
			
			Student studentQuidam = (Student) listOfStudents.find(new Student(idToModify));
			
			if(studentQuidam == null)
				{ System.out.println("Sorry! The Student with ID:" + " " +idToModify + " " + "can not be modify."); }
			else
				{
					System.out.println("Enter student's new name:");
					String name = "";
					/**
					 * This block allows the user to enter a long String with space between
					 */
					while(saisie.hasNext()){
						name = saisie.nextLine();
						if(name.contains(" ")) {break;}
					}
					studentQuidam.setStudentName(name);
					
					System.out.println("Enter student's new major:");
					String major = saisie.next();
					studentQuidam.setStudentMajor(major.toUpperCase());
					
					System.out.println("The Student with ID : " + " " +idToModify + " "
							+ "and new name " + " " + studentQuidam.getStudentName() + " "
							+ "and new major " + " " + studentQuidam.getStudentMajor() + " "
							+ "has been updated");
				}
			
			return true;
		}

		/**
		 * 
		 * @param saisie
		 * @param listOfStudents
		 * @return
		 * @throws Exception
		 */
		public static boolean removeStudent(Scanner saisie, BinarySearchTree listOfStudents ) throws  Exception {
		
			System.out.println("Enter the Student ID to remove:");
			int idToRemove = saisie.nextInt();
			
			
			if(listOfStudents.findKey( new Student(idToRemove)))
				{ 
					listOfStudents.remove(new Student(idToRemove));
				}
			else
				{ System.out.println("Sorry! this student ID " + " " +idToRemove + " " + "does not exist in the list");}
			return true;
		}
		
		public static boolean displayStudentsByMajor(Scanner saisie, BinarySearchTree listOfStudents) {
			
			System.out.println("Enter the major of list of students :");
			String major = saisie.next().toUpperCase();
			
			ArrayList<Object> listOfStudentsByMajor = new ArrayList<Object>();
			listOfStudentsByMajor = listOfStudents.getList();
			
			System.out.println("\nMAJOR: " +major + "\n");
			int count = 0;
			for(Object listByMajor: listOfStudentsByMajor){
				
				if(((Student) listByMajor).getStudentMajor().contains(major))
				{
					count++;
					System.out.println("ID: " +((Student) listByMajor).getStudentId() + " " 
										+ "Name: " +((Student) listByMajor).getStudentName() + " "
										
							);
				}
		   }	
			System.out.println("\n");
			System.out.println("Total students enrolled in " + " " + major + " is: " + " " + count);
			return true;
		}
		
		/**
		* This method pauses processing until the user enters any key
		*/
		public static void pause() throws IOException
		{
		System.out.print("Press Enter key to continue: ");
		char c = (char) System.in.read();
		}
	}


