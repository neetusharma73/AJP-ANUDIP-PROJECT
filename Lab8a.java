import java.util.TreeMap;

public class Lab8a {
    public static void main(String[] args) {
        
        TreeMap<String, Integer> treeMap = new TreeMap<>(); // Creating a TreeMap
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);

        System.out.println("The Initial TreeMap: " + treeMap);

        Integer remValue = treeMap.remove("Two");
        System.out.println("The Removed value are= " + remValue);

        // condition for remove "three"
        boolean isRemoved = treeMap.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + isRemoved);

        System.out.println("Updated TreeMap: " + treeMap);
    }
}