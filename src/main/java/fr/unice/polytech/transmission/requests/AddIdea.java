package fr.unice.polytech.transmission.requests;

import fr.unice.polytech.Idea;
import fr.unice.polytech.transmission.Type;

/**
 * Created by user on 26/04/2017.
 */
public class AddIdea implements Request{
    private final Idea idea;

    public AddIdea() {
        this(new Idea());
    }

    public AddIdea(Idea idea) {
        this.idea = idea;
    }

    public Type getType() {
        return Type.ADD;
    }

    public Idea getIdea() {
        return idea;
    }
}
