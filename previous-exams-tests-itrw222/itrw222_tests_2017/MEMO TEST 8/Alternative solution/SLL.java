
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
		SLL<T> temp = new SLL<T>();
		SLL<T> newList = new SLL<T>();
		if (head == null)
			return this;
		temp.head = this.head;
		temp.tail = this.tail;
		T  tempHeadValue = null;
		Element<T> ptrTemp = temp.head;
		while (ptrTemp!= null)
		{
			tempHeadValue=temp.deleteHead();
			newList.prepend(tempHeadValue);
			ptrTemp=ptrTemp.next;
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
   
	public boolean intsertSorted(T item)
	{
		Element<T> ptr = head;// start with second element
		Element<T> prevPtr = null;
		Element<T> newItem;
		boolean inserted = false;
		if (head == null)
		{
			append (item);
			return true;
		}
		if (item.compareTo(head.data)<0)// first element is special case
		{
			prepend(item);
			return true;
		}
		if (item.compareTo(tail.data)>=0)
		{
			append(item);
			return true;
		}
		newItem= new Element<T>(item);
		ptr= head.next;// start with second element
		prevPtr= head;
		while (ptr!= null && !inserted)
		{
			if (newItem.data.compareTo(prevPtr.data)>=0 && newItem.data.compareTo(ptr.data)<=0)
			{
				newItem.next = ptr;
				prevPtr.next = newItem;
				inserted = true;
			}
			prevPtr=ptr;
			ptr= ptr.next;
		}
		return inserted;
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

