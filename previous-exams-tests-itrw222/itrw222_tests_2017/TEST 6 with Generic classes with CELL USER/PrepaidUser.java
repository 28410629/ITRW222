public class PrepaidUser extends CellUser 
{
	private int dataBalance;
	private int minutesBalance;
	private int amountBalance;
	
	public PrepaidUser()
	{
		super();
		dataBalance = 0;
		minutesBalance = 0;
		amountBalance = 0;
	}
	
	public PrepaidUser(String cn,String add1,String add2,int pc, String sp, String cnr, int dataBalance, int minutesBalance, int amountBalance)
	{
		super(cn, add1, add2, pc, sp, cnr);
		setDataBalance(dataBalance);
		setMinutesBalance(minutesBalance);
		setAmountBalance(minutesBalance);
	}
	
	public void setDataBalance(int db)
	{
		dataBalance = db;
	}
	
	public void setMinutesBalance(int mb)
	{
		minutesBalance = mb;
	}
	
	public void setAmountBalance(int ab)
	{
		amountBalance = ab;
	}
	
	public int getDataBalance()
	{
		return dataBalance;
	}
	
	public int getMinutesBalance()
	{
		return minutesBalance;
	}
	
	public int getAmountBalance()
	{
		return amountBalance;
	}
	
	public String showAccount()
	{
		return " Client Name: " + getName() + " \n Address 1: " + getAddressLine1() + "\n Address 2: " + getAddressLine2() + "\n Postal Code: " +
		getPostalCode() + "\n Service Provider: " + getServiceProvider() + "\n Cellphone Number: " + getCellNumber() + "\n Data Balance: " + getDataBalance()
		+ "\n Minutes Balance: " + getMinutesBalance() + "\n Amount Balance: " + getAmountBalance();
	}
	
	public String toString()
	{
		return super.toString() + " Amount Balance: " + getAmountBalance();
	}

}
