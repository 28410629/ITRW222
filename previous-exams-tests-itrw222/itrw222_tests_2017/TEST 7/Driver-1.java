
public class Driver
{
	public static void main(String [] args)
	{

	
	 
			Integer i1= new Integer(1);
		   Integer i2= new Integer(2);
		   Integer i3= new Integer(3);
		   Integer i4= new Integer(4);
		   Integer i5= new Integer(5);
		   Integer i6= new Integer(6);
		   
		   StackAsSLL<Integer> longNumber1 = new StackAsSLL<Integer>();
		   StackAsSLL<Integer> longNumber2 = new StackAsSLL<Integer>();
		   StackAsSLL<Integer> resultStack = new StackAsSLL<Integer>();
		   
		   //long number 1 - 664536 
		   System.out.println( " 664536");  
		   longNumber1.push(i6);
		   longNumber1.push(i6);
		   longNumber1.push(i4);
		   longNumber1.push(i5);
		   longNumber1.push(i3);
		   longNumber1.push(i6);
           //long number 2 = 4543
		   System.out.println(longNumber1);
		   System.out.println( " 6546");  
		   
		    
		  
		   longNumber2.push(i6);
		   longNumber2.push(i5);
		   longNumber2.push(i4);
		   longNumber2.push(i6);
		   System.out.println(longNumber2);
		   
		  
		   System.out.println( " ");
		   int theDigit,d1,d2;
		   int carryOver =0;;
		
		   while ((!longNumber1.isEmpty())&&(!longNumber2.isEmpty()))
		   {
			    d1=longNumber1.pop().intValue();
				d2=longNumber2.pop().intValue();
				System.out.println(d1 + " and "+ d2);
				theDigit = ((d1+d2) % 10) + carryOver;;
				carryOver = (d1+d2)/10;
				
				resultStack.push(new Integer(theDigit));
		   }
		   if (!longNumber1.isEmpty())
		   {
			    d1=longNumber1.pop().intValue();
				theDigit= d1+carryOver;
				carryOver= theDigit/10;
				resultStack.push(new Integer(theDigit));
				while(!longNumber1.isEmpty())
				{
					d1=longNumber1.pop().intValue();
					theDigit= d1+carryOver;
					carryOver= theDigit/10;
					resultStack.push(new Integer(theDigit));
				}
					
				
		   }
		   if (!longNumber2.isEmpty())
		   {
			    d2=longNumber2.pop().intValue();
				theDigit= d2+carryOver;
				carryOver= theDigit/10;
				resultStack.push(new Integer(theDigit));
				while(!longNumber2.isEmpty())
				{
					d2=longNumber1.pop().intValue();
					theDigit= d2+carryOver;
					carryOver= theDigit/10;
					resultStack.push(new Integer(theDigit));
				}

		   }
			System.out.println(resultStack);   
		   
		   
		  
	  
	}
}