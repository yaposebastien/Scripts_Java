
public abstract class Account {

	protected int accountNum;
	protected double accountBalance;
	
	public Account(int account) throws Exception
	{
		if(account > 0) 
		{
			accountNum = account;
		}
		else
		{
			throw new Exception("Invalid account number! Please enter a positive account number"); 
		}
		accountBalance = 0;
		
	}
	
	public int getAccountNum()
	{
		return accountNum;
	}
	
	public double getBalance()
	{
		return accountBalance;
	}

	
	public void deposit(double amountDeposit) throws Exception 
	{
		
		if(amountDeposit > 0) 
		{
			accountBalance += amountDeposit;
		}
		else
		{
			throw new Exception("Invalid deposit! Deposit must be grater than zero");
		}
	}		
	
	public abstract void withdraw(double amountWithdraw ) throws Exception;
	@Override
	public String toString() {
		return String.format("Account number: %d Balance: $%.2f ", accountNum, accountBalance);
	}

}

