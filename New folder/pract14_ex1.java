import java.net.*;
import java.io.*;
public class pract14_ex1 
{
public static void main (String[] args) throws UnknownHostException
{
try {
    InetAddress ip = InetAddress.getByName("localhost");
    System.out.println(ip.getHostName());
    System.out.println(ip.getAddress());
    
    
} catch (Exception e) {
    System.out.println(e);
}
}
}