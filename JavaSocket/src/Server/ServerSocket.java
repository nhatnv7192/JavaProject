package Server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocket {
	static BufferedWriter bos = null;
	static Socket socket = null;
	static BufferedReader read = null;
	public static void main(String[] args) {
		try 
		{
			java.net.ServerSocket serverSocket = new java.net.ServerSocket(6969);
			//den lenh nay 
			//1.mo cong va cho ket noi tu CLient
			//dung moi xu ly cua thread nay (thread khac van xu ly) cho Client ket noi toi
			//khi co CLient ket noi toi thi tra ve 1 socket tuong ung
			System.out.println("Dang cho ket noi...");
			socket = serverSocket.accept(); 
			System.out.println("Da ket noi...");
			
			//send data Server to Client
			OutputStream out = socket.getOutputStream(); 
			
			bos = new BufferedWriter(new OutputStreamWriter(out));
			
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					InputStream input;
					try {
						input = socket.getInputStream();
						read = new BufferedReader(new InputStreamReader(input));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					while(true)
					{
						String message;
						try {
							message = read.readLine();
							System.out.println(message );
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
					
				}
			}).start();
			while(true)
			{
				String message = new Scanner(System.in).nextLine();
				bos.write(message);
				bos.newLine();
				bos.flush();
			}
			
			//get Data to Client send to Server
			
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try 
			 {
				bos.close();
				read.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
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
