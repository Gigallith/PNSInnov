package fr.unice.polytech;

import java.io.Serializable;
import java.util.*;

/**
 * Created by user on 26/04/2017.
 */
public class Project implements Serializable {
    private final Map<Idea,List<Student>> projects;


    public Project() {
        projects = new HashMap<Idea, List<Student>>();
    }

    public Set<Idea> getIdeaSet() {
        return projects.keySet();
    }


    public void addStudentToAProject(Idea idea, Student student) {
        this.projects.get(idea).add(student);
    }

    public List<Student> getStudentListOfAProject(Idea idea) {
        return this.projects.get(idea);
    }

    public void addIdea(Idea idea) {
        this.projects.put(idea, new ArrayList<Student>());
    }
}
