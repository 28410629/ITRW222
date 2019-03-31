
public class SLL<T extends Comparable<? super T>>
{   
	private Element<T> head;  // list header
	private Element<T> tail;
	
    public SLL()
    {  head = null;  
	   tail = null;        
    }
    public boolean prepend(T newElement) //insert at head
    {  
		Element<T> temp = new Element<T>(newElement);
        if(temp == null) // out of memory
           return false;
        else
        {  
	       if (head==null)
		   {
			head = temp;
			tail = temp;
		   }
           else
           {
			 temp.next = head;
			 head = temp;
		   }
		}
        return true;
    }
	 public boolean append(T newElement) //insert at tail
    {  
		Element<T> temp = new Element<T>(newElement);
        if(temp == null) // out of memory
           return false;
        else
        {  
	       if (head==null)
		   {
			head = temp;
			tail = temp;
		   }
           else
           {
			 tail.next = temp;
			 tail = temp;
		   }
		}
     return true;
    }
    
   public boolean delete(T item)
   {
	   Element<T> ptr = head;
	   Element<T> prevPtr = null;
	   while (ptr!= null&& ptr.data.compareTo(item)!= 0)
	   {
		   prevPtr=ptr;
		   ptr=ptr.next;
	   }
	   if (ptr == null)//item not found
		   return false;
	   if (ptr==head) // item is first element
		   head= ptr.next;
	   else // general case
		   prevPtr.next=ptr.next;
	   if (ptr==tail)// last element
		   tail=prevPtr;
	   return true;
   }
	public T deleteHead()
   {
	   T deleted;
	   if (head == null)//item not found
		   return null;
	   else 
	   {
		   deleted = head.data;
		   head = head.next;
		   return deleted;
	   }
   }
	
	public SLL<T> reverseList()
	{
		Element<T> ptr = head;
		SLL<T> newList = new SLL<T>();
		if (head == null)
			return this;			
		while (ptr!= null)
		{
			newList.prepend(ptr.data);
			ptr=ptr.next;
		}
		return newList;
	}

	public String toString()
	{
		String s="";
		Element<T> ptr = head;
		while (ptr != null) //continue to traverse the list
		{   
			s=s + ptr.data + " ";
			ptr = ptr.next;
		}
		return s;
	}
   
	public void filter(SLL<T> paramList)
	{
		Element<T> paramPtr; // declare variable  paramPtr to traverse  parameter  list
		Element<T> thisPtr; // declare variable  thisPtr to traverse calling list
		//create new list for output
		SLL<T> filteredList = new SLL<T>();
				
		if (paramList.head==null|| head==null) // any of the lists empty?
		{
			System.out.println("\nEmpty list"); 
			return;
		}
		// test if paramlist has 2 elements
		if (paramList.head.next != paramList.tail)
		{
			System.out.println("\nParameter list should have 2 elements");
			return;
		}
						
		// traverse calling list and add correct values to new list
		
		thisPtr = head; // start at beginning of calling list
		
		while (thisPtr != null) // continue until end of calling list
		{
			if (( thisPtr.data.compareTo(paramList.head.data)>=0) &&    
                                            (thisPtr.data.compareTo(paramList.tail.data)<=0))
	                               // if thisPtr.data>=paramList.head.data AND <= paramList.tail.data
			{
				filteredList.append(thisPtr.data);
			}
			thisPtr=thisPtr.next;
		}	
		// copy filteredList to calling list;
		head=filteredList.head;
		tail = filteredList.tail;
	}

		
	
  public class Element<T1 extends Comparable<? super T>>
  {   
      private T1 data;
      private Element<T1> next;
      public Element(T1 param)
     {
		 data = param;
     }
	  	
   }// end of inner class Node
}//end SinglyLinkedList outer class

