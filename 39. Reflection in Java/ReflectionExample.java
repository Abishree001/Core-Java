import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.util.ArrayList");
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }
    }
}
