public class SLL<T extends Comparable<? super T>>
{   
	private Element<T> head;  
	private Element<T> tail;
	
    public SLL()
    {  
		head = null;  
	   	tail = null;        
	}
	
    public boolean prepend(T newElement)
    {  
		Element<T> temp = new Element<T>(newElement);

        if(temp == null) 
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
	
	 public boolean append(T newElement)
    {  
		Element<T> temp = new Element<T>(newElement);
        if(temp == null) 
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
	   if (ptr == null)
		   return false;

	   if (ptr==head) 
		   head= ptr.next;
	   else 
		   prevPtr.next=ptr.next;

	   if (ptr==tail)
		   tail=prevPtr;

	   return true;
   }


	public void showAll()
	{
		Element<T> ptr = head;
		while (ptr != null) 
		{   
			System.out.printf(ptr.data.toString( )+" ");
			ptr = ptr.next;
		}
	}
   
	public boolean intsertSorted(T item)
	{
		Element<T> ptr = head;
		Element<T> prevPtr = null;
		Element<T> newItem;
		boolean inserted = false;

		if (head == null)
		{
			append (item);
			return true;
		}

		if (item.compareTo(head.data)<0)
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
		ptr= head.next;
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

	public SLL merge(SLL paramlist)
	{
		Element ptrThis, ptrParam;
		ptrThis = head;
		ptrParam = paramlist.head;
		SLL returnlist = new SLL();
		
		if(head==null)// caling list is empty - set this list to param list:list 2
		{
			while(ptrParam != null)
			{
				returnlist.append(ptrParam.data);
				ptrParam = ptrParam.next;
			}
			return returnlist;
			
		}
		
		if(paramlist.head == null)// param list is empty - make no changes
		{
			while(ptrThis != null)
			{
				returnlist.append(ptrThis.data);
				ptrThis = ptrThis.next;
			}
			return returnlist; 
		}
		
		while((ptrThis != null) && (ptrParam != null))// continue up to end of one list
		{
			if (ptrThis.data.compareTo(ptrParam.data)<=0)
			{
				returnlist.append(ptrThis.data);
				ptrThis = ptrThis.next;
			}
			else
			{
				returnlist.append(ptrParam.data);
				ptrParam = ptrParam.next;
			}
		}
		
		if(ptrThis == null)// copy rest of param list
		{
			while(ptrParam != null)
			{
				returnlist.append(ptrParam.data);
				ptrParam = ptrParam.next;
			}
		}
		if(ptrParam == null) // copy rest of calling list
		{
			while(ptrThis != null)
			{
				returnlist.append(ptrThis.data);
				ptrThis = ptrThis.next;
			}
		}
		return returnlist;
	}
	
  	public class Element<T1 extends Comparable<? super T>>
  	{   
    	private T1 data;
		private Element<T1> next;
	
    	public Element(T1 param)
  		{
			data = param;
    	}	  	
   	}
}

