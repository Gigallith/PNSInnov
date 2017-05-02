package fr.unice.polytech.transmission.requests;

import fr.unice.polytech.transmission.Type;

/**
 * Created by user on 26/04/2017.
 */
public class Request {
    private final Type type;

    public Request(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
