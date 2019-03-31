
public class Driver
{
	public static void main(String [] args)
	{
	 
	 SinglyLinkedList<Integer> myList = new SinglyLinkedList<Integer>();
	 Integer a = new Integer(3);
	 Integer b = new Integer(6);
	 System.out.println("Initial list");
	
	 System.out.println("\n Empty test: Number of values deleted:"+ myList.rangeFilter(a,b) +" New list:"); // test empty list
	 //System.out.println("Add items");
	 myList.append(new Integer(5));
	 myList.append(new Integer(3));
	 myList.append(new Integer(4));
	 myList.append(new Integer(3));
	 myList.append(new Integer(6));
	 myList.append(new Integer(3));
	 myList.append(new Integer(4));
	
	 myList.showAll();
	 System.out.println("\n Number of values deleted:" + myList.rangeFilter(a,b)+" New list:"); // general case
	 myList.showAll();
	  myList.append(new Integer(5));
	 myList.append(new Integer(3));
	 myList.append(new Integer(4));
	 System.out.println("\n Number of values deleted:" + myList.rangeFilter(b,a)+ " New list:"); // general case
	 myList.showAll();
	
	// myList.showAll();
	}
}