package fr.unice.polytech.rmi;

import fr.unice.polytech.transmission.answers.AddIdeaResult;
import fr.unice.polytech.transmission.answers.JoinIdeaResult;
import fr.unice.polytech.transmission.answers.RespondingCode;
import fr.unice.polytech.transmission.requests.AddIdea;
import fr.unice.polytech.transmission.requests.JoinIdea;
import fr.unice.polytech.transmission.requests.Request;

import java.io.*;
import java.net.Socket;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Marion
 */
public class RmiServer extends UnicastRemoteObject implements RimRequest {

    private final Socket socket;
    private final ObjectOutputStream out;
    private final ObjectInputStream in;
    private final fr.unice.polytech.Project project;
    private final Request request;

    public RmiServer(Socket socket, int port, fr.unice.polytech.Project project) throws IOException, ClassNotFoundException {
        this.socket = socket;
        out = new ObjectOutputStream(new PrintStream(socket.getOutputStream()));
        in = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
        this.project = project;
        request = (Request) in.readObject();
    }



    @Override
    public void add() throws IOException {
        AddIdea idea = (AddIdea) request;
        project.addIdea(idea.getIdea());
        out.writeObject(new AddIdeaResult(new RespondingCode(0)));
    }

    @Override
    public void join() throws IOException, ClassNotFoundException {
        JoinIdea joinIdea = (JoinIdea) in.readObject();
        project.addStudentToAProject(joinIdea.getIdea(),joinIdea.getStudent());
        out.writeObject(new JoinIdeaResult(new RespondingCode(0)));
    }
}
