package Week_8;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Database {
    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/testdb"; // Veritabanı ismi: testdb
//        String username = "root";
//        String password = "1234";
//
//        String createTableSQL = "CREATE TABLE IF NOT EXISTS users ("
//                + "id INT PRIMARY KEY AUTO_INCREMENT, "
//                + "name VARCHAR(50) NOT NULL, "
//                + "email VARCHAR(100) NOT NULL UNIQUE, "
//                + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
//                + ")";
//
//        String insert = """
//                INSERT INTO users (id,username,birthday) VALUES (?,?,?)
//                """;
//
//
//        try (Connection conn = DriverManager.getConnection(url, username, password);
//             Statement stmt = conn.createStatement()) {
//
//            stmt.executeUpdate(createTableSQL);
//            System.out.println("✅ 'users' tablosu başarıyla oluşturuldu.");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}}
