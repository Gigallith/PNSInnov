package fr.unice.polytech.transmission.answers;

import fr.unice.polytech.Idea;
import fr.unice.polytech.Project;
import fr.unice.polytech.transmission.Type;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 02/05/2017.
 */
public class ListIdeaResult implements Answer {
    private final RespondingCode rc;
    private final Set<Idea> ideas;

    public ListIdeaResult() {
        this(new RespondingCode(), new HashSet<Idea>());
    }

    public ListIdeaResult(RespondingCode rc, Set<Idea> ideas) {
        this.ideas = ideas;
        this.rc = rc;
    }

    public Type getType() {
        return Type.IDEA_LIST;
    }

    @Override
    public String toString() {
        return "ListIdeaResult{" +
                "rc=" + rc +
                ", ideas=" + ideas +
                '}';
    }
}
