
public class Bank_test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		System.out.println("Begin Bank Accounts Demo");
    	System.out.println("Creation of new bank account, Checking and saving account\n");
    	
    	//Saving Operations 
    	System.out.println("Set interest rate to 6.5%, deposit 800, withdraw 150:");
    	Saving savingOne = new Saving(101);
    	savingOne.deposit(800.00);
    	savingOne.deposit(800.00);	
    	savingOne.withdraw(150);
    	savingOne.setInterestRate(0.065);
    	System.out.println(savingOne.toString());
    	
    	//Checking operations
    	Checking checkingOne = new Checking(101);
    	checkingOne.deposit(1000);
    	checkingOne.modifyOverdraft();
    	checkingOne.deposit(3000);
    	checkingOne.payCheck(2, 450);
    	checkingOne.withdraw(6000);
    	System.out.println(checkingOne.toString());
    	
    	
    	
    	
    	System.out.println("\n Testing all exceptions of Class Product");
		int loopCount = 0;
		boolean done = false;
		do
		{
			try
			{
			
				switch(loopCount)
				{
				//EXception for Saving Account
				case 0: loopCount++;
				Saving savingTwo = new Saving(0);
				case 1: loopCount++;
				savingOne.withdraw(2000.00);
				case 2: loopCount++;
				savingOne.setInterestRate(0.075);
				
				//Exception for checking Account
				case 3: loopCount++;
				Checking checkingTwo = new Checking(0);
				case 4: loopCount++;
				Checking checkingThree = new Checking(102);
				checkingThree.withdraw(200);
				case 5 : loopCount++;
				Checking checkingFour = new Checking(102);
				checkingFour.deposit(500);
				checkingFour.withdraw(1000);
				case 6 : loopCount++;
				checkingOne.payCheck(3, 0);
					
				default : done = true;	
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		} while(!done);

		System.out.println("\nEnd of Bank Class Implementation");
		return;
	}

	}



