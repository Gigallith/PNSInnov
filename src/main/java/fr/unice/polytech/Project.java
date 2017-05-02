package fr.unice.polytech;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by user on 26/04/2017.
 */
public class Project {
    private final Map<Idea,List<Student>> projects;


    public Project() {
        projects = new HashMap<Idea, List<Student>>();
    }

    public Set<Idea> getIdeaSet() {
        return projects.keySet();
    }
}
