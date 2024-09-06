import java.net.*;
class pract15_ex1
{
public static void main(String args[]) throws MalformedURLException
{
URL u1 = new URL("https://www.msbte.org.in");
System.out.println("Protocol: "+ u1.getProtocol());
System.out.println("Port: "+ u1.getPort());
System.out.println("Host: "+ u1.getHost());
System.out.println("File: "+ u1.getFile());
}
}