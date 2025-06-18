import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String data = scanner.nextLine();

            FileWriter writer = new FileWriter("output.txt");
            writer.write(data);
            writer.close();

            System.out.println("Data written to output.txt.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
