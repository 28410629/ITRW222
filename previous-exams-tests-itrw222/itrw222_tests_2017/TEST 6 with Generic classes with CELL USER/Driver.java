
public class Driver
{
	public static void main(String [] args)
	{
	 
	    SLL<CellUser> myList = new SLL<CellUser>();
		CellUser c = new PrepaidUser("Godfrey Mokoena"," 2 Lonjumpstreet", "Potchefstroom",2520, "Cell-C","0780191000",300,15,2);
		myList.insertSorted(c);
		myList.insertSorted(new ContractUser("Wade van Niekerk","4 longroad", "Klerksdorp",2500, "Vodacom","08335423123","13/2/17", "Weekend plus100", "Nokia", 64,2));
		myList.insertSorted(new PrepaidUser("Castor Semenya","7 Fastlane", "Mahikeng",1234,"MTN","0823542333",300,55,6));
		myList.insertSorted(new ContractUser("Akani Simbine","23 Sprintlane", "Johannesburg",2000,"Cell-C", "0772361537","12/5/17", "Topup 500", "Samsung", 147,60));
		myList.insertSorted(new PrepaidUser("Luvo Manyonga","1 Sand street", "Carletonville",2000,"MTN","0842222525",579,17,2));
		
	    System.out.println("\nCalling list");
        myList.showAll();	 
	}
}