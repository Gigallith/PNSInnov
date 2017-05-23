package fr.unice.polytech.rmi;

import fr.unice.polytech.Idea;
import fr.unice.polytech.Student;
import fr.unice.polytech.transmission.answers.AddIdeaResult;
import fr.unice.polytech.transmission.answers.JoinIdeaResult;
import fr.unice.polytech.transmission.answers.ListIdeaResult;
import fr.unice.polytech.transmission.answers.ListParticipantResult;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Paul DUPONT on 23/05/2017.
 * Cette interface est celle que nous aurions créés si nous avions conçu notre protocole d'application diréctement en RMI
 */
public interface RmiRequestSecond extends Remote {

    AddIdeaResult add(Idea idea) throws RemoteException;
    JoinIdeaResult join(Idea idea, Student student) throws RemoteException;
    ListIdeaResult listIdea() throws RemoteException;
    ListParticipantResult listParticipants(Idea idea) throws RemoteException;
}
