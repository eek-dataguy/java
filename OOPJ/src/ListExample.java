import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits in the list:" + fruits);

        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit); 
        } 

        System.out.println("First fruit: " + fruits.get(0));

        fruits.remove("Banana");
        System.out.println("Fruits after removing Banana: " + fruits);
    }
}
