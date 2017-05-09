package fr.unice.polytech;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 25/04/2017.
 */
public class Idea implements Serializable {

    private final String description;
    private final List<Techno> technos;
    private final Student author;

    public Idea() {this("", new ArrayList<Techno>(), new Student());}

    public Idea(String description, List<Techno> technos, Student author) {
        this.description = description;
        this.technos = technos;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Idea{" +
                "description='" + description + '\'' +
                ", technos=" + technos +
                ", author=" + author +
                '}';
    }
}
