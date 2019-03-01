import java.util.ArrayList;
import java.util.HashSet;

public class Photos{
    private String Orienation;
    private int ID;
    private HashSet<String> tags = new HashSet<>();

    Photos(String Orienation, int ID, HashSet<String> tags ){
        this.Orienation = Orienation;
        this.ID = ID;
        this.tags = tags;

    }

    public String getOrienation() {return Orienation;}
    public int ID() {return ID;}

    public HashSet<String> getTags() {
        return tags;
    }
}
