package fr.unice.polytech.transmission.answers;

import fr.unice.polytech.transmission.Type;

/**
 * Created by user on 02/05/2017.
 */
public class AddIdeaResult implements Answer {
    private final RespondingCode rc;

    public AddIdeaResult() {this(new RespondingCode());}

    public AddIdeaResult(RespondingCode rc) {
        this.rc = rc;
    }

    public Type getType() {
        return Type.ADD;
    }
}
