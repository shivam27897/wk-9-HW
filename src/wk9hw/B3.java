package wk9hw;
/*
3. Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.
 */
import java.util.*;
public class B3 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        for(int i=1; i<=1; i++){
            color.add("White");}
        for(int i=1; i<=2; i++){
            color.add("Black");}
        for(int i=1; i<=3; i++){
            color.add("Blue");}
        for(int i=1; i<=4; i++){
            color.add("Red");}
        for(int i=1; i<=5; i++){
            color.add("Orange");}
        System.out.print(color);
    }
}