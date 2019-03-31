//package ch2classes3;

public class UOA<T extends Comparable<? super T>>
{  private int next;
   private T[] data;
   private int size;

   public UOA()
   {  next = 0;
      size = 100;
        data =  (T[]) new Comparable[100];
   }//end of constructor

   public UOA(int s)
   {  next = 0;
      data = (T[]) new Comparable[s];
      size = s;
   }//end of constructor
   
   public boolean insert(T newListing)
   {  if(next >= size)
        return false;  // check for too many listings
      data[next]=   newListing;
      if(data[next] == null) // check for insufficient memory
        return false;
      next = next + 1;
      return true;  // insert performed
   } // end of insert method

   public T fetch(T targetKey)// parameter is any field to identify record
   { // access the node using a sequential search, returns null for
          // not found
      T node =  data[0];
      T temp;
      int i = 0;
      while(i < next && node.compareTo(targetKey) != 0)
      {  i++;
         node =  data[i];
      }
      if(i == next)  // the node with the given key was not found.
        return null;
     
      // move the node up one position in the array, unless it is the
      // first node
      if(i != 0)  // bubble-up accessed node
      {  temp =  data[i - 1];
         data[i - 1] = data[i];
         data[i] = temp;
      }
      return node;
   }// end of the fetch method

   public boolean delete(T targetKey)
   { // access the node using a sequential search, returns null for
          // not found
     
	  T node =  data[0];
      int i = 0;
      while (i < next && node.compareTo(targetKey) != 0)
      {  i++;
         node =  data[i];
      }
      if(i == next) // the node was not found
        return false;
     //move the last node into the deleted node’s position
      data[i] = data[next - 1];
      data[next - 1] = null;
      next = next - 1;
      return true;
   }// end of delete method

   public boolean update(T targetKey, T newNode)
   {  if(delete(targetKey) == false)
        return false;
      else if(insert(newNode) ==  false)
        return false;
      else
        return true;
   }// end of update method

   public void showAll()
   {  for(int i = 0; i < next; i++)
        System.out.println(data[i].toString());
   }// end of toString method
  

   public void smallestFirst()
   {
		T small =  data[0];
		int smallPos = 0;
		T temp;
		for (int i = 1;  i< next; i++)
		{
			if (data[i].compareTo(small)<0)
			{
			    small = data[i];
				smallPos  = i;
		   	}
		}
		temp = data[smallPos];
		data [smallPos] = data[0];
		data [0] = temp;
		return;
   }
    public void largestLast()
   {
		T large =  data[0];
		int largePos = 0;
		T temp;
		for (int i = 1;  i< next; i++) // can start at second pos of array
		{
			if (data[i].compareTo(large)>0)
			{
			    large = data[i]; 
				largePos  = i;
		   	}
		}// swap largest with last one
		temp = data[largePos];
		data [largePos] = data[next-1]; // next is an int val of the first open pos  so next -1 is the index ofd the last filled pos
		data [next-1] = temp;
		return;
   }
  

  

  
}// end of class UOA

