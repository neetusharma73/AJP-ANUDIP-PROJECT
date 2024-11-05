import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Iterator;


public class Lab8b {
    public static void main(String[] args) {
        //Tree map navigation example
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        // Using a for-each loop with entrySet()
        System.out.println("Using entrySet:");
        for (Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("\nUsing keySet:");
        for (String key : treeMap.keySet()) {
            System.out.println(key + " = " + treeMap.get(key));
        }
        
        System.out.println("\nUsing values:");
        for (Integer value : treeMap.values()) {
            System.out.println(value);
        }

        System.out.println("\nUsing forEach method:");
        treeMap.forEach((key, value) -> System.out.println(key + " = " + value));

        System.out.println("\nUsing Iterator:");
        Iterator<Entry<String, Integer>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        
    }
}