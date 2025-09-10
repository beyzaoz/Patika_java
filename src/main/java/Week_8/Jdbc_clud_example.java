package Week_8;

import java.net.URL;
import java.sql.*;

public class Jdbc_clud_example {

    private static final String URL = "jdbc:postgresql://localhost:5432/dvrental";
    private static final String user = "postgres";
    private static final String password = "6769Berk.";

    static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(URL, user,password)){
            System.out.println("Connected to Database");
            readEmployees(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void readEmployees(Connection connection) {
        String sql = """
                SELECT ac.actor_id, ac.first_name , ac.last_name FROM actor ac LEFT JOIN address ad ON ac.address_id = ad.actor_id
                """;

        try(Statement statement = connection.createStatement()) {
             ResultSet resultSet = statement.executeQuery(sql);
             System.out.println("---Actor List---");
             while (resultSet.next()){
                 System.out.printf("ID: %d, name: %s, lastname: %s",
                         resultSet.getInt("address_id"),
                         resultSet.getString("address"),
                         resultSet.getString("")); //%d decimal, %s string deger
             }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
