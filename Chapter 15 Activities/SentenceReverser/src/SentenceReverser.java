import java.util.Scanner;
import java.util.Stack;

/**
   Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
   /**
      Reverses the given sentence.
      @param sentence Sentence to be reversed.
      @return reversed sentence.
   */
   public static String reverse(String sentence)
   {
      // Complete this method. Use a Stack.
      Stack<String> cool = new Stack<>();
      Scanner s = new Scanner(sentence);
      while(s.hasNext())
      {
         cool.push(s.next());
      }
      String newSentence = "";
      int size = cool.size();
      for(int i = 0; i <  size;i++)
      {
         newSentence += cool.pop() + " ";
      }
      return newSentence;
   }
}
