package fr.unice.polytech.transmission.answers;

import fr.unice.polytech.Project;
import fr.unice.polytech.Student;
import fr.unice.polytech.transmission.Type;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 02/05/2017.
 */
public class ListParticipantsResult implements Answer {

    private final RespondingCode rc;
    private final List<Student> participants;

    public ListParticipantsResult() { this(new RespondingCode(), new ArrayList<Student>());
    }

    public ListParticipantsResult(RespondingCode rc, List<Student> participants) {
        this.participants = participants;
        this.rc = rc;
    }

    public Type getType() {
        return Type.PARTICIPANT_LIST;
    }
}
