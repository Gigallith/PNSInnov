package fr.unice.polytech.transmission.requests;

import fr.unice.polytech.Idea;
import fr.unice.polytech.Student;
import fr.unice.polytech.transmission.Type;

/**
 * Created by user on 26/04/2017.
 */
public class JoinIdea implements Request {

    private final Idea idea;
    private final Student student;

    public JoinIdea() {
        this(new Student(), new Idea());
    }

    public JoinIdea(Student student, Idea idea) {
        this.idea = idea;
        this.student = student;
    }

    public Type getType() {
        return Type.JOIN;
    }

    public Idea getIdea() {
        return idea;
    }

    public Student getStudent() {
        return student;
    }
}
