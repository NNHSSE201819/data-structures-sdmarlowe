import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
   This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
   public static void main(String[] args)
   {
	   //create Map: favoriteColors

      /*
         The Map interface is a generic. The first type is the type of the key;
            the second, the type of the value.
       */
      Map<String, Color> favoriteColors = new HashMap<>();

      favoriteColors.put("Kenneth",Color.blue);
      favoriteColors.put("Sam", Color.green);
      favoriteColors.put("Aman", Color.black);
      favoriteColors.put("Vatsal", Color.orange);
      favoriteColors.put("Anne", Color.red);
      favoriteColors.put("Joe", Color.blue);


	  //create Set<String> keySet
      Set<String> keySet = favoriteColors.keySet();

      // Print all keys and values in the map
      for (String key : keySet)
      {
         System.out.println(key + ": " + favoriteColors.get(key));
      }
   }
}
