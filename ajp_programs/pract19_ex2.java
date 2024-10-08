
import java.sql.*;

public class pract19_ex2 
{
    private static final String url = "jdbc:mysql://localhost:3306/msbte";
    private static final String username = "root";
    private static final String pasword = "ksp1303@@##ok"; 

    public static void main(String[] args) 
    {
       try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c =  DriverManager.getConnection(url, username, pasword);
        Statement s = c.createStatement();

        String q = String.format("UPDATE msbte.student SET Percent = %f WHERE RollNo = %d" , 91.33 , 1333);   

        s.executeUpdate(q);

        System.out.println("Connection successful");

    }
    catch(Exception e)
    {
       e.printStackTrace();
    }   }


}