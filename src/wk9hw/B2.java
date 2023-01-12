package wk9hw;

import java.util.Scanner;

/*
Re write the student mark sheet program using if else and while loop.
 */
public class B2 {
    static String name;
    static int RollNo, Maths, Science, English;

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Name:" );
        name = Sc.next();
        System.out.println("Enter roll no:");
        RollNo = Sc.nextInt();
        System.out.println("Enter Maths marks:");
        Maths = Sc.nextInt();
        System.out.println("Enter Science marks:");
        Science = Sc.nextInt();
        System.out.println("Enter English marks:");
        English = Sc.nextInt();
        int Total = Maths + Science + English;
        double Per = (Total*100/300);
        System.out.println("____________________________________");
        System.out.println("|                                  |");
        System.out.println("|            Mark Sheet            |");
        System.out.println("|__________________________________|");
        System.out.println("|      Name       :    " + name + "      |");     // calling all declared static variable in class
        System.out.println("|      Roll No.   :    " + RollNo + "           |"); //       into main method directly
        System.out.println("|----------------------------------|");
        System.out.println("|      Subjects   :    " + "Marks" + "       |");
        System.out.println("|----------------------------------|");
        if (Maths <= 100 && Maths >= 0) {                           //if condition true system will enter the block
            System.out.println("|      Maths      :    " + Maths + "          |");
        } else {
            System.out.println("Invalid Input");                   //if condition wrong then only system enter this block
        }
        if (Science <= 100 && Science >= 0) {
            System.out.println("|      Science    :    " + Science + "          |");
        } else {
            System.out.println("Invalid Input");
        }
        if (English <= 100 && English >= 0) {
            System.out.println("|      English    :    " + English + "          |");  //using concatinaton to add multiple sting using'+'
        } else {
            System.out.println("Invalid Input");
        }
        System.out.println("|----------------------------------|");
        System.out.println("|      Total      :    " +Total +"         |");
        System.out.println("|----------------------------------|");
        System.out.println("|      Percentage :    " + Per + " %      |");
        if (Per >= 35) {
            System.out.println("|      Result     :    PASS        |");
        } else {
            System.out.println("|      Result     :    FAIL        |");
        }
        if (Per >= 80) {
            System.out.println("|      Grade      :    A+          |");
        } else if (Per <= 80 && Per >= 60) {
            System.out.println("|      Grade      :    A           |");
        } else if (Per <= 60 && Per >= 50) {
            System.out.println("|      Grade      :    B           |");
        } else if (Per <= 50 && Per >= 35) {
            System.out.println("|      Grade      :    C           |");
        } else {
            System.out.println("Fail");
        }
        System.out.println("|----------------------------------|");
    }
}