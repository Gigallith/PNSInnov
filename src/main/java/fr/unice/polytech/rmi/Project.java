package fr.unice.polytech.rmi;

import java.rmi.*;
/**
 * @author Marion
 */
public interface Project extends Remote{

    public void add() throws RemoteException;
    public void join() throws RemoteException;

}

