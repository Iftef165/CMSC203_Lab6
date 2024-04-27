package labWorkFinal;

public class CheckingAccount extends BankAccount{
	private static double FEE  =15;
	
	public CheckingAccount(String name,double amount)
	{
		super(name,amount);
		setAccountNumber(getAccountNumber()+"-10");
	}

	public boolean withdraw(int amount)
	{
		if((amount-15)<=getBalance())
		{
			setBalance(amount-15);
		}
		else
		{
			return false;
		}
		return true;
	}

}
