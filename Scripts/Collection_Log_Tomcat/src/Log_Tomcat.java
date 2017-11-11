import java.util.Date;


public class Log_Tomcat {
	
	private String addressLog;
	private Date dateLog;
	private String contextLog;
	
	/**
	 * Default constructor for the class Log_Tomcat
	 * 
	 */
	
	public Log_Tomcat() {
		addressLog = "";
		dateLog = null;
		contextLog = "";
		
	}
	
	/**
	 * Constructs class Log_Tomcat with parameters
	 * @param addressLog
	 * @param dateLog
	 * @param contextLog
	 * @throws Exception
	 */
	
	public Log_Tomcat(String addressLog, Date dateLog, String contextLog) throws Exception {
		
		this.addressLog = addressLog;
		this.dateLog = dateLog;
		this.contextLog = contextLog;
	}
	
	/**
	 * List of Setters and Getters for the class Log_Tomcat
	 */
	
	public void setAddress(String address) throws Exception {
		
		if(address.length() <= 7 && address.length() > 32)
			{ throw new Exception("The Ip address must not be an empty string"); }
		if(address == "")
		{ throw new Exception("The Ip address must not be an empty string"); }
		else
			{ throw new Exception(""); }
	}

}
