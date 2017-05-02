package fr.unice.polytech.transmission.requests;

import fr.unice.polytech.Idea;
import fr.unice.polytech.transmission.Transmission;
import fr.unice.polytech.transmission.Type;

/**
 * Created by user on 02/05/2017.
 */
public class ListParticipants implements Request {

    private final Idea idea;

    public ListParticipants() {
        this(new Idea());
    }

    public ListParticipants(Idea idea) {
        this.idea = idea;
    }

    public Type getType() {
        return Type.PARTICIPANT_LIST;
    }
}
