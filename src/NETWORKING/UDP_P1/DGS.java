package NETWORKING.UDP_P1;
import java.net.*;
import java.io.*;

public class DGS {
    public static void main(String[] args) throws IOException {
        try {
            //Declaring address and port
            InetAddress is = InetAddress.getByName("127.0.0.1");
            int port = Integer.parseInt("2050");
            String msg = "Welcome To The Networking";
            //Stuffing Msg in the form of bytes in the data
            byte data[] = msg.getBytes();
            DatagramSocket DS = new DatagramSocket();
            //Creating datagram with ip address and port number
            DatagramPacket DP = new DatagramPacket(data, data.length, is, port);
            DS.send(DP);
            DS.close();
        }
        catch (Exception e){
            System.out.println("Exception:- "+e);
        }

    }
}
