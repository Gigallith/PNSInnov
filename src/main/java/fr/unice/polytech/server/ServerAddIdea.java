package fr.unice.polytech.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Marion
 */
public class ServerAddIdea {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket;
        Socket socket;
        ObjectInputStream in;
        ObjectOutputStream out;

        serverSocket = new ServerSocket(15555);
        socket = serverSocket.accept();
        out = new ObjectOutputStream(new PrintStream(socket.getOutputStream()));
        in = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
    }
}
