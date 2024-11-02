package NETWORKING.TCP_P2;

import java.io.*;
import java.net.*;

public class chatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(4521);
             Socket clientSocket = serverSocket.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Client connected. Start chatting!");

            // Thread to read messages from the client
            Thread readThread = new Thread(() -> {
                String messageFromClient;
                try {
                    while ((messageFromClient = in.readLine()) != null) {
                        System.out.println("Client: " + messageFromClient);
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed by client.");
                }
            });

            // Start the thread
            readThread.start();

            // Loop to read messages from the server's terminal and send to the client
            String messageFromServer;
            while ((messageFromServer = consoleInput.readLine()) != null) {
                out.println(messageFromServer);
            }

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

