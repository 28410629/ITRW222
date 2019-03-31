
public class StackAsSLL<T extends Comparable<? super T>>
{   
	private SLL<T> theStack;  // list header
	
	
    public StackAsSLL()
    {  theStack = new SLL<T>();       
    }
	
    public boolean push(T newElement) //insert at tail
    {  
		   return theStack.prepend(newElement);
    }
	
	public T pop() //remove from head
    {  
		T temp = null;
		boolean isDone = false;
		
		temp = theStack.getHead();
		if (temp != null)
		{
			isDone=theStack.delete(temp);
		}
		if (isDone)
			return temp;
		else
			return null;
    }
	public String toString()
	{
		return theStack.toString();
	}
   
}//end class

