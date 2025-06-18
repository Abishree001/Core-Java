import java.sql.*;

public class StudentDAO {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db";

        String createTableSql = "CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY, name TEXT)";
        String insertSql = "INSERT INTO students (id, name) VALUES (?, ?)";
        String updateSql = "UPDATE students SET name = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                // Create table if it doesn't exist
                try (Statement stmt = conn.createStatement()) {
                    stmt.execute(createTableSql);
                }

                // Insert operation
                try (PreparedStatement pstmt = conn.prepareStatement(insertSql)) {
                    pstmt.setInt(1, 1);
                    pstmt.setString(2, "John Doe");
                    pstmt.executeUpdate();
                    System.out.println("Insert completed.");
                }

                // Update operation
                try (PreparedStatement pstmt = conn.prepareStatement(updateSql)) {
                    pstmt.setString(1, "Jane Doe");
                    pstmt.setInt(2, 1);
                    pstmt.executeUpdate();
                    System.out.println("Update completed.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
