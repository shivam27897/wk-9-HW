package wk9hw;
/*
7. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */
import java.util.Map;
import java.util.HashMap;
public class B7 {
    public static void main(String[] args) {
        HashMap<String, Integer> person = new HashMap<>();
        person.put("Shivam", 101);
        person.put("Dhwanil", 102);
        person.put("Akshit", 103);
        person.put("Jigar", 104);
        person.put("Arpita", 105);

        for (Map.Entry<String, Integer> pair: person.entrySet()) {
            System.out.format("key: %s, value: %d%n", pair.getKey(), pair.getValue());
        }
    }
}

