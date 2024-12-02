
public class SavingsAccount extends BankAccount {
	private final static double rate = 0.025;
	
	private int savingsNumber = 0;
	
	private String accountNumber;
	
	public SavingsAccount(String name, double balance)
	{
		super(name,balance);
		
		setAccountNumber(getAccountNumber() + "-"+savingsNumber);
	}
	
	public SavingsAccount(SavingsAccount original, double balance)
	{
		super(original.getOwner(), balance);
		
		this.savingsNumber =  original.savingsNumber + 1;
		this.accountNumber =  super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest()
	{
		double interest = (rate/12) * getBalance();
		
		deposit(interest);
	}
	
	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	

}
