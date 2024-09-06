import java.io.*;
import java.net.*;

class pract17_ex1_server
{
    public static InetAddress ia;
    public static byte [] b = new byte[1204];
    public static int cport =789 , sport = 790;
    public static void main(String[] args) throws IOException
    {
        DatagramSocket ss = new DatagramSocket(sport);
        DatagramPacket dp = new DatagramPacket(b , b.length);

        BufferedReader br =new BufferedReader(new InputStreamReader (System.in));
        
        ia = InetAddress.getLocalHost();

        System.out.println("Server Running");

        while(true)
        {
            ss.receive(dp);
            String str = new String(dp.getData() , 0 , dp.getLength());
            if (str.equals("STOP"))
            {
                System.out.println("Terminated ");
                break;

            }
            System.out.println("Client says " +str);
            String str1 = new String(br.readLine());
            b = str1.getBytes();

            ss.send(new DatagramPacket(b , b.length , ia , cport));
        }
    }
}