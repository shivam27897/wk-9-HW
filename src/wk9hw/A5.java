package wk9hw;
/*
5. Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */
import java.util.Scanner;
public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c ;
        System.out.print("Input Number of Rows = ");
        c = sc.nextInt();
        for (a=1;a<=c;a++) {
            for (b = 1; b <= a; b++)
                System.out.print(b);
                System.out.println(" ");
        }
    }
}
