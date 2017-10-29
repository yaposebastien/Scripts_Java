
public class Checking extends Account {

	private double loan;
	private boolean overdraft;
	//private int numberWithdraw;
	
	public Checking(int account, boolean overdraft) throws Exception {
		super(account);
		
		this.overdraft = overdraft;
		this.loan = 0;
		//numberWithdraw = 0;
		
	}
	public Checking(int accountNum) throws Exception {
		
		super(accountNum);
	}
	public void setOverdraft(boolean over){
		
			this.overdraft = over;
	}
	public boolean getOverdraft() {
		return overdraft;
	}
	
	public double getLoan() {
		return loan;
	}

	
	public void withdraw(double amountWithdraw) throws Exception 
	{
		 payCheck(0,  amountWithdraw);
	}	
		
	
	public void deposit(double amount) throws Exception 
	{
		double realDeposit = 0.0;
		double realAmount = 0.0;
		if(amount <= 0.0)
		{
			throw new Exception("Invalid deposit! Deposit must be grater than zero");
		}
		if(loan > 0.0)
		{
			
			realDeposit = amount - loan;
			realAmount = amount - realDeposit;
			loan -= realAmount;
		}
		else
			realDeposit = amount;
		super.deposit(realDeposit);
		
	}
	public String modifyOverdraft()
	{
		overdraft = !overdraft;
		return ("Your current overdraft status %s:" + overdraft);
	}

	public String payCheck(int checkNum, double amtCheck) throws Exception{
		
		if(amtCheck <= 0.0)
		{
			throw new Exception("Invalid amount for check! Deposit for check must be grater than zero");
		}
		
		if(amtCheck <= accountBalance ) {
			
			accountBalance -= amtCheck;
			return String.format("Check Number %d amount paid $ %.2f ",checkNum, amtCheck);
		}
		
		if(overdraft) {
			loan += amtCheck - accountBalance;
			accountBalance = 0.0;
			return String.format("Check Number %d amount paid $ %.2f ",checkNum, (amtCheck - accountBalance));
		}
		
		
		throw new Exception("Insufficient funds for check");
	}
	
	@Override
	public String toString()
	{
		if(loan >= 0.0 ){
			return super.toString() + String.format(" - Loan: %s %.2f", overdraft, loan);
		}
		else
		return null;
	}
	
}
