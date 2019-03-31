
public class Driver
{
	public static void main(String [] args)
	{
	 
	 SLL<Integer> myList = new SLL<Integer>();
	 SLL<Integer> filterValues = new SLL<Integer>();
	
	 
	 // test filter  with empty list
	 myList.filter(filterValues);
	 System.out.printf("\n ", myList); 
	 System.out.println("\nAdd items: ");// Add item to Empty list
	 myList.append(new Integer(2));
	 myList.append(new Integer(1));
	 myList.append(new Integer(6));
	 myList.append(new Integer(1));
	 myList.append(new Integer(2));
	 myList.append(new Integer(7));
	 myList.append(new Integer(6));
	 myList.append(new Integer(11));
	 System.out.printf("\nmylist %s",myList);
	 System.out.printf("\nfilter %s",filterValues);
	// test filter  with calling list and empty filter list
	 myList.filter(filterValues);
	 System.out.printf("\n %s", myList); 
	 //test with too short parameter
	 filterValues.append(new Integer(4));
	 myList.filter(filterValues);
	 System.out.printf("\n  %s", myList);
	 // test general case
	 filterValues.append(new Integer(7));
	 myList.filter(filterValues);
	 System.out.printf("\nMylist %s",myList);
	// Test with too many filter values 
	 filterValues.append(new Integer(7));
	 myList.filter(filterValues);
	 System.out.printf("\nMylist %s",myList);
	}
}