package fr.unice.polytech.rmi;

import fr.unice.polytech.transmission.answers.AddIdeaResult;
import fr.unice.polytech.transmission.answers.JoinIdeaResult;
import fr.unice.polytech.transmission.answers.ListIdeaResult;
import fr.unice.polytech.transmission.answers.ListParticipantResult;
import fr.unice.polytech.transmission.requests.AddIdea;
import fr.unice.polytech.transmission.requests.JoinIdea;
import fr.unice.polytech.transmission.requests.ListIdea;
import fr.unice.polytech.transmission.requests.ListParticipant;

import java.io.IOException;
import java.rmi.*;
/**
 * @author Marion
 */
public interface RimRequest extends Remote{

    AddIdeaResult add(AddIdea addIdea) throws RemoteException;
    JoinIdeaResult join(JoinIdea joinIdea) throws RemoteException;
    ListIdeaResult listIdea(ListIdea listIdea) throws RemoteException;
    ListParticipantResult listParticipants(ListParticipant listParticipant) throws RemoteException;

}

