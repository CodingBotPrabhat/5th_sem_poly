import java.net.*;
import java.io.*;
class pract16_ex1_client
{
	public static void main(String arg[]) throws Exception
	{
		Socket s = new Socket("localhost" , 3333);
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "  " , str2 = "  ";
		while(!str.equals("stop"))
		{
			str = br.readLine();
			dout.writeUTF(str);
			dout.flush();
			str2 = din.readUTF();
			System.out.println("Server says " +str2);
		}
			dout.close();
			s.close();
	}
}