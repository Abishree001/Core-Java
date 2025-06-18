import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zoe", "Alice", "Bob", "John");
        names.sort((a, b) -> a.compareToIgnoreCase(b));
        System.out.println("Sorted list: " + names);
    }
}
