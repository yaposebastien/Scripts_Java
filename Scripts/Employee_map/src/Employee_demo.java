import java.util.HashSet;
import java.util.Set;


public class Employee_demo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception
	{
		System.out.println("Begin Employee Map Demo");
    	System.out.println("Creation of new employee, Checking\n");
    	
    	Employee empOne = new Employee((byte)1);
    	empOne.setEmpName("Yapo Sebastien");
    	empOne.setEmpSalary(100000);
    	
    	Employee empTwo = new Employee((byte)2 );
    	empTwo.setEmpName("Asseu Rodrigue");
    	empTwo.setEmpSalary(120000);
    	
    	
    	
    	
    	// Add the employees to the hashMap 
    	 Set<Employee> employees = new HashSet<Employee>();
    	 	employees.add(empOne);
    	 	employees.add(empTwo);
    	 	
    	 	
    	//Display list of employees
    	for (Employee listEmployees : employees)
    		{
    		System.out.println(listEmployees.toString());
    	    System.out.println();
    		}
    	
       	System.out.println("\n Testing all exceptions of Class Employee");
    		int loopCount = 0;
    		boolean done = false;
    		do
    		{
    			try
    			{
    			
    				switch(loopCount)
    				{
    				//EXception for Employee
    				case 0: loopCount++;
    				Employee empTest0 = new Employee((byte)0);
    				employees.add(empTest0);
    		    	
    				case 1: loopCount++;
    				Employee empTest1 = new Employee((byte)51);
    				employees.add(empTest1);
    				
    				case 2: loopCount++;
    				Employee empTest2 = new Employee((byte)3);
    				employees.add(empTest2);
    				empTest2.setEmpName("");
    		    	
    				case 3: loopCount++;
    				Employee empTest3 = new Employee((byte)3);
    				employees.add(empTest3);
    				empTest3.setEmpSalary(0);
    				
    				case 4: loopCount++;
    				Employee empTest4= new Employee((byte)3);
    				employees.add(empTest4);
    				empTest4.setEmpSalary(200001);
    				default : done = true;	
    				}
    			}
    			catch(Exception e)
    			{
    				System.out.println(e.getMessage());
    			}
    			
    		} while(!done);

    		System.out.println("\nEnd of EmployeeMap Class Implementation");
    		return;
    	
    	
    	
    	
    	
	}// End of Public Static void
       
       		
}//End of Class Employee_demo


