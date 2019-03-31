
public abstract class CellUser implements Comparable<CellUser>
{
	private String name;
	private String addressLine1;
	private String addressLine2;
	private int postalCode;
	private String serviceProvider;
	private String cellNumber;
	
	public CellUser()
	{
		this("", "", "",0, "","");
	}
	
	public CellUser(String client,String add1,String add2,int postCode,String servProv,  String cellNr)
	{
		setName(client);
		setAddressLine1(add1);
		setAddressLine2(add2);
		setPostalCode(postCode);
		setServiceProvider(servProv);
		setCellNumber(cellNr);
	}
//Mutators
	public void setName(String cn)
	{
		name = cn;
	}
	
	public void setAddressLine1(String a1)
	{
		addressLine1 = a1;
	}
	
	public void setAddressLine2(String a2)
	{
		addressLine2 = a2;
	}
	public void setPostalCode(int pc)
	{
		postalCode = pc;
	}
	
	public void setServiceProvider(String sp)
	{
		serviceProvider = sp;
	}
	
	public void setCellNumber(String cn)
	{
		this.cellNumber = cn;
	}
	
	
// accessors	
	
		
	public String getName()
	{
		return name;
	}
	
	public String getAddressLine1()
	{
		return addressLine1;
	}
	
		public String getAddressLine2()
	{
		return addressLine2;
	}
	
		public String getServiceProvider()
	{
		return serviceProvider;
	}
	
	public int getPostalCode()
	{
		return postalCode;
	}
	
	public String getCellNumber()
	{
		return cellNumber;
	}
	
	public String toString() 
	{
		return " Client Name: " + getName() + " Cell Number: " + getCellNumber();
	}
    @Override
	public int compareTo(CellUser targetKey)
	{    
		CellUser temp = (CellUser) targetKey;
		String tKey =  temp.name;
		return(name.compareTo(tKey));
	} // end of compareTo method
	
	
	public abstract String showAccount();
}