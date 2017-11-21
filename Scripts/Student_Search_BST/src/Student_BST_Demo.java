
import java.util.Scanner;


public class Student_BST_Demo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
			
		BinarySearchTree StudentBst = new BinarySearchTree();
		
		
		StudentBst.add(new Student(1,"Yapo JB", "CIS"));
		StudentBst.add(new Student(2,"Asseu Rodrigue", "NET"));
		StudentBst.add(new Student(3,"N'depo Paul", "EGR"));
		
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
					displayAllStudents(StudentBst);
					optionUser = menuList(saisie);
					saisie.nextLine();
					
						switch(optionUser) {
					
						case 1:
							System.out.println("Adding a new student to the Application ...");
							while(!addingNewStudent(StudentBst)) {};
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
		 * @param StudentBst
		 */
		public static void displayAllStudents(BinarySearchTree StudentBst) {
			
			StudentBst.print();
			
		}
		
		public static boolean addingNewStudent(BinarySearchTree StudentBst) throws Exception {
			
			int id;
			
			String major;
			
			Scanner Saisie = new Scanner(System.in);
			Student studentLambda = new Student();
		
			System.out.println("Enter the Student ID:");
			studentLambda.setStudentId(Saisie.nextInt());
			
			System.out.println("Enter the Student name:");
			studentLambda.setStudentName(Saisie.next());
			
			System.out.println("Enter the Student Major:");
			studentLambda.setStudentMajor(Saisie.next().toUpperCase());
			
			
			/*studentLambda.setStudentId(id);
			studentLambda.setStudentName(name);
			studentLambda.setStudentMajor(major);*/
			
			StudentBst.add(studentLambda);
					
			//StudentBst.add(new Student(id,name,major));
			
			return true;
		}


		
	}


