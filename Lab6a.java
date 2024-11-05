import java.util.HashSet;

public class Lab6a{
    public static void main(String[] args){
        HashSet<String> hs=new HashSet<>();
        hs.add("apple");
        hs.add("banana");
        hs.add("pineapple");

        String elementToAppend = "litchi";
        hs.add(elementToAppend);
        System.out.println("Updated HashSet: "+hs);

    }
}