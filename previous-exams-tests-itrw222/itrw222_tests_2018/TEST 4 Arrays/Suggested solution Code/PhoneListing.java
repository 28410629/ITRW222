
public class PhoneListing implements Comparable<PhoneListing>
{  private String name;  // key field
   private String address;
   private String number;
   public PhoneListing(String n, String a, String num )
   {  name = n;
      address = a;
      number = num;
   }
   public String toString()
   {  return("Name is " + name +
             "\nAddress is " + address +
             "\nNumber is " + number + "\n");
   }

@Override
   public int compareTo(PhoneListing targetKey) // gets the name of the item to be found in string variable
   {  String tKey=  targetKey.name;
      return(name.compareTo(tKey));
   } // end of compareTo method
} // end of class PhoneListing
