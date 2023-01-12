package wk9hw;
/*
5. Write a Java program to test an array list is empty or not. Define array list with
underground tube names
 */
import java.util.ArrayList;

import java.util.Collection;

public class B5 {
    public static void main(String[] args)
    {

        ArrayList myArrayList = new ArrayList();

        myArrayList.add("Finchley");
        myArrayList.add("Swiss cottage");
        myArrayList.add("Hammersmith");
        myArrayList.add("East Finchley");
        myArrayList.add("Palmersgreen");
        myArrayList.add("Muswell hill");
        myArrayList.add("Kilburn");
        myArrayList.add("West Hamstead");
        myArrayList.add("Hamstead heath");
        myArrayList.add("Kingsbury");

        if (myArrayList.isEmpty())
        {
            System.out.println("The ArrayList is empty");
        }
        else
        {
            System.out.println("The ArrayList is not empty");
        }
    }
}