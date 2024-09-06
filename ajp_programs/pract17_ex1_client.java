import java.io.*;
import java.net.*;
class pract17_ex1_client
{   public static InetAddress ia;
    public static byte [] b = new byte[1204];
    public static int cport =789 , sport = 790;
    public static void main(String[] args) throws IOException
    {   DatagramSocket cs = new DatagramSocket(cport);
        DatagramPacket dp = new DatagramPacket(b , b.length);
        BufferedReader br =new BufferedReader(new InputStreamReader (System.in));
        ia = InetAddress.getLocalHost();
        System.out.println("Client Running");
        while(true)
        {
            String str = new String(br.readLine());
            b = str.getBytes();
            if(str.equals("STOP"))
            {
                System.out.println("Terminated");
                cs.send(new DatagramPacket(b, str.length() , ia , sport));
                break;}
            cs.send(new DatagramPacket(b, str.length() , ia , sport));
            cs.receive(dp);
            String str2 = new String(dp.getData() , 0 , dp.getLength());
            System.out.println("Server says : " + str2);
        }}}