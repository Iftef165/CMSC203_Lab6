package labWorkFinal;

public class SavingsAccount extends BankAccount{
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount)
	{
		super(name,amount);
		accountNumber = super.getAccountNumber()+"-"+savingsNumber;
		savingsNumber++;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount)
	{
		super(oldAccount,amount);
		this.savingsNumber = oldAccount.savingsNumber+1;
		this.accountNumber = super.getAccountNumber()+"-"+oldAccount.savingsNumber; 
	}
	
	public void postInterest()
	{
		double monthlyRate = 2.5/12;
		double balanceMonthlyRate = getBalance()*monthlyRate;
		setBalance(getBalance()+balanceMonthlyRate);
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
}
