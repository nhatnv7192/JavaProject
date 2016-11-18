package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketNew {
	static Socket socket = null;
	static OutputStream output = null;
	static BufferedWriter writerOuput =null;
	static BufferedReader readInput =null;
	public static void main(String[] args) {
		
		try
		{
			//khoi tao 1 Server Socket
			ServerSocket serverSocket = new ServerSocket(6969);
			System.out.println("Server dang doi ket noi tu client......");
			
			//Mo cong, cho phep client ket noi toi Server
			socket = serverSocket.accept();
			System.out.println("Ket noi thanh cong ........");
			
			//send data from Server to Client
			output = socket.getOutputStream();
			writerOuput = new BufferedWriter(new OutputStreamWriter(output));
			
			//get data to Client
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(true)
					{
						String message = new Scanner(System.in).nextLine();
						try 
						{
							writerOuput.write(message);
							writerOuput.newLine();
							writerOuput.flush();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).start();
			while(true)
			{
				InputStream input = socket.getInputStream();
				readInput = new BufferedReader(new InputStreamReader(input));
				String messageInput = readInput.readLine();
				System.out.println("Client :"+messageInput);
			}
			
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try 
		{
			writerOuput.close();
			readInput.close();
			socket.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
