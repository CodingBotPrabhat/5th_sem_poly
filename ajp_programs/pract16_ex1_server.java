import java.net.*;
import java.io.*;
class pract16_ex1_server
{
	public static void main(String arg[]) throws Exception
	{
		ServerSocket ss = new ServerSocket(3333);
		Socket s = ss.accept();
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "  " , str2 = "  ";
		while(!str.equals("stop"))
		{
			str = din.readUTF();
			System.out.println("Client says " +str);
			str2 = br.readLine();
			dout.writeUTF(str2);
		}
			dout.flush();
			dout.close();
			s.close();
			ss.close();
	}
}