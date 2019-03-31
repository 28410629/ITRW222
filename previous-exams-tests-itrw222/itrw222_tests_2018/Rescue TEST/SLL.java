
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
	
	public SLL<T> reverseList(int param)
	{
		Element<T> ptr = head;
		SLL<T> newList = new SLL<T>();
		SLL<T> temp = new SLL<T>();
		if (head == null)
			return this;			
		while (ptr!= null)
		{
			newList.prepend(ptr.data);// new elements with new addresses
			ptr=ptr.next;
		}
		if (param == 1)
		   return newList;
	    if (param == 2)
		{ 
	        temp.head = this.head;
			temp.tail = this.tail;
			head = newList.head;
			tail = newList.tail;
			return temp;
		}
		else
		{
			return null;
		}
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

