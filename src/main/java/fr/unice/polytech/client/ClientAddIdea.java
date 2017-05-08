package fr.unice.polytech.client;

import fr.unice.polytech.Idea;
import fr.unice.polytech.Student;
import fr.unice.polytech.Techno;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;


public class ClientAddIdea {

    public static void main(String[] args) {

        Socket socket;
        ObjectInputStream in;
        ObjectOutputStream out;

        Student nicola = new Student("Nicola", "nicola@bonnenuit.les petits");
        Student pimprenelle = new Student("Pimprenelle", "pimprenelle@bonnenuit.les petits");
        Student nounours = new Student("Nouours", "nounours@bonnenuit.les petits");
        Student oscar = new Student("Oscar", "oscar@bonnenuit.les petits");

        Idea idea = new Idea("Nicola et Oscar font la bagare", Arrays.asList(Techno.JAVA), pimprenelle);

        try {
            socket = new Socket(InetAddress.getLocalHost(), 15555);

            out = new ObjectOutputStream(new PrintStream(socket.getOutputStream()));
            in = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));






            socket.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
