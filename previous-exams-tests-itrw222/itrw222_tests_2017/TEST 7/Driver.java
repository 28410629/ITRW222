
public class Driver
{
	public static void main(String [] args)
	{
	 Integer head = null;
	 StackAsSLL<Integer> myStack = new StackAsSLL<Integer>();
	 
	 System.out.println("\nInitial list: ");
	 System.out.println(myStack +"\n");
	
	 
	 System.out.println("\nAdd One item: ");// Add item to Empty list
	 myStack.push(new Integer(3));
	 System.out.println(myStack +"\n");
	 
	 System.out.println("\nAdd a few more:");
	 myStack.push(new Integer(2));
	 myStack.push(new Integer(9));
	 myStack.push(new Integer(5));
	 System.out.println(myStack +"\n");
	
	 
	 System.out.println("\nPop one");
	 
	 if (!myStack.isEmpty())
	 {
		 head = (Integer) myStack.pop();
		 System.out.println("Head is: " + head.intValue() +"\n");
	 }
	 else
		 System.out.println("Empty Stack");
	 System.out.println(myStack +"\n");
	 
	 System.out.println("\nPop one");
	 head = (Integer) myStack.pop();
	 if (!myStack.isEmpty())
		System.out.println("Head is: " + head.intValue() +"\n");
	 else
		 System.out.println("Empty Stack");
	 System.out.println(myStack +"\n");
	 
	 System.out.println("\nPop one");
	 head = (Integer) myStack.pop();
	 if (!myStack.isEmpty())
		System.out.println("Head is: " + head.intValue() +"\n");
	 else
		 System.out.println("Empty Stack");
	 System.out.println(myStack +"\n");
	 
	 System.out.println("\nPop one");
	 head = (Integer) myStack.pop();
	 if (!myStack.isEmpty())
		System.out.println("Head is: " + head.intValue() +"\n");
	 else
		 System.out.println("Empty Stack");
	 System.out.println(myStack +"\n");
	 
	 System.out.println("\nPop one");
	 head = (Integer) myStack.pop();
	 if (!myStack.isEmpty())
		System.out.println("Head is: " + head.intValue() +"\n");
	 else
		 System.out.println("Empty Stack");
	 System.out.println(myStack +"\n");
	 
	
	}
}