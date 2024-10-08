import java.sql.*;

public class pract18_ex2 
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
 
         String query = "Select RollNo,Name from dbtest.student_table where Percent > 70.0";
         ResultSet resultSet = statement.executeQuery(query);
 
         // Printing the table 
         
         while(resultSet.next())// Return boolean value 1.True if rows are remaining 2.false if rows are not remaining
         {
             int r = resultSet.getInt("RollNo");
             String n = resultSet.getString("Name");

             System.out.print("Roll No:" + r + " Name:" + n );
 
             System.out.println("\n");
         }
 
        }
 
        catch(Exception e)
        {
         e.printStackTrace();
        }

        
    }
    
}
