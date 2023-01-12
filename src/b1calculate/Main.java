package b1calculate;

import java.util.Scanner;

import static b1calculate.Calculator.calculateResult;

public class Main {
    public static void main(String[] args) {
        char c;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter one of the symbol +,-,/,* :");
            char symbol = sc.next().charAt(0);
            System.out.println("Enter second number");
            int b = sc.nextInt();
            System.out.println("Total : ");
            calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation ? y or n ");
            c = sc.next().charAt(0);
        }
        while (c == 'y' || c == 'y');
    }
}
