import java.util.HashMap;

public class Lab7b {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }

        map.put("name", "Neetu");

        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.The HashMap is: "+ map);
        }
    }
}