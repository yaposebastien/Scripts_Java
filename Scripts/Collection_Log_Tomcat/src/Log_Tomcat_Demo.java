
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
		
		LogTomcat.add(new Log_Tomcat(1,"10.10.10.1",dateSystem,"www.yahoo.com"));
		LogTomcat.add(new Log_Tomcat(2,"8.8.8.8",dateSystem,"www.google.com"));
		LogTomcat.add(new Log_Tomcat(3,"208.95.248.40",dateSystem,"www.nkeyapo.com"));
		LogTomcat.add(new Log_Tomcat(4,"204.108.245.114",dateSystem,"www.dccc.edu"));
		LogTomcat.add(new Log_Tomcat(5,"169.54.177.64",dateSystem,"www.abidjan.net"));
			
       	
    		
    		
    			try
    			{
    				
    				
    				{
    					//Calling function displayAllLogs to print the list of logs
    					displayAllLogs(LogTomcat);
    					
    					//Calling function to print the menu of the application 
    					System.out.println(menuList());
    					
    					//Adding
    					addingLog(LogTomcat);
    					displayAllLogs(LogTomcat);
    					System.out.println(menuList());

    					
    				}
    			}
    			catch(Exception e)
    			{
    				System.out.println(e.getMessage());
    			}
    			
    		

    		System.out.println("\nEnd of EmployeeMap Class Implementation");
		

	}
	
	
	/**
	 * Function to set and display the menu
	 * @return
	 */
	public static String menuList() {
		String headMenu = "Select an action to proceed[or Q to Quit] ";
		String add = "[A]dd new a log ";
		String select = "[S]elect a log";
		String change = "[C]hange a log";
		String delete = "[D]elete a log";
		String quit = "[Q]uit log app\n";
		
		return String.format("%s" + "\n"
		+"%20s" + "\n"
		+"%18s" + "\n" 
		+"%18s" + "\n"
		+"%18s" + "\n"
		+"%19s",headMenu, add, select, change, delete, quit);
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
	
	public static void addingLog(LinkedList<Log_Tomcat> listLogs) throws Exception {
		int pos = 0;
		String ip="";
		Date dateip=null;
		String context;
		Scanner saisie = new Scanner(System.in);
		System.out.println("Enter position of log :");
		pos = saisie.nextInt();
		System.out.println("Enter the IP address of log");
		ip = saisie.next();
		Date dateSystem = new Date();
		dateip = dateSystem;
		System.out.println("Enter the context :");
		context = saisie.next();
		listLogs.add(new Log_Tomcat(pos,ip,dateip,context));
	}

	@Override
	public int compareTo(Log_Tomcat arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
