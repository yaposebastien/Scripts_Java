/*
 * An Employee class with empNumber, empName, and empSalary
 */
public class Employee {

	private byte empNumber;
	private String empName;
	private double empSalary;
	
	/**
	 * Constructs an employee with 0.0 as salary
	 * @param number : the number of the employee
	 * @throws Exception according to employee number greater than 0 and less 50
	 */
	public Employee(byte number) throws Exception {
		
		if(number >= 0 && number <= 50)
			{setEmpNumber(number);}
		else
			{throw new Exception("Invalid number! Please enter a number greater than 0 and less or equal to 50");}
		empName = "";
		empSalary = 0.0;	
	}
	
	/**
	 * Construct an Employee
	 * @param number : the number of the employee
	 * @param name : the name of the employee
	 * @param salary : the salary of the employee
	 * @throws Exception
	 */
	
	/**
	 * Default constructor
	 * @param number
	 * @param name
	 * @param salary
	 * @throws Exception
	 */
	public Employee(byte number, String name, double salary) throws Exception {
		setEmpNumber(number);
	}
	
	//List of set Methods for 
	/**
	 * 
	 * @param number
	 * @throws Exception
	 */
	public void setEmpNumber(byte number) throws Exception {
		
		if(number > 0 && number <= 50)
			{empNumber = number;}
		else
			{throw new Exception("Invalid number! Please enter a number greater than 0 and less or equal to 50");}
	}
	public void setEmpName(String name) throws Exception  {
		if(name.length() != 0)
			{empName= name; }
		else
			{throw new Exception("Sorry! The name of emplyee must not be an empty string");}
	}
	public void setEmpSalary(double salary) throws Exception {
		if(salary > 0 && salary <= 200000)
			{empSalary=salary;}
		else
			{ throw new Exception("Invalid input!Please enter an employee's salary greater than 0 and less $200,000");}
	}
	//List of get Methods for the project 
	
	/**
	 * Gets the employee's number
	 * @return empNumber - the employee's number
	 */
	public byte getEmpNumber() {
		return empNumber;
	}
	/**
	 * Gets the employee's name
	 * @return empName - the employee's name
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * Gets the employee's salary
	 * @return empSalary - the employee's salary
	 */
	public double getEmpSalary() {
		return empSalary;
	}
	@Override
	public String toString() {
		return String.format("EMPLOYEE INFOS:\n Num: %d Name: %s Salary: %.2f ", empNumber, empName, empSalary);
	}
	
}
