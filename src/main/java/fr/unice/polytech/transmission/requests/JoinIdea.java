package fr.unice.polytech.transmission.requests;

import fr.unice.polytech.Idea;
import fr.unice.polytech.Student;
import fr.unice.polytech.transmission.Type;

/**
 * Created by user on 26/04/2017.
 */
public class JoinIdea extends Request {
    private final Idea idea;
    private final Student student;

    public JoinIdea(Idea idea, Student student) {
        super(Type.JOIN);
        this.idea = idea;
        this.student = student;
    }
}
