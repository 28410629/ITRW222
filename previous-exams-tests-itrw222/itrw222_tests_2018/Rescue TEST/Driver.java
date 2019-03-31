
public class Driver
{
	public static void main(String [] args)
	{
	 
	 SLL<Integer> myList = new SLL<Integer>();
	
	 SLL<Integer> returnList = new SLL<Integer>();
	 
	 // test is member  with empty list
	 returnList = myList.reverseList(1);
	 System.out.printf("\n empty return list (1): %s", returnList);
	 returnList = myList.reverseList(2);
	 System.out.printf("\n empty return list (2): %s", returnList);
	 returnList = myList.reverseList(7);
	 System.out.printf("\n empty return list (7): %s", returnList);
	
	 System.out.println("\nAdd items: ");// Add item to Empty list
	 myList.append(new Integer(2));
	 myList.append(new Integer(4));
	 myList.append(new Integer(6));
	 myList.append(new Integer(1));
	 System.out.printf("\nmylist %s",myList);
	 
	 // test general case
	 returnList=myList.reverseList(1);
	 System.out.printf("\nMylist (1) %s",myList);
	 System.out.printf("\nReturnList: %s",returnList);
	 returnList=myList.reverseList(2);
	 System.out.printf("\nMylist (2) %s",myList);
	 System.out.printf("\nReturnList: %s",returnList);	
	}
}