import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicate, will not be added

        System.out.println("Colors in the HashSet: " + colors);
    }
}
