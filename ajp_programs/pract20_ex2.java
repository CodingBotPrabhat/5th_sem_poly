import java.sql.*;
public class pract20_ex2 
{
    private static final String url = "jdbc:mysql://localhost:3306/dbtest";
    private static final String username = "root";
    private static final String pasword = "ksp1303@@##ok"; 
    public static void main(String[] args) 
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, pasword) ;
        Statement statement = connection.createStatement();
        String query = String.format("DELETE FROM dbtest.product WHERE Price=%d AND Id= '%s' " , 500 , "P1234");
        statement.executeUpdate(query);
        System.out.println("Connection successful");

        }
        catch(Exception e)
        {
         e.printStackTrace();
        }
}   
}
