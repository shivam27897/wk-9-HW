package wk9hw;
/*
10. Write program and add all group members names in to array and iterates
through for each loop and print your name
 */
public class B10 {
    public static void main(String[] args) {

        String[] group = {"Shivam","Dhwanil","Akshit","Jigar","Arpita"};
        System.out.println("My Name : "+group[0].toUpperCase());
        System.out.println(
                "My Group Members : ");
        for (String s : group) {
            System.out.println(s);
        }
    }
}
