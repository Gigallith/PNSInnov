package fr.unice.polytech.transmission.answers;

import java.io.Serializable;

/**
 * Created by user on 02/05/2017.
 */
public class RespondingCode implements Serializable {
    int code;

    public RespondingCode() {
        this(0);
    }

    public RespondingCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "RespondingCode{" +
                "code=" + code +
                '}';
    }

    public int getCode() {
        return code;
    }
}
