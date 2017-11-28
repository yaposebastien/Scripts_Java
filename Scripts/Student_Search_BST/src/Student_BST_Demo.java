
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
							while(!modifyStudent(saisie,listOfStudents)) {};
							break;
						
						case 4:
							System.out.println("Removing a student from the application ...");
							while(!removeStudent(saisie,listOfStudents)) {};
							break;
							
						case 5:
							System.out.println("Displaying list of students by major...");
							break;
							
						case 0:
							displayAllStudents(listOfStudents);
							System.out.println("Quit the application ...");
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
						System.out.println("\nPlease Make A Selection To Proceed :\n	"
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
			
			System.out.println("Current list of Students");
			listOfStudents.print();
			System.out.println("\n");
			
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
			
			Student studentQuidam = (Student) listOfStudents.find(new Student(idToSearch));
			
			if(studentQuidam == null)
				{ System.out.println("The Student with ID:" + " " +idToSearch + " " + "was not found in the system.");}
			else
				{ System.out.println("Student found information : " + " " + studentQuidam.toString());
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
					String name = saisie.next();
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
			
			
			if(listOfStudents.findKey(listOfStudents.find(new Student(idToRemove))))
				{ 
					System.out.println("trouve");
					listOfStudents.remove(new Student(idToRemove));
				
				}
			
			
			return true;
		}
	}


