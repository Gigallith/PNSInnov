package fr.unice.polytech.transmission.answers;

/**
 * Created by user on 02/05/2017.
 */
public class RespondingCode {
    int code;

    public RespondingCode() {
        this(0);
    }

    public RespondingCode(int code) {
        this.code = code;
    }


    public int getCode() {
        return code;
    }
}
