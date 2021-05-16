package za.ac.cput;

/*
 *@author : Anicka Schouw 217284183
 * List Test application
 * May 2021
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    ArrayList<String> lt = new ArrayList<>();


    @Test
    void Lists() {

        //Adding elements to the ArrayList
        System.out.println("Adding elements to List");
        lt.add("Jamie");
        lt.add("Brandon");
        lt.add("Austin");
        lt.add("Jodie");
        lt.add("Bobby");
        lt.add("Alice");

        for (String show : lt) {
            System.out.println(show);
        }


        System.out.println();
        //Removing an element from the list
        System.out.println("Removing an element from List");
        lt.remove("Brandon");
        System.out.println("Value Brandon has been removed.");
        for (String show : lt) {
            System.out.println(show);

        }

        System.out.println();

        //Finding an element
        System.out.println("Finding an element");
        for (String show : lt) {
            System.out.println(show);
        }
        System.out.println("Checking if there is a value Bobby in the list: " + lt.contains("Bobby"));
        System.out.println("Checking if there is a value Amy in the List: "+ lt.contains("Amy"));

    }
}