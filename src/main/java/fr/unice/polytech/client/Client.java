package fr.unice.polytech.client;

import fr.unice.polytech.old.Idea;
import fr.unice.polytech.old.Student;
import fr.unice.polytech.old.Techno;
import fr.unice.polytech.old.transmission.Type;
import fr.unice.polytech.old.transmission.requests.AddIdea;
import fr.unice.polytech.old.transmission.requests.JoinIdea;
import fr.unice.polytech.old.transmission.requests.ListParticipant;

import fr.unice.polytech.old.transmission.requests.ListIdea;
import fr.unice.polytech.old.transmission.requests.Request;

import java.io.*;
import java.net.Socket;
import java.util.Arrays;

/**
 * Created by user on 08/05/2017.
 */
public class Client implements Runnable {
    private final Socket socket;
    private final ObjectOutputStream out;
    private final ObjectInputStream in;
    private final Type argument;

    public Client(String host, int port, Type argument) throws IOException {
        this.argument = argument;
        socket = new Socket(host, port);
        out = new ObjectOutputStream(socket.getOutputStream());
        in = new ObjectInputStream(socket.getInputStream());
    }


    public void run() {
        Student nicola = new Student("Nicola", "nicola@bonnenuit.lespetits");
        Student pimprenelle = new Student("Pimprenelle", "pimprenelle@bonnenuit.lespetits");
        Student nounours = new Student("Nouours", "nounours@bonnenuit.lespetits");
        Student oscar = new Student("Oscar", "oscar@bonnenuit.lespetits");

        Idea idea = new Idea("Nicola et Oscar font la bagare", Arrays.asList(Techno.JAVA), pimprenelle);

        Request[] requests = {new AddIdea(idea), new JoinIdea(nounours, idea), new ListParticipant(idea), new ListIdea()};

        try {
            out.writeObject(requests[argument.ordinal()]);
            System.out.println(in.readObject());
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        if (args.length != 1)
            throw new IllegalArgumentException();
        Type argument = Type.valueOf(args[0]);
        //Client client = new Client("10.212.127.229", 15555, argument);
        Client client = new Client(null, 15555, argument);
        new Thread(client).start();
    }

}