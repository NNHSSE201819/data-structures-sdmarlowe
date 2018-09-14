import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
   A program to add, remove, modify or print
   student names and grades.
*/
public class Gradebook
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      Map<String, String> gradebook = new HashMap<>();

      boolean done = false;
      while(!done)
      {
         System.out.println("A)dd R)emove M)odify P)rint Q)uit");
         String input = in.next().toUpperCase();
         if (input.equals("Q"))
         {
            done = true;
         }
         else if (input.equals("A"))
         {
            String name = in.next();
            System.out.println("What is the name of the student?: ");
            String grade = in.next();
            System.out.println("What is the grade of the student?: ");
            gradebook.put(name,grade);

         }
         else if (input.equals("R"))
         {
            String removeName = in.next();
            System.out.println("What is the name of the student you would like to remove?: ");
            gradebook.remove(removeName);
         }
         else if (input.equals("M"))
         {
            String nameModify = in.next();
            System.out.println("What is the name of the student?: ");
            String gradeModify = in.next();
            System.out.println("What is the new grade of the student?: ");
            gradebook.put(nameModify,gradeModify);
         }
         else if (input.equalsIgnoreCase("P"))
         {
            Set<String> nameSet = gradebook.keySet();
            for(String name : nameSet)
            {
               System.out.println("Name: " + name + "\nGrade: " + gradebook.get(name));
            }
         }
         else
         {
            done = true;
         }
      }
   }
}
