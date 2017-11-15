import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;



public class Log_Tomcat implements Comparable<Log_Tomcat>  {
	
	private String addressLog;
	private String dateLog;
	private String contextLog;
	
	/**
	 * Default constructor for the class Log_Tomcat
	 * 
	 */
	
	public Log_Tomcat() {
		
		addressLog = "";
		dateLog = "";
		contextLog = "";
	}
	
	/**
	 * Constructs class Log_Tomcat with parameters
	 * @param address
	 * @param date
	 * @param context
	 * @throws Exception
	 */
	
	public Log_Tomcat(String address, String context) throws Exception {
		
		setAddress(address);
		setDate();
		setContext(context);
	}
	
	/**
	 * List of Setters and Getters for the class Log_Tomcat
	 * setAddress()
	 * 
	 */
	
	
	/**
	 * Set the IP address of the log
	 * @param address - IP address
	 * @throws Exception
	 */
	public void setAddress(String address) throws Exception {
		
		if(address.length() >= 7 && address.length() <= 15)
			{ addressLog = address; }
		else
			{ throw new Exception("Sorry!" +address +" "+ "is not a valid ip address"); }
	}
	
	/**
	 * Set the date of the log 
	 * @param date
	 * @throws Exception
	 */
	public void setDate() throws Exception {
		
		SimpleDateFormat dateSystem = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss aa");
		dateLog = dateSystem.format(new Date());
	
	}
	
	/**
	 * Set the context of the log 
	 * @param context
	 * @throws Exception
	 */
	public void setContext(String context) throws Exception {
		
		if(context == "")
		{ throw new Exception("The context of the log must not be an empty string"); }
	else
		{ contextLog = context;}
	}
	
	/**
	 * 
	 * @return IP address
	 */
	public String getAddress() {
		return addressLog;
	}
	
	/**
	 * 
	 * @return date of the log 
	 */
	public String getDate() {
		return dateLog;
	}

	/**
	 * 
	 * @return
	 */
	public String getContext() {
		return contextLog;
	}
	

	
	/**
	 * 
	 * @param Obj
	 * @return
	 */
	@Override
	public int compareTo(Log_Tomcat otherLog) {
		return (addressLog.compareTo(otherLog.getAddress()));
	}
	/**
	 * toString to display a log
	 */
	@Override
	public String toString() {
		return String.format(" " + "--" + " " + "IP address: %s -- Date: %s -- Context: %s ", addressLog, dateLog, contextLog);
	}
		
}

