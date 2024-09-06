import java.net.*;
import java.util.*;
public class pract15_ex2
{
public static void main (String[] args) throws Exception
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter URL : ");
String s = sc.nextLine();
URL hp = new URL (s);
URLConnection hpcon = hp.openConnection();
long d = hpcon.getDate();
if (d == 0)
{
System.out.println("No Date Available");}
else
{
System.out.println("Date : "+ new Date(d));
System.out.println("Content-type: "+ hpcon.getContentType());
d = hpcon.getExpiration();}
if (d == 0)
{
System.out.println("No Expiration Date Available");}
else{
System.out.println("Date Expiration : "+ new Date(d));
d = hpcon.getLastModified();}
if (d == 0){
System.out.println("No Modified Date Available");}
else
{
System.out.println("Date Modified : "+ new Date(d));}
int len = hpcon.getContentLength();
if (d == -1)
{
System.out.println("No Content Found");}

else{
System.out.println("Content Length : "+ len);}
}
}
