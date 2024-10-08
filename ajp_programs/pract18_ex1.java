import java.sql.*;
public class pract18_ex1 
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

        String q = String.format("CREATE TABLE dbtest.employee(emp_id INT(4) , emp_name VARCHAR(60))");
        String q2 = String.format("INSERT INTO dbtest.employee(emp_id , emp_name) VALUES(%d , '%s')" , 1303 , "Prabhat");   

        s.executeUpdate(q);
        s.executeUpdate(q2);

        System.out.println("Connection successful");

    }
    catch(Exception e)
    {
       e.printStackTrace();
    }   }
    
}
