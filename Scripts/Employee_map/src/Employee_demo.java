import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;



public class Employee_demo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception
	{
		System.out.println("Begin Employee Map Demo");
		Date date = new Date();
		System.out.println("Date :" + date);
    	System.out.println("Creation of new employee\n");
    	
    	Employee empOne = new Employee();
    	empOne.setEmpNumber((byte)1);
    	empOne.setEmpName("Yapo Sebastien");
    	empOne.setEmpSalary(20000);
    	
    	Employee empTwo = new Employee();
    	empTwo.setEmpNumber((byte)2);
    	empTwo.setEmpName("Asseu Rodrigue");
    	empTwo.setEmpSalary(30000);
    	
    	Employee empThree = new Employee();
    	empThree.setEmpNumber((byte)3);
    	empThree.setEmpName("Sonan Hugues");
    	empThree.setEmpSalary(180000);
    	
    	Employee empFourth = new Employee();
    	empFourth.setEmpNumber((byte)4);
    	empFourth.setEmpName("Yapo Jean-Baptiste");
    	empFourth.setEmpSalary(150000);
    	
    	Employee empFifth = new Employee();
    	empFifth.setEmpNumber((byte)5);
    	empFifth.setEmpName("Brou Mathilde");
    	empFifth.setEmpSalary(200000);
    	
    	
    	// Add the employees to the hashMap 
    	 Map<Byte, Employee> monPersonnel = new HashMap<Byte, Employee>();
    	 monPersonnel.put((Byte)(byte)empOne.getEmpNumber(), empOne);
    	 monPersonnel.put((Byte)(byte)empTwo.getEmpNumber(), empTwo);
    	 monPersonnel.put((Byte)(byte)empThree.getEmpNumber(), empThree);
    	 monPersonnel.put((Byte)(byte)empFourth.getEmpNumber(), empFourth);
    	 monPersonnel.put((Byte)(byte)empFifth.getEmpNumber(), empFifth);
    	 
    	 Set<Map.Entry<Byte, Employee>> employees = monPersonnel.entrySet(); 	
    	
    	 //Display list of employees
    	 System.out.println("Liste of employees \n");
    	for (Map.Entry<Byte, Employee> listEmployee : employees)
    		{
    		byte empkey = listEmployee.getKey();
    		String empName = listEmployee.getValue().getEmpName();
    		double empSalary = listEmployee.getValue().getEmpSalary();
    		
    		System.out.println("Id :" + empkey + " " + "Name : " + empName
					+ " "+ "Salary: " + empSalary );
    		//System.out.println(listEmployee.toString());
    		}
    	/**
    	 * Searching for an existing employee according 
    	 * to the key of the hashMap 
    	 */
    	System.out.println("\n");
    	System.out.println("Searching an existing employee with id number '2' in the hashMap");
    	byte keyToSearch = 2 ;
    	boolean isKeyExist = monPersonnel.containsKey(keyToSearch);
    	
    	if(isKeyExist)
    		{ 
    		System.out.println("Num :" + keyToSearch + "found in the list of employees");
    		System.out.println("" + monPersonnel.get(keyToSearch));
    		
    		}
    	else
    		{System.out.println("Num :" + keyToSearch + "does not exist in the list of employees");}
    	
    	/**
    	 * Searching for a specific value
    	 * 
    	 */
    	
    	System.out.println("\n");
    	System.out.println("Searching list of employees with salary other than 50000 in the hashMap");
    	for (Map.Entry<Byte, Employee> listEmployee : employees)
		{
    		byte key = listEmployee.getKey();
    		double value = listEmployee.getValue().getEmpSalary();
    		
    		if(value >= 50000)
    			{
    			System.out.println("Id :" + listEmployee.getKey() + " " + "Name : " + listEmployee.getValue().getEmpName()
    					+ " "+ listEmployee.getValue().getEmpSalary());
        		
    			}
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
    				monPersonnel.put(empTwo.getEmpNumber(), empTest0);
    		    	 
    		    	
    				case 1: loopCount++;
    				Employee empTest1 = new Employee((byte)3);
    				monPersonnel.put(empTwo.getEmpNumber(), empTest1);
    				empTest1.setEmpName("");
    				
    				case 2: loopCount++;
    				Employee empTest2 = new Employee((byte)4);
    				monPersonnel.put(empTwo.getEmpNumber(), empTest2);
    				empTest2.setEmpSalary(0.0);
    				
    				case 3: loopCount++;
    				Employee empTest3 = new Employee((byte)51);
    				monPersonnel.put(empTwo.getEmpNumber(), empTest3);
    				empTest3.setEmpName("");
    				

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


