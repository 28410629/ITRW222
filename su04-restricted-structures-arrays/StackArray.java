public class StackArray {
    private Listing[] data;
    private int top;
    private int size;
    
    public Stack( )
    {  
        top = -1;
        size = 100;
        data = new Listing[100];
    }

    public boolean push(Listing newNode)
    {  
        if(top == size-1)
            return false;  // ** overflow error **
        else
        {  
            top = top +1;
            data[top] = newNode.deepCopy(); 
            return true;  // push operation successful
        }
    }

    public Listing pop()
    {  
        if(top == -1)
            return null; // ** underflow error **
        else
        {   
            topLocation = top;
            top = top - 1;
            return data[topLocation]; // returns a shallow copy
        }
    }
}