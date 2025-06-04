/*
Creates a simple echo server.
If this code is run on a linux terminal (as a "server"), 
type "nc localhost 8899" (Netcat) on another terminal to simulate a client and connect to the server.
Any message typed in the "client" terminal will be sent to the "server" and be sent back.
*/

import java.net.*;
import java.io.*;

public class EchoServer
{
	public static void main(String[] args) throws IOException
	{
		ServerSocket serverSocket = null;

		try
		{
			serverSocket = new ServerSocket(8899);
		}
		catch (IOException ex)
		{
			System.out.println("[-] Couldn't listen on port number 8899");
			System.exit(1);
		}

		
		System.out.println("[+] Listening for connection...");

		Socket clientSocket = null;

		try
		{
			clientSocket = serverSocket.accept();
		}
		catch (IOException ex)
		{
			System.out.println("[-] Couldn't accept.");
			System.exit(1);
		}

		System.out.println("[+] Connection successful.");

		
		
		PrintWriter output = new PrintWriter( clientSocket.getOutputStream(), true );
		BufferedReader input = new BufferedReader( new InputStreamReader( clientSocket.getInputStream() ) );

		String inputLine;

		
		while ((inputLine = input.readLine()) != null)
		{
			System.out.println("Server: " + inputLine);
			output.println(inputLine);

			if (inputLine.equals("end"))
				break;
		}

		output.close();
		input.close();
		clientSocket.close();
		serverSocket.close();
	}
}
