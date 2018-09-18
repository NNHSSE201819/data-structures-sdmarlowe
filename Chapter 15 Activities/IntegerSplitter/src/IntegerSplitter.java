import java.util.Scanner;
import java.util.Stack;
/**
   Class for splitting an integer into its individual digits.
*/
public class IntegerSplitter
{
   /**
      Splits the given integer into its individual digits
      and prints them to the screen.
      @param number Integer to be split.
   */
   public static void split(int number)
   {
      // Complete this method. Use a Stack
      Stack<Integer> cool = new Stack<>();
      while(number > 9)
      {
         cool.push(number % 10);
         number = number / 10;
      }
      cool.push(number);
      while(!cool.empty())
      {
         System.out.println(cool.pop());
      }
   }
}
