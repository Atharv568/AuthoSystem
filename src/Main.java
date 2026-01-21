import java.sql.*;
public class DBconnection{
    private static final String url ="";
    private static final String username="";
    private static final String password="";

} public static void main(String args[]){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
    }catch(ClassNotFoundException e){
        System.out.println(e.getMessage());
    }
    try{
        Connection connection= DriverManager.getConnection(url, username, password);
    }catch (SQLException e){
        System.out.print(e.getMessage());
    }
}
