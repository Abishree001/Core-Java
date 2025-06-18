public class TypeCastingExample {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d;  // Explicit cast

        int j = 10;
        double dd = j;    // Implicit cast

        System.out.println("Double to int: " + i);
        System.out.println("Int to double: " + dd);
    }
}
