//package ch2classes3;

public class MainUOA
{  public static void main(String[] args)
   {  UOA <PhoneListing> NYC = new UOA<PhoneListing>(500);
      PhoneListing bob = new PhoneListing("Bob", "23 1st Avenue",
                                          "133-4573");
      PhoneListing roy = new PhoneListing("Roy", "421 east 24th Street",
                                          "897-2232");
	  PhoneListing zack = new PhoneListing("Zack", "24 1st Avenue",
                                          "633-4573");
      PhoneListing john = new PhoneListing("John", "421 east 27th Street",
                                          "197-2232");
										  

      NYC.insert(roy);
	  NYC.insert(bob);
	  NYC.insert(zack);
      NYC.insert(john);
      NYC.showAll();
      System.out.println("Smallest first");
	  NYC.smallestFirst();
	  NYC.showAll();
	  System.out.println("Largest last");
	  NYC.largestLast();
	  NYC.showAll();
	 
   } // end of main method
} // end of class MainUOA

