import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
   Write a program that checks whether a sequence of HTML tags
   is properly nested. For each opening tag, such as <p>, there
   must be a closing tag </p>. A tag such as <p> may have other
   tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>

   The inner tags must be closed before the outer ones.
   Your program should process a file containing tags.
   For simplicity, assume that the tags are separated by
   spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
   public static void main(String[] args)
   {
      String filename = "src/TagSample2.html";

      try (Scanner in = new Scanner(new File(filename)))
      {
         // Your code goes here
         Stack<String> tags = new Stack<>();
         boolean proper = true;
         while(in.hasNext())
         {
            String next = in.next();
            if(!next.contains("/"))
            {
               tags.push(next);
            }
            else
            {
               String top = tags.pop();
               if(!(top.equals(next.substring(0,1)+next.substring(2))))
               {
                  proper = false;
               }
            }
            System.out.println("The order is proper: " + proper);
         }






      }
      catch (FileNotFoundException e)
      {
         System.out.println("Cannot open: " + filename);
      }

   }
}
