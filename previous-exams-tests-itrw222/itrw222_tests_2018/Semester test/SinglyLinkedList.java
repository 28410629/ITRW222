
public class SinglyLinkedList<T extends Comparable<? super T>>
{   
	private Element head;  // list header
	private Element tail;
    public SinglyLinkedList()
    {  head = null;  
	   tail = null;        
    }
    
   public boolean append(T newElement) //insert at head
    {  
		Element temp = new Element(newElement);
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
   public int rangeFilter (T first, T second)
   {
	   if (second.compareTo(first)<0) // special case second parameter is 
										//smaller than first one
		   return 0;
	   if (head == null) // list is empty
		   return 0;  
	   int count = 0; // number to be returned
	   // get ready to step through list
	   Element ptr1 = head;
	   while (ptr1!= null)
	   {
		   //if (current number > first param) && (current number < second param)
		   if (ptr1.data.compareTo(first) > 0 && (ptr1.data.compareTo(second) < 0)) 
		   {
		      delete(ptr1.data);
			  count++;
		   }
		   ptr1=ptr1.next;
	   }
	   return count;
   }
   public boolean delete(T item)
   {
	   Element ptr = head;
	   Element prevPtr = null;
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
  
   
  

  public void showAll()
  { Element ptr = head;
     while (ptr != null) //continue to traverse the list
     {   System.out.println(ptr.data.toString( ));
         ptr = ptr.next;
     }
   }
  public class Element
  {  
      private T data;
      private Element next;
      public Element(T param)
     {
		 data = param;
     }
   }// end of inner class Node
}//end SinglyLinkedList outer class

