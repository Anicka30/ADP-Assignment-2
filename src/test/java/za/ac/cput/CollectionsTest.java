package za.ac.cput;
/*
*@author : Anicka Schouw 217284183
* Collections Test application
* May 2021
 */
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsTest {

    Collection collect = new LinkedHashSet();

    @Test
    void collects(){

        //adding elements
        System.out.println("Adding elements !");
        collect.add("List");
        collect.add("Set");
        collect.add("Map");
        collect.add("Collections");
        collect.add("Generics");

        Iterator i = collect.iterator();

            while(i.hasNext()){
                System.out.println(i.next());
            }
            System.out.println(  );


        //removing elements
        System.out.println("Removing an element");
        collect.remove("Set");

        i = collect.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("Element Set has been removed.");
        System.out.println(  );

        //finding elements
        System.out.println("Finding a specific element");
        System.out.println("Is there an element Map present? " + collect.contains("Map"));
        System.out.println("Is there an element Store present? " + collect.contains("Store"));
        i = collect.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}