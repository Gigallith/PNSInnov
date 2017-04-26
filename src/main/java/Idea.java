import java.io.Serializable;
import java.util.List;

/**
 * Created by user on 25/04/2017.
 */
public class Idea implements Serializable {

    String description;
    List<Techno> technos;
    Student author;
}
