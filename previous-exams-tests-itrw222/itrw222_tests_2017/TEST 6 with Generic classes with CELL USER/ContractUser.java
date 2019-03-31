public class ContractUser extends CellUser 
{
	private String contractStartDate;
	private String contractDescription;
	private String phoneDescription;
	private int freeMinutesLeft;
	private int freeSmsLeft;
	
	public ContractUser()
	{
		super();
		contractStartDate = "";
		contractDescription = "";
		phoneDescription = "";
		freeMinutesLeft = 0;
		freeSmsLeft = 0;	
	}
	
	public ContractUser(String cn,String add1,String add2,int pc, String sp, String cnr, String cStartDate, String cDescr, String phoneDescr, int minutesLeft, int smsLeft)
	{
		super(cn, add1, add2, pc, sp, cnr);
		setContractStartDate(cStartDate);
		setContractDescription(cDescr);
		setPhoneDescription(phoneDescr);
		setFreeMinutesLeft(minutesLeft);
		setFreeSmsLeft(smsLeft);
	}
	
	public void setContractStartDate(String csd)
	{
		contractStartDate = csd;
	}
	
	public void setContractDescription(String cd)
	{
		contractDescription = cd;
	}
	
	public void setPhoneDescription(String pd)
	{
		phoneDescription = pd;
	}
	
	public void setFreeMinutesLeft(int fml)
	{
		freeMinutesLeft = fml;
	}
	
	public void setFreeSmsLeft(int fsl)
	{
		freeSmsLeft = fsl;
	}
	
	public String getContractStartDate()
	{
		return contractStartDate;
	}
	
	public String getContractDescription()
	{
		return contractDescription;
	}
	
	public String getPhoneDescription()
	{
		return phoneDescription;
	}
	
	public int getFreeMinutesLeft()
	{
		return freeMinutesLeft;
	}
	
	public int getFreeSmsLeft()
	{
		return freeSmsLeft;
	}
	
	public String showAccount()
	{
		return " Client Name: " + getName() + " \n Address 1: " + getAddressLine1() + "\n Address 2: " + getAddressLine2() + "\n Postal Code: " +
		getPostalCode() + "\n Service Provider: " + getServiceProvider() + "\n Cellphone Number: " + getCellNumber() + "\n Contract Start Date: " + getContractStartDate()
		+ "\n Contract Description: " + getContractDescription() + "\n Phone Description: " + getPhoneDescription() + "\n Free Minutes Left: "
		+ getFreeMinutesLeft() + "\n Free Sms's Left: " + getFreeSmsLeft();
	}
	
	public String toString()
	{
		return super.toString()+ " Phone Description: " + getPhoneDescription();
	}
	
}