
public class StackAsSLL<T> extends SLL
{   
	private SLL<T> theStack;  // list header
	
	
    public StackAsSLL()
    {  theStack = new SLL<T>();       
    }
	
    public boolean push(T newElement) 
    {  
		   return theStack.prepend(newElement);
    }
	
	public T pop() //remove from head
    {  
		T temp = null;
		temp = (T)theStack.deleteHead();
		return temp;
    }
	public String toString()
	{
		return theStack.toString();
	}
	public boolean isEmpty()
	{
		return theStack.isEmpty();
	}
   
}//end class

