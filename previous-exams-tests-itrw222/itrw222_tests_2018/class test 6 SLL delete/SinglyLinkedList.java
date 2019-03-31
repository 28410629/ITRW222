
public class SinglyLinkedList <T extends Comparable<? super T>>
{   
	private Element head;  // list header
	private Element tail;
    public SinglyLinkedList()
    {  head = null; 
	   tail = null;        
    }
    public boolean prepend(T newElement) //insert at head
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
			 temp.next = head;
			 head = temp;
		   }
		}
        return true;
        
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
     {   System.out.println(ptr.data);
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

