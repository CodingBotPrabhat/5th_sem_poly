import java.sql.*;
public class pract19_ex1 
{
    private static final String url = "jdbc:mysql://localhost:3306/msbte";
    private static final String username = "root";
    private static final String pasword = "ksp1303@@##ok"; 
    public static void main(String[] args) 
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
         Connection connection = DriverManager.getConnection(url, username, pasword) ;
         Statement statement = connection.createStatement();
         String query = "Select * from msbte.student";
         ResultSet resultSet = statement.executeQuery(query);
         // Printing the table 
         while(resultSet.next())
         {
             int r = resultSet.getInt("RollNo");
             String n = resultSet.getString("Name");
             Float p = resultSet.getFloat("Percent");
             System.out.print("Roll No:" + r + " Name:" + n +" Percent: " +p);
             System.out.println("\n");
         }
 
        }
        catch(Exception e)
        {
         e.printStackTrace();
        }
}}
