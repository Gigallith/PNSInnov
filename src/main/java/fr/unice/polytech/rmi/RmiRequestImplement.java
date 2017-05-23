package fr.unice.polytech.rmi;

import java.io.IOException;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;


/**
 * Created by user on 23/05/2017.
 */
public class RmiRequestImplement extends UnicastRemoteObject implements RimRequest {


    RmiRequestImplement() throws RemoteException {
        super();
    }

    @Override
    public void add() throws IOException {

    }

    @Override
    public void join() throws IOException, ClassNotFoundException {

    }
}
