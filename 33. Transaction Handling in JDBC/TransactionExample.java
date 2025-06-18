import java.sql.*;

public class TransactionExample {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:bank.db"; // Ensure this path is correct.

        try (Connection conn = DriverManager.getConnection(url)) {
            conn.setAutoCommit(false); // Start transaction

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE accounts SET balance = balance - 100 WHERE id = 1");
            stmt.executeUpdate("UPDATE accounts SET balance = balance + 100 WHERE id = 2");

            conn.commit(); // Commit the transaction
            System.out.println("Transaction successful.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
