public class QueueArray {
    private Listing[] data;
    private int size;
    private int numOfNodes;
    private int front;
    private int rear;
    
    public Queue()
    {  
        size = 100;
        numOfNodes = 0;
        front = 0;
        rear = 0;
        data = new Listing[100];
    }

    public boolean enque(Listing newNode)
    {  
        if(numOfNodes == size)
            return false;  // ** overflow error **
        else
        { 
            numOfNodes = numOfNodes +1;
            data[rear] = newNode.deepCopy();
            rear = (rear +1) % size;
            return true;  // 
        }
    }

    public boolean dequeue(Listing newNode)
    {  
        if(numOfNodes == 0)
            return null;  // ** overflow error **
        else
        { 
            frontlocation = front;
            front = (front +1) % size;
            numOfNodes = numOfNodes -1;
            return data[frontlocation]
        }
    }
}
