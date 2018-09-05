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
       ListIterator<String> iterator = staff.listIterator();  //|DHRT

      // | in the comments indicates the iterator position

					// |DHRT
       				// D|HRT
      				// DH|RT

      // Add more elements after second element

      				// DHJ|RT
      				// DHJN|RT

      				// DHJNR|T

      // Remove last traversed element

      				// DHJN|T

      // Print all elements

      //System.out.println(staff);
      System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
   }
}
