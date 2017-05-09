package fr.unice.polytech.server;

import fr.unice.polytech.Project;
import fr.unice.polytech.transmission.answers.*;
import fr.unice.polytech.transmission.requests.AddIdea;
import fr.unice.polytech.transmission.requests.JoinIdea;
import fr.unice.polytech.transmission.requests.ListParticipant;
import fr.unice.polytech.transmission.requests.Request;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;


/**
 * @author Marion
 */
public class Server extends Thread{
    private final Socket socket;
    private final ObjectOutputStream out;
    private final ObjectInputStream in;
    private final Project project;

    public Server(Socket socket, int port, Project project) throws IOException {
        this.socket = socket;
        out = new ObjectOutputStream(new PrintStream(socket.getOutputStream()));
        in = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
        this.project = project;
    }

    public void run(){

        try
        {
            Request request = (Request) in.readObject();
            switch (request.getType()){
                case ADD :
                    AddIdea idea = (AddIdea) request;
                    project.addIdea(idea.getIdea());
                    out.writeObject(new AddIdeaResult(new RespondingCode(0)));
                    break;
                case JOIN :
                    JoinIdea joinIdea = (JoinIdea) in.readObject();
                    project.addStudentToAProject(joinIdea.getIdea(),joinIdea.getStudent());
                    out.writeObject(new JoinIdeaResult(new RespondingCode(0)));
                    break;
                case IDEA_LIST:
                    out.writeObject(new ListIdeaResult(new RespondingCode(0),new HashSet<>(project.getIdeaSet())));
                    break;
                case PARTICIPANT_LIST:
                    ListParticipant listPartcipant = (ListParticipant) request;
                    out.writeObject(new ListParticipantResult(new RespondingCode(0),project.getStudentListOfAProject(listPartcipant.getIdea())));
                    break;
                default:
                    out.writeObject(new JoinIdeaResult(new RespondingCode(5)));
                    break;
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = null;
        Project project = new Project();
        boolean listening = true;
        try {
            serverSocket = new ServerSocket(15555);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 15555.");
            System.exit(-1);
        }
        while (listening) {
            Server server = new Server(serverSocket.accept(), 15555, project);
            server.run();
        }
        serverSocket.close();
    }
}
