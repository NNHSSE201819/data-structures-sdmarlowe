import java.util.Scanner;
import java.util.Set;
import java.util.*;

/**
   A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Compute primes up to which integer?");
      int n = in.nextInt();

      // Your work goes here
      Set<Integer> numbers = new HashSet<>();
      for(int num = 2; num <= n; num++)
      {
         numbers.add(num);
      }

      for(int i = 2; i <= n; i++)
      {
         for(int j = 3; j <= n; j++)
         {
            if( j % i == 0 && i != j)
            {
               numbers.remove(j);
            }
         }
      }
      System.out.println(numbers);







   }
}
