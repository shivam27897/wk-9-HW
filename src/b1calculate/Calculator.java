package b1calculate;

public class Calculator {
    public void addition(int a, int b) {
        System.out.println(a+b);
    }
    public void subtraction( int a, int b) {
        System.out.println(a-b);
    }
    public void division( int a, int b) {
        System.out.println(a/b);
    }
    public void multiplication( int a, int b) {
        System.out.println(a*b);
    }
    public static int calculateResult(int a, int b, char symbol )
    {
        int ans = 0;
        if (symbol == '+') {
            ans = a+b;
        } else if (symbol == '-') {
            ans = a-b;
        } else if (symbol == '/') {
            ans = a/b;
        } else if (symbol == '*') {
            ans = a*b;
        }
        System.out.println("The Answer is " + ans);
        return ans;
    }
}