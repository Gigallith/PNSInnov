package fr.unice.polytech.rmi;

import fr.unice.polytech.Project;
import fr.unice.polytech.transmission.answers.*;
import fr.unice.polytech.transmission.requests.AddIdea;
import fr.unice.polytech.transmission.requests.JoinIdea;
import fr.unice.polytech.transmission.requests.ListIdea;
import fr.unice.polytech.transmission.requests.ListParticipant;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashSet;


/**
 * Created by user on 23/05/2017.
 */
public class RmiRequestImplement extends UnicastRemoteObject implements RimRequest {
    private final Project project;

    RmiRequestImplement(Project project) throws RemoteException {
        super();
        this.project = project;
    }

    @Override
    public AddIdeaResult add(AddIdea addIdea) throws RemoteException {
        this.project.addIdea(addIdea.getIdea());
        return new AddIdeaResult(new RespondingCode(0));
    }

    @Override
    public JoinIdeaResult join(JoinIdea joinIdea) throws RemoteException {
        this.project.addStudentToAProject(joinIdea.getIdea(),joinIdea.getStudent());
        return new JoinIdeaResult(new RespondingCode(0));
    }

    @Override
    public ListIdeaResult listIdea(ListIdea listIdea) throws RemoteException {
        return new ListIdeaResult(new RespondingCode(0),new HashSet<>(project.getIdeaSet()));
    }

    @Override
    public ListParticipantResult listParticipants(ListParticipant listParticipant) throws RemoteException {
        return new ListParticipantResult(new RespondingCode(0), project.getStudentListOfAProject(listParticipant.getIdea()));
    }
}
