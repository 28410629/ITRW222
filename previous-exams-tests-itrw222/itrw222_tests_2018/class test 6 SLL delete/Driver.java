
public class Driver
{
	public static void main(String [] args)
	{
	 
	 SinglyLinkedList<Integer> myList = new SinglyLinkedList<Integer>();
	 System.out.println("Initial list");
	 myList.showAll();
	 Boolean result= false;
	 result = myList.delete(new Integer (3)); //test empty list
	 if (result)
	    System.out.println("delete done");
	 else
		System.out.println("error: trying to delete from empty list");
	// add numbers
	 myList.append(new Integer(3));
	 myList.append(new Integer(7));
	 myList.append(new Integer(5));
	 myList.append(new Integer(1));
	 myList.append(new Integer(9));
	 myList.showAll();
	 result = myList.delete(new Integer (11)); //remove number not in list	 if (result)
	 if (result)    
		System.out.println("delete done");
	 else
		System.out.println("error: trying to remove item not in list");
	 myList.showAll();
	 
	 System.out.println("Delete 5 in middle of list");// test general case
	 result = myList.delete(new Integer (5));
	 if (result)
		 System.out.println("delete done");
	 else
		System.out.println("error trying to remove middle item");
	 myList.showAll(); 
	 // delete first element
	 result = myList.delete(new Integer (3)); 
	if (result)    
	   System.out.println("delete done: first element");
	 else
		System.out.println("error trying to delete first item");
	 myList.showAll();
	 
	 // delete last element
	 result = myList.delete(new Integer (9)); 
	 if (result)    
		System.out.println("delete done: last element");
	 else
		System.out.println("error trying to delete last item");
	 myList.showAll();
	 
	}
}