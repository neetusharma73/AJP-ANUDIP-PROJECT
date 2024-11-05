import java.util.HashMap;

public class Lab7a {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Name", "Neetu Sharma");
        map.put("Course", "MCA");
        map.put("Year", "2nd");

        System.out.println("Current HashMap is: " + map);

        String key = "age";
        String value = "21";
        map.put(key, value);

        System.out.println("Updated HashMap is: " + map);
    }
}