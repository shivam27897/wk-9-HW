package wk9hw;
/*
8. Write the program that tell you which line pass through particular stations.
Just use Zone 1 stations name.
 */
import java.util.HashMap;

public class B8 {
    public static void main(String[] args) {
        HashMap<String, String> station = new HashMap<>();
        station.put("\nWestminster       ", "  Jubilee Line");
        station.put("\nAldgate           ", " Metropolitan Line");
        station.put(" \nOxford Circus     ", " Central Line");
        station.put(" \nLiverpool Street  ", " Elizabeth Line");
        station.put(" \nking's Cross      ", " Victoria Line");
        station.put(" \nPiccadilly Circus "," Piccadilly line ");

        System.out.println("Station & Tube Lines in Zone 1 :");
        System.out.println(station);
    }
}

