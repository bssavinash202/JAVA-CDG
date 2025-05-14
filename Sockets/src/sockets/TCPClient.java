package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	private static InetAddress host;
	private static final int port = 1234;

	public static void main(String[] args) {
		try {
			host = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			System.out.println("Host not Found..!");
			System.exit(1);
		}
		accessServer();
	}

	public static void accessServer() {
		// socket to connect to the server
		Socket link = null;
		try {
			// establish connection link with the server.
			link = new Socket(host, port);
			// create input stream to recieve data from the server
			BufferedReader input = new BufferedReader(new InputStreamReader(link.getInputStream()));
			// create output stream to send data to the server..
			PrintWriter ouput = new PrintWriter(link.getOutputStream(), true);
			// take the input from the user and send it to server;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String message;
			do {
				System.out.println("Enter the message");
				message = br.readLine();
				// sends the message to the server
				ouput.println(message);

				String response;
				// reads servers response
				response = input.readLine();
				System.out.println("\nServer> " + response);
			} while (!message.equals("***CLOSE***"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				link.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Unable to disconnect..!");
				System.exit(1);// exit the program if failed to close
			}
		}
	}
}
