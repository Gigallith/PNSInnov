package fr.unice.polytech.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by user on 03/05/2017.
 */
public class ClientAddStudent {

    public static void main(String[] args) {

        Socket socket;
        BufferedReader in;
        PrintWriter out;

        try {
            socket = new Socket(InetAddress.getLocalHost(), 15555);




            socket.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
