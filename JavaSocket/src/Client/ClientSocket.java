package Client;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {
	static BufferedWriter writer = null;
	static Socket socket = null;
	static BufferedReader buffInput=null;
	static OutputStream outputClient = null;
	public static void main(String[] args) {
		
		//de ket noi tu Client den server chi can new Socket
		try 
		{
			System.out.println("Dang Ket noi toi Servet.....");
			socket = new Socket("192.168.1.97", 6969);
			System.out.println("Ket noi den server thanh cong");
			
			InputStream inputClient = socket.getInputStream();
			
			buffInput = new BufferedReader(new InputStreamReader(inputClient));
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(true)
					{
						try {
							String ouput = buffInput.readLine();
							System.out.println("Server :"+ouput);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
				}
			}).start();
			//sent message Client to Server
			outputClient = socket.getOutputStream();
			writer = new BufferedWriter(new OutputStreamWriter(outputClient));
			while(true)
			{
				String message = new Scanner(System.in).nextLine();
				writer.write(message);
				writer.newLine();
				writer.flush();
			}
			
		} 
			
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				writer.close();
				buffInput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
