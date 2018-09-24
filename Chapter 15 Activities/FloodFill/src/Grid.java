import java.util.Scanner;
import java.util.Stack;

public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   int num = 1;

   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
      Stack<Pair> pairs = new Stack<>();
      Pair coordinate = new Pair(row, column);
      pairs.push(coordinate);
      while(!pairs.empty())
      {
         Pair thisCoordinate = pairs.pop();
         pixels[thisCoordinate.getRow()][thisCoordinate.getCol()] = num;
      }
   }

   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}
