import java.util.Scanner;
/**
   Below is a renamed and modified version of the DecisionTreeDemo
   program from Section 17.2. Implement the animal guessing game described
   in Section 17.2.1. Start with the tree in Figure 4, but present
   the leaves as "Is it a(n) X?" If it wasn't, ask the user what the
   animal was, and ask for a question that is true for that animal
   but false for X. For example:

      Is it a mammal? Y
      Does it have stripes? N
      Is it a pig? N
      I give up. What is it? A hamster
      Please give me a question that is true for a hamster and false for a pig.
      Is it small and cuddly?

   In this way, the program learns additional facts.
   Use the BinaryTree class from Section 17.2.
*/
public class GuessingGame
{
   public static void main(String[] args)
   {
      BinaryTree questionTree = new BinaryTree("Is it a mammal?",
         new BinaryTree("Does it have stripes?",
            new BinaryTree("Is it a carnivore?",
               new BinaryTree("Is it a tiger?"),
               new BinaryTree("Is it a zebra?")),
            new BinaryTree("Is it a pig?")),
         new BinaryTree("Does it fly?",
            new BinaryTree("Is it an eagle?"),
            new BinaryTree("Does it swim?",
               new BinaryTree("Is it a penguin?"),
               new BinaryTree("Is it an ostrich?"))));

      BinaryTree current = questionTree;

      boolean done = false;
      String response;
      Scanner in = new Scanner(System.in);
      System.out.println("Let's play a guessing game.");

      while (!done)
      {
         BinaryTree left = current.left();
         BinaryTree right = current.right();
         if (left.isEmpty() && right.isEmpty())
         {
            System.out.println(current.data());
            System.out.println("Is this correct(Y/N)?: ");
            if(in.next() == "Y")
            {
               done = true;
               String message = "Great, " + current.data();
               System.out.println(message.replace("Is it", "it is")
                       .replace("?", "."));
            }
            else
            {
               System.out.println("I give up! What is it?: ");
               String name = in.next();
               System.out.println("Please give me a question that is true for a " + name + " and false for a " + current.data());
               String condition = in.next();
               String newData = "" + current.data();
               BinaryTree newLeft = new BinaryTree(newData);
               BinaryTree newRight = new BinaryTree(name);
               BinaryTree newCurrent = new BinaryTree(condition,newLeft,newRight);
               done = true;
               String message = "Great, It's a " + newRight.data();
               System.out.println(message);
            }
         }
         else
         {
            do
            {
               System.out.print(current.data() + " (Y/N) ");
               response = in.nextLine().toUpperCase();
            }
            while (!response.equals("Y") && !response.equals("N"));

            if (response.equals("Y"))
            {
               current = left;
            }
            else
            {
               current = right;
            }
         }
      }
   }
}
