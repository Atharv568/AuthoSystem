import java.sql.*;
import DB.DBconnection;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DBconnection.getConnection();
            System.out.println("Database connected successfully!");
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

