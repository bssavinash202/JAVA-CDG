package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
	private static ServerSocket ss;

	private static int p = 1234;

	public static void handleClient() {

		Socket link = null;

		try {
			// accept() method return a new socket object for each client
			link = ss.accept();

			/*
			 * InputStreamReader ir = new InputStreamReader(link.getInputStream());
			 * BufferedReader input = new BufferedReader(ir);
			 */

			// input stream to receive messages from client
			BufferedReader input = new BufferedReader(new InputStreamReader(link.getInputStream()));

			// send the message to the client using output stream
			PrintWriter output = new PrintWriter(link.getOutputStream(), true);

			// Read the message from client
			String message = input.readLine();

			// number of messages received
			int numMess = 0;

			while (!message.equals("***CLOSE***")) {
				System.out.println("Message Received");
				numMess++;
				output.println("Message" + numMess + ":" + message);

				// read next message from the client
				message = input.readLine();
			}

			// after receiving ***CLOSE*** , send the total number of messages received

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Closing the connectiom..!");
				// close the socket connection after communication ends
				link.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Opening port...!");
		try {
			ss = new ServerSocket(p);
		} catch (IOException e) {
			e.printStackTrace();
		}

		do {
			handleClient();
		} while (true);

	}

}
