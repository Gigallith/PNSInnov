package fr.unice.polytech.transmission.requests;

import fr.unice.polytech.Idea;
import fr.unice.polytech.transmission.Type;

/**
 * Created by user on 26/04/2017.
 */
public class AddIdea extends Request{
    private final Idea idea;

    public AddIdea(Idea idea) {
        super(Type.ADD);
        this.idea = idea;
    }
}
