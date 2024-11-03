package NETWORKING.UDP_P1;
import jdk.jshell.spi.ExecutionControl;

import java.net.*;
import java.io.*;

public class DGR {
    public static void main(String[] args) throws IOException {
        try{
            //Declaring port number on which it has to listen the data
            int port = Integer.parseInt("2050");
            //Declare Datagram object to receive datagram
            DatagramSocket DS = new DatagramSocket(port);
            byte data[] = new byte[60];
            while (true){
                DatagramPacket DP = new DatagramPacket(data, data.length);
                DS.receive(DP);
                String msg = new String(DP.getData());
                System.out.println(msg);
            }
//                DS.close();
        }catch (Exception e){
            System.out.println("Exception:- "+e);
        }

    }
}
