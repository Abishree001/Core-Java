// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main Program Class
public class CustomExceptionExample {
    // Method to check age
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        try {
            checkAge(16);  // Change this to 20 to see success
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
