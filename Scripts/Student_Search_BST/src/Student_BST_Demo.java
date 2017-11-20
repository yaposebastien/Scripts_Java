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
			do
			{
				//Calling Method to display all Students
				displayAllStudents(StudentBst);
				optionUser = menuList(saisie);
				saisie.nextInt();
				
				switch(optionUser) {
				
				case 1:
					StudentBst.add(new Student(0,"Yapo JB", "CIS"));
					break;
				
				}//End of Loop Switch
				
			}while(!done);
			
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
		public static int menuList(Scanner saisie) {
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
						 option = saisie.nextInt();
			        } while (option < 0 || option > 5);
	        return option; 
		}//End Of MenuList
		
		public static void displayAllStudents(BinarySearchTree StudentBst) {
			StudentBst.print();
			
		}
		
		


		
	}


