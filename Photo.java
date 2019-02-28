import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Photo {
    private String Orienation;
    private int ID;
    private Set<String> tags = new HashSet<>();

    Photo(String Orienation, int ID, Set<String> tags ){
        this.Orienation = Orienation;
        this.ID = ID;
        this.tags = tags;

    }

    public String getOrienation() {return Orienation;}
    public int ID() {return ID;}

    public Set<String> getTags() {
        return tags;
    }
}