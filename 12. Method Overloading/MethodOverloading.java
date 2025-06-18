public class MethodOverloading {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Add int: " + add(2, 3));
        System.out.println("Add double: " + add(2.5, 3.5));
        System.out.println("Add three ints: " + add(1, 2, 3));
    }
}
