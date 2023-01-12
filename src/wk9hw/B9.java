package wk9hw;
/*
9. Write program and add all group names in to array and iterates through for
each loop.
 */
public class B9 {
    public static void main(String[] args) {

        String[] group = {"postman", "selenium", "Java", "Rest Assured"};
        System.out.println(
                "---- Group names ----");
        for (String s : group) {

            System.out.println(s);
        }
    }
}