package collectiondemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraylistDemo2 {
    public static void main(String[] args){

        ArrayList al= new ArrayList();

        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        ArrayList al_dup= new ArrayList<>();
        al_dup.addAll(al);
        System.out.println(al_dup);

        al_dup.removeAll(al);
        System.out.println("after removing"+al_dup);

        //Sort
        System.out.println("Element in the array list:"+al);
        Collections.sort(al);
        System.out.println("Element in the array list after sorting:"+al);

        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Element in the array list after sorting in reverse order:"+al);

        //Shuffling
        Collections.shuffle(al);
        System.out.println("Element in the array list after shuffling:"+al);

    }
}
