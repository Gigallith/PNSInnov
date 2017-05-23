package fr.unice.polytech.rmi;

import fr.unice.polytech.Project;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author Marion
 */
public class RmiServer {

    public static void main(String[] args) throws RemoteException {
        Project project = new Project();
        RmiRequest rmiRequestImplement = new RmiRequestImplement(project);



    }
}
