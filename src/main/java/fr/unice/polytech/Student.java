package fr.unice.polytech;

import java.io.Serializable;

/**
 * Created by user on 25/04/2017.
 */
public class Student implements Serializable{
    private final String name;
    private final String mail;

    public Student() {
        this("","");
    }

    public Student(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
