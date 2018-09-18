import java.util.Stack;
import java.util.Scanner;

/**
   Class for simulating a driveway and a street, using stacks
   of cars with license plate numbers as representation.
*/
public class Driveway
{
   /**
      Stack representing the cars in the driveway.
   */
   private Stack<Integer> driveway;
   /**
      Stack representing the cars in the street.
   */
   private Stack<Integer> street;

   /**
      Constructor.
   */
   public Driveway()
   {
      // Complete the constructor
      driveway = new Stack<>();
      street = new Stack<>();

   }

   /**
      Add the given license plate to the driveway.
      @param licencePlate number of license plate.
   */
   public void add(int licensePlate)
   {
      // Complete this method
      driveway.push(licensePlate);


   }

   /**
      Remove the given license plate from the driveway.
      @param licencePlate number of license plate.
   */
   public void remove(int licensePlate)
   {
      // Complete this method
      boolean found = false;
      while(!found)
      {
         if(driveway.peek() != licensePlate)
         {
            street.push(driveway.pop());
         }
         else
         {
            driveway.pop();
            found = true;
            while(!street.empty())
            {
               driveway.push(street.pop());
            }
         }

      }


   }

   /**
      Prints the driveway and street details to the screen.
   */
   public void print()
   {
      System.out.println("In Driveway, starting at first in (one license plate per line):");
      // Print the cars in the driveway here
      Stack<Integer> reverseDriveway = new Stack<>();
      while(!driveway.empty())
      {
         reverseDriveway.push(driveway.pop());
      }
      while(!reverseDriveway.empty())
      {
         int value = reverseDriveway.pop();
         System.out.println(value);
         driveway.push(value);
      }

      System.out.println("In Street, starting at first in (one license plate per line):");
      // Print the cars in the street here
      Stack<Integer> reverseStreet = new Stack<>();
      while(!street.empty())
      {
         reverseStreet.push(street.pop());
      }
      while(!reverseStreet.empty())
      {
         int value = reverseStreet.pop();
         System.out.println(value);
         street.push(value);
      }

   }
}
