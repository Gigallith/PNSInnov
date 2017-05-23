package fr.unice.polytech.rmi;

import java.io.IOException;
import java.rmi.*;
/**
 * @author Marion
 */
public interface RimRequest extends Remote{

    public void add() throws IOException;
    public void join() throws IOException, ClassNotFoundException;

}

