package fr.unice.polytech.transmission.answers;

import fr.unice.polytech.transmission.RespondingCode;
import fr.unice.polytech.transmission.Type;

/**
 * Created by user on 02/05/2017.
 */
public class AddIdeaResult extends Answer {
    private final RespondingCode rc;

    public AddIdeaResult(RespondingCode rc) {
        super(Type.ADD);
        this.rc = rc;
    }
}
