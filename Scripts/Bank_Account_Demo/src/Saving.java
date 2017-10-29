
public class Saving extends Account {
	
	private static final double MINRATE = 0.03;
	private static final double MAXRATE = 0.065;
	private double interestRate;
	private double accumulInterest;
	
	public Saving(int accountNumber) throws Exception {
		super(accountNumber);
		interestRate = MINRATE;
			
	}
	
	public void setInterestRate(double rate) throws Exception
	{
		if(rate <= MAXRATE) {
			interestRate = rate;
			accumulInterest +=(getBalance()*rate) ;
		}
		
		else
			throw new Exception("Interest rate exceeds the maximum");
	}
	
	public void withdraw(double amount) throws Exception
	{
		if(amount <= getBalance()) {
			accountBalance -= amount;
		}
		else throw new Exception("Invalid Withdraw! Withdraw must be grater than your current balance");
			
	}

	
	@Override
	public String toString()
	{
		return super.toString() + String.format(" Interest rate : %.2f%s Accumulated Interest paid" 
												+" : %.2f",  (interestRate*100), "%",accumulInterest );
	}
}
