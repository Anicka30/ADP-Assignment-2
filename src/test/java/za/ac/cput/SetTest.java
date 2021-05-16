package za.ac.cput;
/*
 *@author : Anicka Schouw 217284183
 * Set Test application
 * May 2021
 */
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {

    Set<Integer> set = new HashSet<>();

  @Test
  void sets(){

      //adding elements to set interface
      System.out.println("Adding elements");
      set.add(12);
      set.add(8);
      set.add(13);
      set.add(2);
      set.add(5);
      set.add(9);
      set.add(14);

      for (int element : set){
          System.out.println(element+" ");
      }


      //removing elements from set
      System.out.println(  );
      System.out.println("Removing elements");
      set.remove(9);
      for (int element: set){
          System.out.println(element +" ");
      }
      System.out.println("Value 9 has been removed");

      System.out.println(  );
      //finding if there is certain value present
      System.out.println("Looking if a certain value is present");
      System.out.println("Is there a value 14 present?: " +set.contains(14));
      System.out.println("Is there a value 10 present? : " +set.contains(10));

    }



}