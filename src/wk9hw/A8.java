package wk9hw;
/*
8. Display left angle triangle of * using nested for loops
        *
      * *
    * * *
  * * * *
* * * * *
 */
public class A8 {
    public static void main(String[] args) {
        int row = 5;
        for (int i=0; i<row; i++){
            for (int j=2*(row-i);j>=0; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ ){
                System.out.print("* ");
            }System.out.println();
        }

    }
}