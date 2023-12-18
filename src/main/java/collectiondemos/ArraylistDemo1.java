package collectiondemos;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo1 {
    public static void main(String[] args) {
        //Declare ArrayList

        //ArrayList <Integer> al= new ArrayList<Integer>();
        //ArrayList <String> al= new ArrayList<String>();
        //List al= new ArrayList();
        ArrayList al= new ArrayList();

        //Add new elements to the arraylist
        al.add(100);
        al.add("welcome");
        al.add(15.5);
        al.add("A");
        al.add(true);

        System.out.println(al);

        //size
        System.out.println("Number of element in array list:"+al.size());

        //remove
        al.remove(1);
        al.remove("welcome");

        //insert a new element
        al.add(2,"python");
        System.out.println("After insertion:"+al);


        //retrive specific element
        System.out.println(al.get(2));


        //change element/replace
        al.set(2,"C++");
        System.out.println("After Replacing element"+al);

        //Search cointains()-Returns true/false
        System.out.println(al.contains("C++"));
        System.out.println(al.contains("C#"));

    }
}
