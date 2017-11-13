
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Date;
import java.util.ListIterator;


public class Log_Tomcat_Demo implements Comparable<Log_Tomcat> {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		System.out.println("Demo implementation of LinkedList with Java \n");
		Date dateSystem = new Date();
		
		/**
		 * This following line allows the creation of a LinkedList of 
		 * objects class Log, but needs to import the LinkedList Library first
		 */
		LinkedList<Log_Tomcat> LogTomcat = new LinkedList<Log_Tomcat>();
		
		LogTomcat.add(new Log_Tomcat(1,"10.10.10.1","www.yahoo.com"));
		LogTomcat.add(new Log_Tomcat(2,"8.8.8.8","www.google.com"));
		LogTomcat.add(new Log_Tomcat(3,"208.95.248.40","www.nkeyapo.com"));
		LogTomcat.add(new Log_Tomcat(4,"204.108.245.114","www.dccc.edu"));
		LogTomcat.add(new Log_Tomcat(5,"169.54.177.64","www.abidjan.net"));
			
       	
    		
    		
    			try
    			{
    				
    				
    				{
    					int doYouWantQuit = 0;
    					do {
    						
    						Scanner saisie = new Scanner(System.in);
    						//Calling function displayAllLogs to print the list of logs
        					displayAllLogs(LogTomcat);
        					
        					//Calling function to print the menu of the application 
        					System.out.println(menuList());
        					
        					int userAnswer = saisie.nextInt();
        					switch(userAnswer) {
        					case 1: 
        						addingLog(LogTomcat);
        						displayAllLogs(LogTomcat);
        						System.out.println(menuList());
        						userAnswer = saisie.nextInt();
        						break;
        						
        					}
        					
    						
    					}while(doYouWantQuit !=0);
    				}
    			}
    			catch(Exception e)
    			{
    				System.out.println(e.getMessage());
    			}
    			
    		

    		System.out.println("\n End of Class of Collection Log ");
		

	}
	
	
	/**
	 * Function to set and display the menu
	 * @return
	 */
	public static String menuList() {
		String headMenu = "Please Make A Selection To Proceed : \n ";
		String add = "Press [1] To Add A Log ";
		String select = "Press [2] To Display A Log";
		String change = "Press [3] To Modify A Log";
		String delete = "Press [4] To Delete A Log";
		String quit = "Press [0] To Quit The Application\n";
		
		return String.format("%s" + "\n"
		+"%s" + "\n"
		+"%s" + "\n" 
		+"%s" + "\n"
		+"%s" + "\n"
		+"%s",headMenu, add, select, change, delete, quit);
		
		
		    
	}
	
	/**
	 * Function to display the elements of the linkedList of logs
	 * @param listLogs
	 */
	public static void displayAllLogs(LinkedList<Log_Tomcat> listLogs) {
		
		for (Log_Tomcat allLogs : listLogs) {
			System.out.println(allLogs + "\n");
		}
	}
	/**
	 * 
	 * @param listLogs
	 * @throws Exception
	 */
	public static void addingLog(LinkedList<Log_Tomcat> listLogs) throws Exception {
		int pos = 0; String ip=""; String context;
		
		
		Scanner saisie = new Scanner(System.in);
		System.out.println("Enter position of log :");
		pos = saisie.nextInt();
		System.out.println("Enter the IP address of log");
		ip = saisie.next();
		System.out.println("Enter the context :");
		context = saisie.next();
		listLogs.add(new Log_Tomcat(pos,ip,context));
	}
	
	public static void selectingLog(LinkedList<Log_Tomcat> listLogs) throws Exception {
		Scanner saisie = new Scanner(System.in);
		int logToSelect = 0;
		System.out.println("Enter the number of the log :");
		logToSelect = saisie.nextInt();
		//if(listLogs.contains(logToSelect))
			//{ System.out.println(listLogs(logToSelect));}
		
	}

	@Override
	public int compareTo(Log_Tomcat arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
