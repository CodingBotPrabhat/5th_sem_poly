import java.sql.*;

public class pract18_X1
{
    private static final String url = "jdbc:mysql://localhost:3306/dbtest";
    private static final String username = "root";
    private static final String pasword = "ksp1303@@##ok"; 

    public static void main(String[] args) 
    {
       try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c =  DriverManager.getConnection(url, username, pasword);
        Statement s = c.createStatement();

        String q = String.format("INSERT INTO dbtest.student_table(RollNo , Name, Percent) VALUES(%d , '%s' , %f )" ,1333  , "Sahil" , 94.98);   

        s.executeUpdate(q);

        System.out.println("Connection successful");

    }
    catch(Exception e)
    {
       e.printStackTrace();
    }   }

}