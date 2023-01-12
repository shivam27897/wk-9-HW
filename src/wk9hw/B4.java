package wk9hw;
/*
4. Write a Java program to iterate through all elements in an array list using
Iterator.
 */
import java.util.*;
public class B4 {
    public static void main(String[] args) {

        List<String> list_Strings = new ArrayList<String>();

        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        for (String element : list_Strings)
        {
            System.out.println(element);
        }
    }
}

