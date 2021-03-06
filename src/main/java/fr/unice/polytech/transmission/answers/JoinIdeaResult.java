package fr.unice.polytech.transmission.answers;

import fr.unice.polytech.transmission.Type;


/**
 * Created by user on 02/05/2017.
 */
public class JoinIdeaResult implements Answer {
    private final RespondingCode rc;

    public JoinIdeaResult() {this(new RespondingCode());}

    public JoinIdeaResult(RespondingCode rc) {
        this.rc = rc;
    }

    public Type getType() {
        return Type.JOIN;
    }

    public RespondingCode getRespondingCode() {
        return rc;
    }

    @Override
    public String toString() {
        return "JoinIdeaResult{" +
                "rc=" + rc +
                '}';
    }
}
