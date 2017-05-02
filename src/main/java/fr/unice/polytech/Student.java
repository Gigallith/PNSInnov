package fr.unice.polytech;

/**
 * Created by user on 25/04/2017.
 */
public class Student {
    private final String name;
    private final String mail;

    public Student() {
        this("","");
    }

    public Student(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }
}
