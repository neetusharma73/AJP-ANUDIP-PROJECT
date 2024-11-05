import java.util.ArrayList;
import java.util.Collections;

public class Lab5b {
    public static void main(String[] args) {
        ArrayList<String> strL = new ArrayList<String>();
        strL.add("january");
        strL.add("march");
        strL.add("may");
        strL.add("july");
        strL.add("september");

        System.out.println("Original list: " + strL);

        Collections.reverse(strL);

        System.out.println("Reversed list: " + strL);
    }
}