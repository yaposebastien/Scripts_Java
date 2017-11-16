
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Date;
import java.util.ListIterator;


public class Log_Tomcat_Demo {

	private static Scanner saisie;
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		Date dateSystem = new Date();
		
		/**
		 * This following line allows the creation of a LinkedList of 
		 * objects class Log, but needs to import the LinkedList Library first
		 */
		LinkedList<Log_Tomcat> LogTomcat = new LinkedList<Log_Tomcat>();
		LogTomcat.add(new Log_Tomcat("10.10.10.1","www.yahoo.com"));
		LogTomcat.add(new Log_Tomcat("8.8.8.8","www.google.com"));
		LogTomcat.add(new Log_Tomcat("208.95.248.40","www.nkeyapo.com"));
		LogTomcat.add(new Log_Tomcat("204.108.245.114","www.dccc.edu"));
		LogTomcat.add(new Log_Tomcat("169.54.177.64","www.abidjan.net"));
		
		
		Scanner in = new Scanner(System.in);
        boolean done = false;
        int optionUser;
        
        System.out.println("Begin Of Demo Collection Log IP address. \n");
    			try
    			{
    				{
 
    					do
    					{
    						displayAllLogs(LogTomcat);
    						optionUser = menuList(in);
        		            in.nextLine();
        		            
        					
        					switch(optionUser) {
        					
        					case 1: 
        						System.out.println("\f");
        						System.out.println("Adding a new log to the Log file ....");
        						while(!addingLog(LogTomcat)) {};                       
                                break;
        						
        					case 2: 
        						System.out.println("\f");
        						System.out.println("Selecting a specific log from the Log file ....");
        						while(!selectingLog(LogTomcat)) {};
        						break;
        						
        					case 3:
        						System.out.println("\f");
        						System.out.println("Modifying a specific log from the Log file ....");
        						while(!changingLog(LogTomcat)) {};
        						break;
        						
        					case 4: 
        						System.out.println("\f");
        						System.out.println("Delete a specific entry of the Log file ....");
        						while(!removingLog(LogTomcat)) {};
        						displayAllLogs(LogTomcat);
        						break;
        						
        					case 0:
        						System.out.println("\n End of Class of Collection Log ");
        						System.exit(0);
        						break;
	
        				}// End of Switch Statement
    						
    						
    				}while(!done);
  
    			}
    				
    		}
    			catch(Exception e)
    			{
    				System.out.println(e.getMessage());
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
		int optionUser = 0;
		do
		{
			System.out.println("\f");
			System.out.println("Please Make A Selection To Proceed :\n	"
								+"Press [1] To Add A Log\n	"
								+"Press [2] To Display A Log\n	"
								+"Press [3] To Modify A Log \n	"
								+"Press [4] To Delete A Log \n	"
								+"Press [0] To Quit The Application \n"				
								);
			 optionUser = saisie.nextInt();
        } while (optionUser < 0 || optionUser > 4);
        return optionUser; 
	}

	
	/**
	 * Function to display all the elements of the linkedList of logs
	 * @param listLogs
	 */
	public static void displayAllLogs(LinkedList<Log_Tomcat> listLogs) {
		
		if(listLogs.size() == 0) 
			{System.out.println("Empty Log file.");
			}
		
		if(listLogs.size() > 0) {
		System.out.println("Displaying the current content of Log file");
		for (Log_Tomcat allLogs : listLogs) {
			System.out.println("Index:" + " " + listLogs.indexOf(allLogs) +  allLogs +  "\n");
			}
		}
		
		
	
	}
	/**
	 * Function to add a log to the file
	 * @param listLogs
	 * @throws Exception
	 */
	public static boolean addingLog(LinkedList<Log_Tomcat> listLogs) throws Exception {
		
		Scanner saisie = new Scanner(System.in);
		System.out.println("Enter the IP address of new log :");
		String ipAdded = saisie.nextLine(); 
		System.out.println("Enter the content of new log :");
		String contextAdded = saisie.nextLine();
		listLogs.add(new Log_Tomcat(ipAdded,contextAdded));
		System.out.println("\f");
		System.out.println("Your new log  " + " " + " with IP address " + " " +ipAdded 
				+ "and content  " + " " + contextAdded + " " + "was successfully added \n");
		return true;
	}
	
	/**
	 * Function select a specific log and display it
	 * @param listLogs
	 * @throws Exception
	 */
	public static boolean selectingLog(LinkedList<Log_Tomcat> listLogs) throws Exception {
		Scanner saisie = new Scanner(System.in);
		System.out.println("Enter the log to display");
		String toDisplay = saisie.nextLine();
		
		for(Log_Tomcat objectDisplay : listLogs) {
			if(objectDisplay.getAddress().equalsIgnoreCase(toDisplay))
				{
				System.out.println("Printing the details of searched log .... ");
				System.out.println("Details of IP address searched : " + " " + toDisplay);
				System.out.println("Date of access was : "+ " " +objectDisplay.getDate());
				System.out.println("Context of IP was : " + " " + objectDisplay.getContext() );
				
				break;
			   }
		}
		
		return true;
		
	}

	/**
	 * Function almost similar to selecting but it removes a log
	 * @param listLogs
	 * @throws Exception
	 */
	public static boolean removingLog(LinkedList<Log_Tomcat> listLogs) throws Exception {
		saisie = new Scanner(System.in);
		System.out.println("Enter the index of the log to delete :");
		int toDelete = saisie.nextInt();
		if(toDelete >= 0 && toDelete < listLogs.size())
			{listLogs.remove(toDelete);}
		else
			{System.out.println("Sorry!" + toDelete + " " + " is an invalid index of log");}
		
		/**This following portion of code can just only delete
		 * by typing the IP address of the Log
		 * 
		 */
		
		/*for(Log_Tomcat objectDelete : listLogs) {
			if(objectDelete.getAddress().equalsIgnoreCase(toDelete)) 
				{
					listLogs.remove(objectDelete);
					System.out.println("Your log " + " " + toDelete + " " + "was successfully deleted");
					break;
			   }
			if(!(objectDelete.getAddress().equalsIgnoreCase(toDelete))) 
				{ System.out.println("Sorry! This IP address " + " "+ toDelete + " " + "does  not belong to the log file");
					break;
				}
		}*/
		return true;
	}
		/**
		 * Function to select a log and modify its value.
		 * @param changedLog
		 * @throws Exception
		 */
		public static boolean changingLog(LinkedList<Log_Tomcat> changedLog) throws Exception {
			Scanner saisie = new Scanner(System.in);
			System.out.println("Enter log to change :");
			String toChange = saisie.next();
			
			for(Log_Tomcat objectDisplay : changedLog) {
				if(objectDisplay.getAddress().equalsIgnoreCase(toChange))
					{
					System.out.println("This is the current value of your log " );
					System.out.println("Details of your log : " + " " + toChange);
					System.out.println("Date : "+ " " +objectDisplay.getDate());
					System.out.println("Your context : " + " " + objectDisplay.getContext() );
					objectDisplay.setDate();
					System.out.println("Enter new Ip address :");
					objectDisplay.setAddress(saisie.next());
					System.out.println("Enter new content :");
					objectDisplay.setContext(saisie.next());
					System.out.println("Your changes have been process with succes");
					
					break;
				   }
					
				}
				return true;
		}	
	}

