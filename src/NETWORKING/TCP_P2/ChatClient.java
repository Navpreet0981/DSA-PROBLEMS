package NETWORKING.TCP_P2;

import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 4521);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to the server. Start chatting!");

            // Thread to read messages from the server
            Thread readThread = new Thread(() -> {
                String messageFromServer;
                try {
                    while ((messageFromServer = in.readLine()) != null) {
                        System.out.println("Server: " + messageFromServer);
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed by server.");
                }
            });

            // Start the thread
            readThread.start();

            // Loop to read messages from the client's terminal and send to the server
            String messageFromClient;
            while ((messageFromClient = consoleInput.readLine()) != null) {
                out.println(messageFromClient);
            }

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

