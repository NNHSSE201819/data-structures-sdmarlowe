import java.util.LinkedList;
import java.util.ListIterator;

/**
   This program demonstrates the LinkedList class
	and ListIterator class.
*/
public class ListDemo
{
   public static void main(String[] args)
   {
       /*
        the add last method of LinkedList can be used to populate a list
        */
       LinkedList<String> staff = new LinkedList<>();
       staff.addLast("Diana");
       staff.addLast("Harry");
       staff.addLast("Romeo");
       staff.addLast("Tom");

       // List is currently D,H,R,T

       /*
            The listIterator method creates a new iterator method that is positioned
            at the front of the list
            The "|" in the comment indicates the iterator position
        */
       ListIterator<String> iterator = staff.listIterator(); //|DHRT

       /*
            the next method advances the iterator over the next element in the list
        */
       iterator.next(); //D|HRT

       /*
            the next method also returns the element that the iterator is passing
        */
       String name = iterator.next();
       System.out.print(name);
       System.out.print("Expected: Harry");

       /*
            the add method inserts an element at the iterator position
                the iterator is then positioned after the added element
        */
       iterator.add("Juliet"); //DHJ|RT
       iterator.add("Nina"); //DHJN|RT

       /*
            the remove method removes the element returned by the last call to
                next or previous
            the remove method can only be called once after calling next
            */

      // Remove last traversed element

      				// DHJN|T

      // Print all elements

      System.out.println(staff);
      System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");

      // set method sets the element returned by the last call to next or previous

       /*
            the hasNext method is often used in the context of a while loop
        */
       iterator = staff.listIterator();
       while(iterator.hasNext())
       {
           String n = iterator.next();
           if(n.equals("Juliet"))
           {
               iterator.remove();
           }
       }

       /*
            enhanced for loops work with linked lists because they implement
                the List interface
        */
       for(String n:staff)
       {
           System.out.println(n + "");
       }
       System.out.println();
   }
}
