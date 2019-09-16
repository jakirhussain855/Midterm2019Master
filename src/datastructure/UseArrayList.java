package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        ArrayList<String> name = new ArrayList<String>();
        LinkedList linkedList = new LinkedList();
        System.out.println("size= "+name.size());

//adding elements
        name.add("JAlIL");
        name.add("JALAL");
        name.add("JAMIL");
        name.add("JULIAN");
        name.add("JARIF");
        name.add("Boksh");
        System.out.println(name);
        System.out.println("size= "+name.size());
        System.out.println("*******>>>>>NEXT<<<********");
//using for each loop

        for(int x=0;x<name.size();x++){
            System.out.println(name.get(x));
        }
        System.out.println("*******>>>NEXT<<<*********");
//removing element
        name.remove(5);
        for(int x=0;x<name.size();x++){
            System.out.println("After removing element : "+name.get(x));
        }
        System.out.println("******>>>NEXT IS ITERATOR<<<******");
//using iterator

        linkedList.add("MD jalil ");
        linkedList.add("MD JAMIL");
        linkedList.add("MD JARIF");
        linkedList.add("MD RAZZAK");
        Iterator iterator = linkedList.iterator();
        System.out.println(linkedList.peek());
        System.out.println(linkedList.element());
        while (iterator.hasNext())
            System.out.println(iterator.next()+ " ");
        System.out.println();


    }


}