package za.ac.cput;

/*
 *@author : Anicka Schouw 217284183
 * Map Test application
 * May 2021
 */

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapsTest {

    Map<Integer,String> student = new HashMap();

    @Test
    void map(){

        //adding elements
        student.put(217,"Anicka");
        student.put(218,"Ashlee");
        student.put(219,"Trudy");
        student.put(220,"Raees");
        student.put(216,"Gavin");
        student.put(212,"Jihan");
        student.put(215,"Waarith");

        System.out.println(  );
        System.out.println("7 Elements have been added");
        for(Map.Entry pairEntry: student.entrySet()){
            System.out.println(pairEntry.getKey()+ " : "+pairEntry.getValue());
        }
        System.out.println(  );
        // Removing elements from Map
        System.out.println("Displaying items before removal ");
        for(Map.Entry pairEntry: student.entrySet()){
            System.out.println(pairEntry.getKey()+ " : "+pairEntry.getValue());
        }
        student.remove(216);

        System.out.println(  );
        System.out.println("Element with the key 216 has been removed");
        for(Map.Entry pairEntry: student.entrySet()){
            System.out.println(pairEntry.getKey()+ " : "+pairEntry.getValue());
        }

        System.out.println(  );
        //Finding a certain element via value and key
        System.out.println("Checking if there is a specific element");
        System.out.println("Finding element via key");
        System.out.println("Checking if there is a key value of 221: " +student.containsKey("221"));
        System.out.println( );
        System.out.println("Finding a element via value");
        System.out.println("Checking if there is a value Anicka: "+ student.containsValue("Anicka"));

    }

}