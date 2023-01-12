package wk9hw;
/*
2. -Read the numbers from the console entered by the user and print the
minimumand maximum number the user has entered.
-Before the user entersthe number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */
import java.util.Scanner;
public class A2MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int i=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int a;
        while( i >= 0){
            System.out.print("Enter Number :");
            if (Sc.hasNextInt())
            {
                a = Sc.nextInt();
            }
            else {
                System.out.println("Invalid Input");
                break;
            }  i++;
            if(a > max)
            {
                max = a;
            }
            if(a < min)
            {
                min = a;
            }
        }
        System.out.println("Maximum Number: " + max);
        System.out.println("Minimum Number: " + min);
    }
}